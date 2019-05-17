package com.android.dagger.entity;

import com.android.dagger.contract.Fruit;

import javax.inject.Inject;

/**
 * Description: <Orange><br>
 * Author:      gxl<br>
 * Date:        2019/5/17<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Orange extends Fruit {
    @Inject
    public Orange(OrangeInfo orangeInfo) {
        super(orangeInfo.size, orangeInfo.color);
    }

}
