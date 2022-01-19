package com.mark.testtmp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ShadowTextTestView extends androidx.appcompat.widget.AppCompatTextView {
    private final Paint paint;

    float mRadius =  0.0f;

    /*
     *　レイアウトから生成時用
     */
    public ShadowTextTestView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        paint = new Paint();
        paint.setColor( getResources().getColor( R.color.fill ) );
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

        int width = getWidth();

        Log.i("サイズチェック", "onDraw レイアウト確定＝" + width);

        //paint.setShadowLayer( (width / 4f), width / 4, getHeight() / 4, Color.RED );
        paint.setShadowLayer( (width / 5f), 0, 0, Color.RED );

        //paint.setColor(getResources().getColor(R.color.mark_5));
        canvas.drawCircle(width / 2, getHeight() / 2, (width / 2 ), paint);
    }

    public void setShadow(int add){

        paint.setShadowLayer( mRadius, 0, 0, Color.RED );
        invalidate();

        mRadius += add;
    }

}
