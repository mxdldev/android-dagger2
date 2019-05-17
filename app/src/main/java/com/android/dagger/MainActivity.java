package com.android.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.dagger.component.DaggerAppleComponent;
import com.android.dagger.contract.Fruit;
import com.android.dagger.entity.Apple;
import com.android.dagger.entity.Orange;
import com.android.dagger.module.AppleModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @Inject
    public Fruit mFruit;

    @Inject
    public Apple mApple;

    @Inject
    public Orange mOrange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DaggerAppleComponent.create().inject(this);
        DaggerAppleComponent.builder().appleModule(new AppleModule()).build().inject(this);
        if(mFruit == null){
            Log.v(TAG,"fruit is null");
        }else{
            Log.v(TAG,"fruit is not null");
            Log.v(TAG, mFruit.getColor()+":"+mFruit.size);
        }

        if(mApple == null){
            Log.v(TAG,"apple is null");
        }else{
            Log.v(TAG,"apple is not null");
            Log.v(TAG, mApple.getColor()+":"+mApple.size);
        }
        Log.v(TAG, "orange:"+mOrange.getColor()+":"+mOrange.size);
    }
    public static void main(String[] args){

        System.out.println("ok");
    }
}
