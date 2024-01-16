package com.example.btl_android_nhom24;



public class huongdan {
    private String tenbai;
    private int imghinh;
    private  String loi;

    public huongdan(String tenbai, int imghinh, String loi) {
        this.tenbai = tenbai;
        this.imghinh = imghinh;
        this.loi = loi;
    }

    public String getTenbai() {
        return tenbai;
    }

    public void setTenbai(String tenbai) {
        this.tenbai = tenbai;
    }

    public int getImghinh() {
        return imghinh;
    }

    public void setImghinh(int imghinh) {
        this.imghinh = imghinh;
    }

    public String getLoi() {
        return loi;
    }

    public void setLoi(String loi) {
        this.loi = loi;
    }
}

