package com.erkhgns.dagger2;

import android.util.Log;

import java.util.Random;

import dagger.Module;
import dagger.Provides;

@Module
public class RandomInjectionModule {
    public static Blood blood;

    public RandomInjectionModule() {


    }

    @Provides
    static Blood provideBlood(){

        if(blood!=null)
            return blood;

        Random rnd = new Random();
        int rndNumber =rnd.nextInt(2);

        Log.e("rnd", String.valueOf(rndNumber)  );
        switch (rndNumber){
            case 0:
                blood = new A_Blood();
                break;

            case 1:
                blood = new B_Blood();
                break;

            case 2:
                blood = new C_Blood();
                break;
        }

        return blood;


    }


}
