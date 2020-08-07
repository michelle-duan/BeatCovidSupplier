package com.michelleduan.beatcovidsupplier;

import com.rey.material.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.michelleduan.beatcovidsupplier.Model.Users;
import com.michelleduan.beatcovidsupplier.Prevalent.Prevalent;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    private Button joinNowButton, loginButton;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinNowButton = findViewById(R.id.main_join_now_btn);
        loginButton = findViewById(R.id.main_login_btn);
        loadingBar = new ProgressDialog(this);

        Paper.init(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        joinNowButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        String UsernameKey = Paper.book().read(Prevalent.UsernameKey);
        String UserPasswordKey = Paper.book().read(Prevalent.UserPasswordKey);

        if (UsernameKey != "" && UserPasswordKey != ""){
            if (!TextUtils.isEmpty(UsernameKey) && !TextUtils.isEmpty(UsernameKey)){
                AllowAccess(UsernameKey, UserPasswordKey);

//                loadingBar.setTitle("Already logged in");
//                loadingBar.setMessage("Logging in");
//                loadingBar.setCanceledOnTouchOutside(false);
//                loadingBar.show();
            }
        }
    }

    private void AllowAccess(final String username, final String password) {
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.child("Users").child(username).exists()){
                    Users usersData = snapshot.child("Users").child(username).getValue(Users.class);

                    if (usersData.getUsername().equals(username)){
                        if (usersData.getPassword().equals(password)){
//                            Toast.makeText(MainActivity.this, "Already Logged in", Toast.LENGTH_SHORT).show();
//                            loadingBar.dismiss();

                            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                            Prevalent.currentOnlineUser = usersData;
                            startActivity(intent);
                        }else{
//                            loadingBar.dismiss();
                            Toast.makeText(MainActivity.this, "Incorrect password", Toast.LENGTH_SHORT).show();
                        }
                    }
                }else{
                    Toast.makeText(MainActivity.this, "This is no account under this username.", Toast.LENGTH_SHORT).show();
//                    loadingBar.dismiss();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}