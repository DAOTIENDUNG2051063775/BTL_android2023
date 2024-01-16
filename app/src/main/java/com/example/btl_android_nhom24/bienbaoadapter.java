package com.example.btl_android_nhom24;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class bienbaoadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<bienbao> bienbaoList;

    public bienbaoadapter(Context context, int layout, List<bienbao> bienbaoList) {
        this.context = context;
        this.layout = layout;
        this.bienbaoList = bienbaoList;
    }

    @Override
    public int getCount() {
        return bienbaoList.size();
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

        TextView txtTen=(TextView) view.findViewById(R.id.textten);
        TextView txtloai=(TextView) view.findViewById(R.id.textloai);
        TextView txtmota=(TextView) view.findViewById(R.id.textmota);
        ImageView imgh=(ImageView) view.findViewById(R.id.hinhi);
        bienbao bienbao=bienbaoList.get(i);
        txtTen.setText(bienbao.getTen());
        txtloai.setText(bienbao.getPhanloai());
        txtmota.setText(bienbao.getGioithieu());
        imgh.setImageResource(bienbao.getHinh());
        return view;

    }
}

