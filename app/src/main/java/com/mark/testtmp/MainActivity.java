package com.mark.testtmp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById( R.id.markView ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("test", "markView click()");
            }
        });

        findViewById( R.id.button ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarkView mark = findViewById( R.id.markView );
                mark.setShadow( 1 );
            }
        });
        findViewById( R.id.button10 ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarkView mark = findViewById( R.id.markView );
                mark.setShadow( 10 );
            }
        });
        findViewById( R.id.button100 ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarkView mark = findViewById( R.id.markView );
                mark.setShadow( 100 );
            }
        });


    }
}