package com.mark.testtmp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class IconTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_test);

        findViewById( R.id.card ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("test", "通過チェック");

                //FrameLayout frame_node = findViewById( R.id.frame_node );
                ConstraintLayout frame_node = findViewById( R.id.cl_center );

                LayoutInflater inflater = LayoutInflater.from( frame_node.getContext() );
                inflater.inflate(R.layout.inflate_node, frame_node, true);
                //inflater.inflate(R.layout.inflate_node_tmp2, frame_node, true);

            }
        });


    }
}