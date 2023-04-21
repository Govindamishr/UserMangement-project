package com.geekster.govinda.user_management_System.entity;

public class Student {
    private int userId;
    private String name;

    private String userName;

    private String address;

    private String  phone ;


    // default constructor

    public Student(){

    }

    public Student(int userId, String name, String userName, String address, String phone) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.phone = phone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
