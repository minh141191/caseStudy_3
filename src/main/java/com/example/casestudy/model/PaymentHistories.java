package com.example.casestudy.model;

public class PaymentHistories {
    private Long id;
    private Partner partner;
    private Option option;

    public PaymentHistories() {
    }

    public PaymentHistories(Long id, Partner partner, Option option) {
        this.id = id;
        this.partner = partner;
        this.option = option;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
