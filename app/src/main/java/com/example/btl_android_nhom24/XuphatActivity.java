package com.example.btl_android_nhom24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class XuphatActivity extends AppCompatActivity {
    ListView lvxuphat;
    ArrayList<xuphat> arrayxuphat;
    xuphatadapter xpadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_xuphat);
        Anhxa2();
        xpadapter=new xuphatadapter(this,R.layout.activity_xuphat,arrayxuphat);
        lvxuphat.setAdapter(xpadapter);
    }
    private void Anhxa2 (){
        lvxuphat =(ListView) findViewById(R.id.listviewxuphat);
       arrayxuphat=new ArrayList<>();
       arrayxuphat.add(new xuphat("1. Lỗi chuyển làn không có tín hiệu báo trước - không xi-nhan","Đối với  tô:\n" +
               "\n" +
               "- Phạt tiền từ 400.000 - 600.000 đồng (Điểm a, Khoản 2, Điều 5).\n" +
               "\n" +
               "- Phạt tiền từ 3.000.000 - 5.000.000 đồng nếu vi phạm trên đường cao tốc (Điểm g, Khoản 5), đồng thời tước quyền sử dụng GPLX từ 1 - 3 tháng.\n" +
               "\n" +
               "Đối với xe máy:\n" +
               "\n" +
               "- Phạt tiền từ 100.000 - 200.000 đồng (Điểm i, Khoản 1, Điều 6)."));
       arrayxuphat.add(new xuphat("2. Lỗi chuyển hướng không có tín hiệu báo hướng rẽ","- Phạt 800.000 - 1.000.000 đồng đối xe ô tô (Điểm c, Khoản 3, Điều 5).\n" +
               "\n" +
               "- Phạt 400.000 - 600.000 đồng đối với xe máy (Điểm a, Khoản 3, Điều 6)."));
       arrayxuphat.add(new xuphat("3. Lỗi vượt đèn đỏ, đèn vàng","- Phạt tiền từ 4.000.000 - 6.000.000 đồng đối với ôtô (Điểm đ, Khoản 34, Điều 2, Nghị định 123/2021/NĐCP sửa đổi và bổ sung mới từ Điểm a, Khoản 5, Điều 5, Nghị định 100). Đồng thời, tước quyền sử dụng GPLX từ 1 - 3 tháng hoặc từ 2 - 4 tháng nếu gây tai nạn (Điểm b, c, Khoản 11, Điều 5).\n" +
               "\n" +
               "- Phạt tiền từ 800.000 - 1.000.000 đồng đối với xe máy (Điểm g, Khoản 34, Điều 2 Nghị định 123, sửa đổi, bổ sung từ Điểm e, Khoản 4, Điều 6 của Nghị định 100). Bên cạnh đó, người vi phạm còn bị tước quyền sử dụng GPLX từ 1 - 3 tháng."));
       arrayxuphat.add(new xuphat("4. Lỗi đi sai làn, không đúng đúng phần đường hoặc làn đường quy định","Đối với xe ôtô:\n" +
               "\n" +
               "- Phạt tiền từ 3.000.000 - 5.000.000 đồng (Điểm đ, Khoản 5, Điều 5), tước GPLX từ 1 - 3 tháng.\n" +
               "\n" +
               "- Phạt tiền từ 10.000.000 - 12.000.000 đồng nếu gây tai nạn giao thông (Điểm a, Khoản 7, Điều 5), đồng thời tước GPLX từ 2 - 4 tháng.\n" +
               "\n" +
               "Đối với xe máy:\n" +
               "\n" +
               "- Phạt tiền từ 400.000 - 600.000 đồng (Điểm g, Khoản 3, Điều 6).\n" +
               "\n" +
               "- Phạt tiền từ 4.000.000 - 5.000.000 đồng nếu gây tai nạn giao thông (Điểm b, Khoản 7, Điều 6) đồng thời tước quyền sử dụng GPLX 2 - 4 tháng.\n"));
       arrayxuphat.add(new xuphat("5. Lỗi đi ngược chiều của đường một chiều, đi ngược chiều trên đường có biển \"cấm đi ngược chiều\"","Đối với xe ô tô:\n" +
               "\n" +
               "- Phạt tiền từ 3.000.000 - 5.000.000 đồng (Điểm c, Khoản 5, Điều 5), tước GPLX từ 2 - 4 tháng.\n" +
               "\n" +
               "- Phạt tiền từ 10.000.000 - 12.000.000 đồng nếu gây tai nạn giao thông (Điểm a, Khoản 7, Điều 5), tước GPLX từ 2 - 4 tháng.\n" +
               "\n" +
               "- Phạt tiền từ 16.000.000 - 18.000.000 đồng nếu đi ngược chiều trên đường cao tốc, lùi xe trên đường cao tốc (Điểm a, Khoản 8, Điều 5), tước quyền sử dụng GPLX từ 5 - 7 tháng.\n" +
               "\n" +
               "Đối với xe máy:\n" +
               "\n" +
               "- Phạt tiền từ 1.000.000 - 2.000.000 đồng (Khoản 5, Điều 6), tước quyền sử dụng GPLX từ 1 - 3 tháng.\n" +
               "\n" +
               "- Phạt tiền từ 4.000.000 - 5.000.000 đồng nếu gây tai nạn giao thông (Điểm b, Khoản 7, Điều 6), tước quyền sử dụng GPLX 2 - 4 tháng."));
    }
}