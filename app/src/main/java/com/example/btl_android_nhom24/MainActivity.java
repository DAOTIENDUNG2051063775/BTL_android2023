package com.example.btl_android_nhom24;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ImageButton btnthithu,btnHocbienbao,btnthithuchanh,btnxuphat;
    Button btnmyaccount;
    Button homebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homebtn=(Button) findViewById(R.id.homebtn);
        btnmyaccount=(Button) findViewById(R.id.myaccountbtn);
        btnthithu = (ImageButton)  findViewById(R.id.btnThithu);
        btnHocbienbao=(ImageButton)findViewById(R.id.btnHocBienBao);
        btnthithuchanh=(ImageButton)findViewById(R.id.btnThuchanh);
        btnxuphat=(ImageButton) findViewById(R.id.phatbtn);
        btnthithu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this,HomeActivity.class));
            }
        });

        btnmyaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LogoutActivity.class));
            }
        });
        btnHocbienbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,HocbienbaoActivity.class));
            }
        });
        btnthithuchanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,HuongdanthiActivity.class));
            }
        });
        btnxuphat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,XuphatActivity.class));

            }
        });

    }
}