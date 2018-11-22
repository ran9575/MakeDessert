package com.ran9575.makedessert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Menu01Item {
    String title;
    int resId;

    public Menu01Item(String title) {
        this.title = title;
    }

    public Menu01Item(String title, int resId) {
        this.title = title;
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
