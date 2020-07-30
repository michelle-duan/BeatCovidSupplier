package com.michelleduan.beatcovidsupplier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView kn95mask, regularmask, thermometer, gloves;
    private ImageView cleargloves, glasses,isolationmask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        kn95mask = (ImageView)findViewById(R.id.kn95mask);
        regularmask = (ImageView)findViewById(R.id.regularmask);
        thermometer = (ImageView)findViewById(R.id.thermometer);
        gloves = (ImageView)findViewById(R.id.gloves);
        cleargloves = (ImageView)findViewById(R.id.cleargloves);
        glasses = (ImageView)findViewById(R.id.glasses);
        isolationmask = (ImageView)findViewById(R.id.isolationmask);

        kn95mask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","N95 Mask");
                startActivity(intent);
            }
        });

        regularmask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Regular Mask");
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

        gloves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Gloves ");
                startActivity(intent);
            }
        });

        cleargloves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Clear Gloves");
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
    }
}

