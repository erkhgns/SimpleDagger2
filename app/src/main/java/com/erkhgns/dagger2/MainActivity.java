package com.erkhgns.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Body body = createBody();

        Log.e("blood type: ", body.getBlood().getKindOfBlood());

    }

    private Body createBody() {
        Doctor doctor = DaggerDoctor.create();
        return doctor.injectBlood();

    }
}
