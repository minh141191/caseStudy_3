package com.example.casestudy.model;

import java.time.LocalDate;

public class User {
    private Long id;
    private String username;
    private String password;
    private String phone_number;
    private String first_name;
    private String last_name;
    private int money;
    private LocalDate register_date;

    public User() {
    }

    public User(String username, String password, String phone_number, String first_name, String last_name) {
        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public User(Long id, String username, String password, String phone_number, String first_name, String last_name, int money, LocalDate register_date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.money = money;
        this.register_date = register_date;
    }

    public User(String username, String password, String phone_number, String first_name, String last_name, int money, LocalDate register_date) {
        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.money = money;
        this.register_date = register_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public LocalDate getRegister_date() {
        return register_date;
    }

    public void setRegister_date(LocalDate register_date) {
        this.register_date = register_date;
    }
}
