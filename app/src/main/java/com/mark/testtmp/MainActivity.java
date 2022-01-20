package com.mark.testtmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

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
                Intent intent = new Intent( MainActivity.this, SizeTestActivity.class );
                startActivity( intent );
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



    }
}