package com.example.raj.volleytest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by raj on 2/1/16.
 */
public class Stationary implements Parcelable {
    private String imgUrl;
    private String name;
    private String desc;
    private Long price;
    private String qty;
    public Stationary(){
        
    }
    public Stationary(String name,String qty,Long price){
            this.name=name;
            this.qty=qty;
            this.price=price;
    }

    protected Stationary(Parcel in) {
     //   imgUrl = in.readString();
        name = in.readString();
      //  desc = in.readString();
        qty = in.readString();
        price=in.readLong();
    }

    public static final Creator<Stationary> CREATOR = new Creator<Stationary>() {
        @Override
        public Stationary createFromParcel(Parcel in) {
            return new Stationary(in);
        }

        @Override
        public Stationary[] newArray(int size) {
            return new Stationary[size];
        }
    };

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }


    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
       // parcel.writeString(imgUrl);
        parcel.writeString(name);
     //   parcel.writeString(desc);
        parcel.writeString(qty);
        parcel.writeLong(price);
    }
}
