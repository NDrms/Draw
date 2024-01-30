package com.example.qw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

public class Basic extends View {
    public Basic(Context context){
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);

        Paint p = new Paint();
        p.setARGB(255,255,0,0);
        canvas.drawPaint(p);
        p.setARGB(255,0,0,0);
        p.setTextSize(100);
        canvas.drawText("Краски",50, 100,p);
    }
}
