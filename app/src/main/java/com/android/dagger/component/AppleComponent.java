package com.android.dagger.component;

import com.android.dagger.MainActivity;
import com.android.dagger.module.AppleModule;
import com.android.dagger.module.AppleModule1;
import com.android.dagger.module.AppleModule2;

import dagger.Component;

/**
 * Description: <AppleComponent><br>
 * Author:      gxl<br>
 * Date:        2019/5/17<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
@Component(modules = {AppleModule.class,AppleModule1.class,AppleModule2.class})
public interface AppleComponent {
    public void inject(MainActivity activity);
}
