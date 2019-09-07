package com.erkhgns.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {
TextView textView;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        textView = findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Body body = createBody();
                textView.setText(body.getBlood().getKindOfBlood());
            }
        });



        //Log.e("blood type: ", body.getBlood().getKindOfBlood());

    }

    private Body createBody() {
        Doctor doctor = DaggerDoctor.create();
        return doctor.injectBlood();

    }
}
