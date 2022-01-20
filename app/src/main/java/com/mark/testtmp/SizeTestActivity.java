package com.mark.testtmp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.SeekBar;

public class SizeTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.size_test_activity);

        SeekBar sy = findViewById(R.id.seekBar);
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

                CardView target = findViewById( R.id.card );
                //ConstraintLayout target = findViewById( R.id.cl_node );

                Log.i("size", "getWidth=" + target.getWidth());

                //cv.setMinimumWidth( cv.getWidth() / 2 );

                float value;

                if( i < 50 ){
                    //value = (0.9f / 50) * i + 0.1f;
                    value = (9f / 50) * (i - 50) + 1;
                    value *= -1;
                } else{
                    value = (9f / 50) * (i - 50) + 1;
                }

                Log.i("size", "i=" + i + " value=" + value);

                //cv.setScaleX( value );
                //cv.setScaleY( value );

                //ConstraintLayout cl = findViewById( R.id.tmp_node );
                //ConstraintLayout cl = findViewById( R.id.cl_nodeA );
                //CardView cl = findViewById( R.id.card );
                //ConstraintLayout cl = cl2.findViewById( R.id.cl_nodeA );

                //target.setScaleX( value );
                //target.setScaleY( value );

                ViewGroup.LayoutParams lp = findViewById( R.id.cl_node ).getLayoutParams();

                lp.height = target.getHeight() + (int)value;
                lp.width  = target.getWidth()  + (int)value;

                target.setLayoutParams( lp );
            }
        });


        SeekBar sy2 = findViewById(R.id.seekBar2);
        sy2.setMax(100);
        sy2.setProgress(50);
        sy2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekbar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekbar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekbar, int i, boolean flag) {

                //CardView target = findViewById( R.id.card );
                ConstraintLayout target = findViewById( R.id.cl_node );

                Log.i("size", "getWidth=" + target.getWidth());

                //cv.setMinimumWidth( cv.getWidth() / 2 );

                float value;

                if( i < 50 ){
                    value = (0.9f / 50) * i + 0.1f;
                    //value = (9f / 50) * (i - 50) + 1;
                    //value *= -1;
                } else{
                    value = (9f / 50) * (i - 50) + 1;
                }

                Log.i("size", "i=" + i + " value=" + value);

                //cv.setScaleX( value );
                //cv.setScaleY( value );

                //ConstraintLayout cl = findViewById( R.id.tmp_node );
                //ConstraintLayout cl = findViewById( R.id.cl_nodeA );
                //CardView cl = findViewById( R.id.card );
                //ConstraintLayout cl = cl2.findViewById( R.id.cl_nodeA );

                target.setScaleX( value );
                target.setScaleY( value );

/*                ViewGroup.LayoutParams lp = findViewById( R.id.cl_node ).getLayoutParams();

                lp.height = target.getHeight() + (int)value;
                lp.width  = target.getWidth()  + (int)value;

                target.setLayoutParams( lp );*/
            }
        });
    }
}