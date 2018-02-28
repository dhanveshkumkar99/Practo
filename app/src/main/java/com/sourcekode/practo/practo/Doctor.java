package com.sourcekode.practo.practo;

/**
 * Created by Dhanvesh on 2/27/2018.
 */

public class Doctor  {

    private String Title;
    private int Thumbnail;


    public Doctor(String title, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
