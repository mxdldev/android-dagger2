package com.android.dagger.module;

import com.android.dagger.contract.Fruit;
import com.android.dagger.entity.Apple;

import dagger.Module;
import dagger.Provides;

/**
 * Description: <带参数实例化对象><br>
 * Author:      gxl<br>
 * Date:        2019/5/17<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
@Module
public class AppleModule1 {
    @Provides
    public Apple providerFrit(int size){
       return new Apple(size,"红色的");
    }

    @Provides
    public int providerSize(){
        return 1000;
    }
}
