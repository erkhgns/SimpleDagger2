package com.erkhgns.dagger2;

import com.erkhgns.dagger2.BloodType.A_Blood;
import com.erkhgns.dagger2.BloodType.B_Blood;

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
