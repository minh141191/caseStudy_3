package com.example.casestudy.model;

import java.io.File;
import java.time.LocalDate;

public class Partner {
    private Long id;
    private String email;
    private int gender;
    private LocalDate date_of_birth;
    private String address;
    byte [] image;
    private int height;
    private int weight;
    private String hobby;
    private int status;
    private User user;

    public Partner() {
    }

    public Partner(Long id, String email, int gender, LocalDate date_of_birth, String address, byte[] image, int height, int weight, String hobby, int status, User user) {
        this.id = id;
        this.email = email;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.image = image;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.status = status;
        this.user = user;
    }

    public Partner(String email, int gender, LocalDate date_of_birth, String address, byte[] image, int height, int weight, String hobby, int status, User user) {
        this.email = email;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.image = image;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.status = status;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
