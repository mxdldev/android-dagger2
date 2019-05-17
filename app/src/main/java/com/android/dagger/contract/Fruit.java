package com.android.dagger.contract;

/**
 * Description: <Fruit><br>
 * Author:      gxl<br>
 * Date:        2019/5/17<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class Fruit {
    public int  size;
    public String color;

    public Fruit(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
