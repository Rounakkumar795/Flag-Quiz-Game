package com.example.flagquizgame;

public class FlagsModel {
    private int flag_id;
    private String flag_name,flag_image;

    public FlagsModel() {
    }

    public FlagsModel(int flag_id, String flaf_name, String flag_image) {
        this.flag_id = flag_id;
        this.flag_name = flaf_name;
        this.flag_image = flag_image;
    }

    public int getFlag_id() {
        return flag_id;
    }

    public void setFlag_id(int flag_id) {
        this.flag_id = flag_id;
    }

    public String getFlag_name() {
        return flag_name;
    }

    public void setFlaf_name(String flaf_name) {
        this.flag_name = flaf_name;
    }

    public String getFlag_image() {
        return flag_image;
    }

    public void setFlag_image(String flag_image) {
        this.flag_image = flag_image;
    }
}
