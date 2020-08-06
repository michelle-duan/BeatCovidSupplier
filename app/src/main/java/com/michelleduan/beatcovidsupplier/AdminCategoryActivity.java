package com.michelleduan.beatcovidsupplier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView facemask, gloves, thermometer, glasses,isolationmask, others;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        facemask = (ImageView)findViewById(R.id.facemask);
        gloves = (ImageView)findViewById(R.id.gloves);
        thermometer = (ImageView)findViewById(R.id.thermometer);
        glasses = (ImageView)findViewById(R.id.glasses);
        isolationmask = (ImageView)findViewById(R.id.isolationmask);
        others = (ImageView)findViewById(R.id.otherproducts);

        facemask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Face Mask");
                startActivity(intent);
            }
        });

        gloves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Gloves");
                startActivity(intent);
            }
        });

        thermometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Thermometer");
                startActivity(intent);
            }
        });

        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Glasses");
                startActivity(intent);
            }
        });

        isolationmask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Isolation Mask");
                startActivity(intent);
            }
        });

        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Other Products");
                startActivity(intent);
            }
        });
    }
}

