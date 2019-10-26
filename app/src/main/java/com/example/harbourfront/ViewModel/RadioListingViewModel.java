package com.example.harbourfront.ViewModel;

import com.example.harbourfront.Models.ProgramsItem;

public class RadioListingViewModel {

    private String name, desc, imgUrl;

    public RadioListingViewModel(ProgramsItem programsItem) {
        name = programsItem.getName();
        desc = programsItem.getDescription();
        imgUrl = programsItem.getProgramimage();
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
