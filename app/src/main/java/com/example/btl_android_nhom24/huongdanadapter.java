package com.example.btl_android_nhom24;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class huongdanadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<huongdan> huongdanList;

    public huongdanadapter(Context context, int layout, List<huongdan> huongdanList) {
        this.context = context;
        this.layout = layout;
        this.huongdanList = huongdanList;
    }

    @Override
    public int getCount() {
        return huongdanList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(layout, null);
        TextView txtTenchitiet=(TextView) view.findViewById(R.id.texttenchitiet);
        ImageView hinhchitiet=(ImageView) view.findViewById(R.id.hinhchitiet);
        TextView txtLoi=(TextView) view.findViewById(R.id.textloi);
        huongdan huongdan=huongdanList.get(i);
        txtTenchitiet.setText(huongdan.getTenbai());
        hinhchitiet.setImageResource(huongdan.getImghinh());
        txtLoi.setText(huongdan.getLoi());

        return view;




    }
}
