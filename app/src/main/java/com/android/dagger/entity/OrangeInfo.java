package com.android.dagger.entity;

import javax.inject.Inject;

/**
 * Description: <OrangeInfo><br>
 * Author:      gxl<br>
 * Date:        2019/5/17<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class OrangeInfo {
    public int size;
    public String color;
    @Inject
    public OrangeInfo(){
        this.size = 21111;
        this.color = "黄色";
    }
}
