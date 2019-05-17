package com.android.dagger.module;

import com.android.dagger.contract.Fruit;
import com.android.dagger.entity.Apple;

import dagger.Module;
import dagger.Provides;

/**
 * Description: <不带参数实例化对象><br>
 * Author:      gxl<br>
 * Date:        2019/5/17<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
@Module
public class AppleModule {
    @Provides
    public Fruit providerFriit(){
       return new Apple(12,"红色的");
    }
}
