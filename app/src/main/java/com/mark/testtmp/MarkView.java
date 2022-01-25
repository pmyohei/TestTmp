package com.mark.testtmp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;

public class MarkView extends View {
    private final Paint paint;

    float mRadius =  0.0f;

    private int shadowColor = Color.RED;

    /*
     *　レイアウトから生成時用
     */
    public MarkView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        paint = new Paint();
        paint.setColor( Color.WHITE );
        paint.setAntiAlias(true);
    }

    /*
     *　コードから生成時用
     */
    public MarkView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor( Color.WHITE );
        paint.setStrokeWidth( 110 );
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

        //paint.setShadowLayer( (width / 4f), width / 4, getHeight() / 4, Color.RED );
        paint.setShadowLayer( (width / 3f), 0, 0, shadowColor );

        //paint.setColor(getResources().getColor(R.color.mark_5));
        canvas.drawCircle(width / 2, getHeight() / 2, (width / 3f), paint);
    }

    public void setShadow(){

        shadowColor = Color.BLUE;
        invalidate();
    }

}
