package com.example.btl_android_nhom24;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class xuphatadapter  extends BaseAdapter {
    private Context context;
    private int layout;
    private List<xuphat> xuphatList;

    public xuphatadapter(Context context, int layout, List<xuphat> xuphatList) {
        this.context = context;
        this.layout = layout;
        this.xuphatList = xuphatList;
    }

    @Override
    public int getCount() {
        return xuphatList.size();
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
        TextView txttenphat=(TextView) view.findViewById(R.id.texttenxuphat);
        TextView txtloitien=(TextView) view.findViewById(R.id.textxuphattien);
        xuphat xuphat=xuphatList.get(i);
        txttenphat.setText(xuphat.getTenxuphat());
        txtloitien.setText(xuphat.getLoaiphat());
        return view;
    }
}
