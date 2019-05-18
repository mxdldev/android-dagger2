package com.android.dagger.component;

import com.android.dagger.entity.Banana;
import com.android.dagger.module.BananaModule;

import dagger.Component;
import dagger.Provides;

@Component(modules = {BananaModule.class})
public interface Bcomponent {
    public Banana banana();
}
