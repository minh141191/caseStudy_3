package com.example.casestudy.model;

import java.time.LocalDateTime;

public class Booking {
    private Long id;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private User user;
    private Partner partner;
    private Option option;
    private LocalDateTime created_date;

    public Booking() {
    }

    public Booking(Long id, LocalDateTime start_date, LocalDateTime end_date, User user, Partner partner, Option option, LocalDateTime created_date) {
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.user = user;
        this.partner = partner;
        this.option = option;
        this.created_date = created_date;
    }

    public Booking(LocalDateTime start_date, LocalDateTime end_date, User user, Partner partner, Option option, LocalDateTime created_date) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.user = user;
        this.partner = partner;
        this.option = option;
        this.created_date = created_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public LocalDateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date) {
        this.created_date = created_date;
    }
}
