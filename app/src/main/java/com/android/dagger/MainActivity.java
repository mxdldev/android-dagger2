package com.android.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.dagger.component.DaggerAcomponent;
import com.android.dagger.contract.Fruit;
import com.android.dagger.entity.Apple;
import com.android.dagger.entity.Banana;
import com.android.dagger.entity.Orange;
import com.android.dagger.module.AppleModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @Inject
    public Banana mBanana;

//    @Inject
//    public Fruit mFruit;
//
//    @Inject
//    public Apple mApple;
//
//    @Inject
//    public Orange mOrange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DaggerAcomponent.builder().bcomponent(n).inject(this);
       //DaggerAcomponent.create().inject(this);
        //DaggerAcomponent.builder().build().inject(this);
        //DaggerAppleComponent.create().inject(this);
        //DaggerAppleComponent.builder().appleModule(new AppleModule()).build().inject(this);
//        if(mFruit == null){
//            Log.v(TAG,"fruit is null");
//        }else{
//            Log.v(TAG,"fruit is not null");
//            Log.v(TAG, mFruit.getColor()+":"+mFruit.size);
//        }
//
//        if(mApple == null){
//            Log.v(TAG,"apple is null");
//        }else{
//            Log.v(TAG,"apple is not null");
//            Log.v(TAG, mApple.getColor()+":"+mApple.size);
//        }
//        Log.v(TAG, "orange:"+mOrange.getColor()+":"+mOrange.size);
        if(mBanana == null){
            Log.v("MYTAG","banana is null");
        }else{
            Log.v("MYTAG","banana is not null");
            Log.v("MYTAG",mBanana.toString());
        }
    }
    public static void main(String[] args){

        System.out.println("ok");
    }
}
