package com.example.btl_android_nhom24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HuongdanthichitietActivity extends AppCompatActivity {
    ListView lvhuongdan;
    ArrayList<huongdan> arrayhuongdan;
    huongdanadapter hdadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_chitiet);
        Anhxa1();
        hdadapter=new huongdanadapter(this,R.layout.activity_huongdanthichitiet,arrayhuongdan);
        lvhuongdan.setAdapter(hdadapter);

    }
    private void Anhxa1(){
        lvhuongdan =(ListView) findViewById(R.id.listviewchitiet);
        arrayhuongdan=new ArrayList<>();
        arrayhuongdan.add(new huongdan("Bài số 1: Đi qua hình số 8\n" +
                "Hướng dẫn cách thi:\n" +
                "\n" +
                "Bạn phải nghe hiệu lệnh từ giám khảm phát trên Loa. Khi có lệnh xuất phát mới được cho xe chạy.\n" +
                "Khi có hiệu lệnh xuất phát, điều khiển xe tiến đến cửa vào hình số 8, rẽ phải đi một vòng hình số 8 (vạch đứt đỏ).\n" +
                "Sau đó đi hình số 3 ngược (hình đứt đen)\n" +
                "tiếp tục thực hiện bài số 2\n" +
                "Kích thước hình số 8 :\n" +
                "\n" +
                "Bán kính vòng ngoài là : 3 m\n" +
                "Bán kính vòng trong là : 2,3 m\n" +
                "khoảng cách giữ hai tâm vòng tròn trong là : 5,7 m",R.drawable.hd1," Chạm vạch một lần trừ 05 điểm\n" +
                "chống chân 01 lần trừ 05 điểm\n" +
                "Xe chết máy mỗi lần trừ 05 điểm\n" +
                "Đi ngược hình trừ 25 điểm trượt luôn\n" +
                "Hai bánh ra khỏi hình thi trừ 25 điểm trượt luôn"));
        arrayhuongdan.add(new huongdan("Bài thi số 2 : Đi qua vạch đường thẳng\n" +
                "Hướng dẫn cách thi:\n" +
                "\n" +
                "Phải cho bánh đè qua vạch vàng\n" +
                "Đi thẳng theo hình mũi tên\n" +
                "Giữ đều ga và thẳng lái (tốc độ <20 km/h)\n" +
                "tiến vào bài thi tiếp theo\n" +
                "Kích thước :\n" +
                "\n" +
                "Rộng : 0,6m . Dài : 18m",R.drawable.hd2," Chạm vạch một lần trừ 05 điểm\n" +
                "chống chân 01 lần trừ 05 điểm\n" +
                "Xe chết máy mỗi lần trừ 05 điểm\n" +
                "Hai bánh ra khỏi hình thi trừ 25 điểm trượt luôn"));
        arrayhuongdan.add(new huongdan("Bài thi số 3 : Đi qua đường có vạch cản\n" +
                "\n" +
                "Hướng dẫn cách thi:\n" +
                "\n" +
                "Phải cho bánh đè qua vạch vàng\n" +
                "Đi theo hình mũi tên\n" +
                "Tránh các vạch cản trắng (tốc độ <20 km/h)\n" +
                "tiến vào bài thi tiếp theo\n" +
                "Kích thước :\n" +
                "\n" +
                "Rộng : 5m . Dài : 18m. Khoảng cách giữ các vạch cản : 4,5m",R.drawable.hd3,"Chạm vạch một lần trừ 05 điểm\n" +
                "chống chân 01 lần trừ 05 điểm\n" +
                "Xe chết máy mỗi lần trừ 05 điểm\n" +
                "Hai bánh ra khỏi hình thi trừ 25 điểm trượt luôn"));
        arrayhuongdan.add(new huongdan("Bài thi số 4 : Đi qua đường gồ ghề và kết thúc\n" +
                "\n" +
                "Hướng dẫn cách thi:\n" +
                "\n" +
                "Phải cho bánh đè qua vạch vàng\n" +
                "Giữ đều ga, thẳng lái theo hình mũi tên\n" +
                "tiến xe qua vạch kết thúc\n" +
                "Lưu ý : đi theo đường gồ ghề nên cần giữ tay lái chắc 1 chút , nếu thấy xe yếu cần thêm chút ga để cho xe vượt qua các vạch cản. Khi đi qua vạch kết thúc nếu Trên Loa thông báo :” XE SỐ X THI ĐẠT” thì xin chúc mừng bạn đã qua phần thi thực hành lái xe mô tô A1\n" +
                "Kích thước :\n" +
                "\n" +
                "Rộng : 0,9m . Dài : 15m. Khoảng cách giữ các dải gồ ghề : 1,5m. Chiều cao của gồ ghề : 0,05m",R.drawable.hd4,"Chạm vạch một lần trừ 05 điểm\n" +
                "chống chân 01 lần trừ 05 điểm\n" +
                "Xe chết máy mỗi lần trừ 05 điểm\n" +
                "Hai bánh ra khỏi hình thi trừ 25 điểm trượt luôn\n" +
                "Không hoàn thành bài thi trừ 25 điểm trượt luôn"));
    }
}