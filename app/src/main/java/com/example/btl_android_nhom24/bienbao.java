package com.example.btl_android_nhom24;

public class bienbao {
    private String Ten;
    private  String phanloai;
    private String gioithieu;
    private int hinh;

    public bienbao(String ten, String phanloai, String gioithieu, int hinh) {
        Ten = ten;
        this.phanloai = phanloai;
        this.gioithieu = gioithieu;
        this.hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getPhanloai() {
        return phanloai;
    }

    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }

    public String getGioithieu() {
        return gioithieu;
    }

    public void setGioithieu(String gioithieu) {
        this.gioithieu = gioithieu;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}

