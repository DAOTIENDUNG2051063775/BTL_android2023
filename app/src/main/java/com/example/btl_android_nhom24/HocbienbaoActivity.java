package com.example.btl_android_nhom24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HocbienbaoActivity extends AppCompatActivity {
    ListView lvbienbao;
    ArrayList<bienbao> arraybienbao;
    bienbaoadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_bienbao);
        Anhxa();
        adapter=new bienbaoadapter(this,R.layout.activity_hocbienbao,arraybienbao);
        lvbienbao.setAdapter(adapter);
    }
    private void Anhxa(){
        lvbienbao =(ListView) findViewById(R.id.listviewbienbao);
        arraybienbao =new ArrayList<>();
        arraybienbao.add(new bienbao("102","Biển cấm","Biển cấm đi ngược chiều",R.drawable.biencamnguoc));
        arraybienbao.add(new bienbao("101","Biển cấm","Biển đường cấm",R.drawable.biencamdo));
        arraybienbao.add(new bienbao("103a","Biển cấm","Biển cấm đỗ ô tô",R.drawable.camdooto));
        arraybienbao.add(new bienbao("218","Biển cảnh báo","Biển có cửa chui",R.drawable.biennguyhiemduongham));
        arraybienbao.add(new bienbao("207c","Biển cảnh báo","Biển giao nhau với đường không ưu tiên",R.drawable.biennguyhiemuutien));
        arraybienbao.add(new bienbao("205","Biển cảnh báo","Biển nguy hiểm",R.drawable.biennguyhiem));
        arraybienbao.add(new bienbao("301a","Biển chỉ dẫn","Biển đi thẳng",R.drawable.bienchidan));
        arraybienbao.add(new bienbao("417","Biển chỉ dẫn","Biển thành phố",R.drawable.bienchidanhn));
        arraybienbao.add(new bienbao("413a","Biển chỉ dẫn","Biển phân lần",R.drawable.bienchidanlan));

    }
}
