package com.example.rumi.daggerdemo;

/**
 * Created by aakash on 2/19/18.
 */

public class User2 {
    public String id;
    public String address;

    public User2(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "User2{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public User2(String id, String address){

        this.id= id;
        this.address=address;
    }

}
