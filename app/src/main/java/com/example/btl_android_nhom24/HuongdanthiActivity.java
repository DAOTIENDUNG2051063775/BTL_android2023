package com.example.btl_android_nhom24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class HuongdanthiActivity extends AppCompatActivity {

    Button btnhgdan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huongdanthi);
        btnhgdan=(Button) findViewById(R.id.btntonhgdan);

        btnhgdan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HuongdanthiActivity.this,HuongdanthichitietActivity.class));
            }
        });
    }
}
