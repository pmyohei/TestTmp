package com.mark.testtmp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class ShadowLinearView extends LinearLayout {
    private final Paint paint;

    float mRadius =  0.0f;

    /*
     *　レイアウトから生成時用
     */
    public ShadowLinearView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        paint = new Paint();
        //paint.setColor( getResources().getColor( R.color.fill ) );
        //paint.setColor( Color.TRANSPARENT );
        paint.setColor( Color.WHITE );
        paint.setAntiAlias(true);
    }


    public void setColorID(int colorID){
        paint.setColor(getResources().getColor(colorID));
        invalidate();
    }

    public int getColorHex(){
        return paint.getColor();
    }
    public void setColorHex(int colorHex){
        paint.setColor(colorHex);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        int width = findViewById(R.id.mc_inner).getWidth();

        Log.i("サイズチェック", "ShadowLinearView レイアウト確定＝" + width);

        //paint.setShadowLayer( (width / 4f), width / 4, getHeight() / 4, Color.RED );
        paint.setShadowLayer( (width / 5f), 0, 0, Color.RED );

        //paint.setColor(getResources().getColor(R.color.mark_5));
        canvas.drawCircle(getWidth() / 2f, getHeight() / 2f, (width / 2f), paint);
    }

    public void setShadow(int add){

        paint.setShadowLayer( mRadius, 0, 0, Color.RED );
        invalidate();

        mRadius += add;
    }

}
