package com.android.dagger.module;

import com.android.dagger.entity.Orange;
import com.android.dagger.entity.OrangeInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Description: <AppleModule2><br>
 * Author:      gxl<br>
 * Date:        2019/5/17<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
@Module
public class AppleModule2 {
    @Provides
    public Orange providerOrange(OrangeInfo orangeInfo){
        return new Orange(orangeInfo);
    }
}
