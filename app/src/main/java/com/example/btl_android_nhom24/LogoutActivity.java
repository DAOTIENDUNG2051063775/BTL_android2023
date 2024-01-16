package com.example.btl_android_nhom24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.ktx.Firebase;

public class LogoutActivity extends AppCompatActivity {
    private FirebaseAuth mFirebaseAuth;
    private TextView memail;
    private ImageView backL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        mFirebaseAuth=FirebaseAuth.getInstance();
        memail=findViewById(R.id.emailm);
        backL=findViewById(R.id.backL);
        backL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {LogoutActivity.this.finish();
            }
        });

    }
    @Override
    protected void  onStart(){
        super.onStart();
        FirebaseUser mFirebaseUser =mFirebaseAuth.getCurrentUser();
        if(mFirebaseUser!=null){
            memail.setText(mFirebaseUser.getEmail());
        }else {
            startActivity(new Intent(LogoutActivity.this,LoginActivity.class));
            finish();
        }
    }
    public void Logout(View view){
        mFirebaseAuth.signOut();
        startActivity(new Intent(LogoutActivity.this,LoginActivity.class));
        finish();
    }
}