package com.user.globalcare;

public class Doctor_Specility_Data {

    int image_back,front_img;
    String desc;
    String types;

    public Doctor_Specility_Data(int image_back, int front_img, String desc) {
        this.image_back = image_back;
        this.front_img = front_img;
        this.desc = desc;

    }

    public int getImage_back() {
        return image_back;
    }

    public void setImage_back(int image_back) {
        this.image_back = image_back;
    }

    public int getFront_img() {
        return front_img;
    }

    public void setFront_img(int front_img) {
        this.front_img = front_img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

   
}
