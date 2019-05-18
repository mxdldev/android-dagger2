package com.android.dagger.module;

import com.android.dagger.entity.Banana;

import dagger.Module;
import dagger.Provides;

@Module
public class BananaModule {
    @Provides
    public Banana providerBanana(){
        return new Banana(12,"hahah111111111111111222222222222222221");
    }

}
