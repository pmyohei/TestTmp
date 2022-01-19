package com.mark.testtmp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ViewTreeObserver observer = findViewById( R.id.ShadowTestView ).getViewTreeObserver();
        observer.addOnGlobalLayoutListener(
                new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {

                        Log.i("サイズチェック", "レイアウト確定＝" + findViewById( R.id.ShadowTestView ).getWidth());

                        //レイアウト確定後は、不要なので本リスナー削除
                        findViewById( R.id.ShadowTestView ).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
        );





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

/*
                CardView cv = findViewById( R.id.cv_node );

                Log.i("size", "getWidth=" + cv.getWidth());


                cv.setScaleX( 1f );
                cv.setScaleY( 1f );
*/

                //cv.invalidate();

                //TextView tv = findViewById( R.id.tv );
                //tv.setScaleX( 2f );
                //tv.setScaleY( 2f );
            }
        });

/*        SeekBar sy = (SeekBar) findViewById(R.id.seekBar);
        sy.setMax(100);
        sy.setProgress(50);
        sy.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekbar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekbar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekbar, int i, boolean flag) {

                CardView cv = findViewById( R.id.cv_node );

                Log.i("size", "getWidth=" + cv.getWidth());

                //cv.setMinimumWidth( cv.getWidth() / 2 );

                float value;

                if( i < 50 ){
                    value = (0.9f / 50) * i + 0.1f;
                } else{
                    value = (9f / 50) * (i - 50) + 1;
                }

                Log.i("size", "i=" + i + " value=" + value);

                //cv.setScaleX( value );
                //cv.setScaleY( value );

                ConstraintLayout cl = findViewById( R.id.tmp_node );
                //ConstraintLayout cl = findViewById( R.id.cl_nodeA );
                //CardView cl = findViewById( R.id.card );
                //ConstraintLayout cl = cl2.findViewById( R.id.cl_nodeA );

                cl.setScaleX( value );
                cl.setScaleY( value );

            }
        });*/

    }
}