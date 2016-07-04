package com.leohan.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * 绘制文字
 * // 第一类
 * public void drawText (String text, float x, float y, Paint paint)
 * public void drawText (String text, int start, int end, float x, float y, Paint paint)
 * public void drawText (CharSequence text, int start, int end, float x, float y, Paint paint)
 * public void drawText (char[] text, int index, int count, float x, float y, Paint paint)
 * <p/>
 * // 第二类
 * public void drawPosText (String text, float[] pos, Paint paint)
 * public void drawPosText (char[] text, int index, int count, float[] pos, Paint paint)
 * <p/>
 * // 第三类
 * public void drawTextOnPath (String text, Path path, float hOffset, float vOffset, Paint paint)
 * public void drawTextOnPath (char[] text, int index, int count, Path path, float hOffset, float vOffset, Paint paint)
 * Created by Leo on 16/7/4.
 */
public class CustomView extends View {

    //要绘制的文本
    String str = "ABCDEFGHIJK";
    Paint textPaint;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 初始化画笔
     */
    private void initPaint() {
        textPaint = new Paint();
        textPaint.setColor(Color.RED);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(80);
    }

    public CustomView(Context context) {
        super(context, null);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        initPaint();
        // 第一类drawText
        // 其中x，y两个参数是指定文本绘制两个基线
        // canvas.drawText(str, 1, 3, 400, 1000, textPaint);

        // 第二类drawPosText
//        String str = "SLOOP";
//        canvas.drawPosText(str,new float[]{
//                100,100,    // 第一个字符位置
//                200,200,    // 第二个字符位置
//                300,300,    // ...
//                400,400,
//                500,500
//        },textPaint);

        // 第三类drawTextOnPath
        canvas.translate(getWidth() / 2, getHeight() / 2);
        Path path = new Path();
        for (int i = 0; i <= 7; i++) {
            // 生成7个点，随机生成Y坐标，并连成一条
            path.lineTo(i * 300, (float) Math.random() * 300);
        }
        canvas.drawTextOnPath("生命不息，奋斗不止", path, 0, 0, textPaint);
        canvas.translate(-getWidth() / 2, -getHeight() / 2);
        canvas.drawTextOnPath("生命不息，奋斗不止", path, 0, 0, textPaint);
    }
}
