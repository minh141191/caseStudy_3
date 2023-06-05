package com.example.casestudy.model;

import java.util.List;

public class MappingOfPO {
    private Long id;
    private List<Partner> partnerList;
    private List<Option> optionList;

    public MappingOfPO() {
    }

    public MappingOfPO(Long id, List<Partner> partnerList, List<Option> optionList) {
        this.id = id;
        this.partnerList = partnerList;
        this.optionList = optionList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Partner> getPartnerList() {
        return partnerList;
    }

    public void setPartnerList(List<Partner> partnerList) {
        this.partnerList = partnerList;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }
}
