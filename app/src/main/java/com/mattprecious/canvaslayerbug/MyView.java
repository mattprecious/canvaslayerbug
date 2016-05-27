package com.mattprecious.canvaslayerbug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;

public final class MyView extends View {
  private final Paint paint;

  public MyView(Context context, AttributeSet attrs) {
    super(context, attrs);

    paint = new Paint();
    paint.setColorFilter(new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.SRC_IN));
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    canvas.drawColor(Color.GREEN);

    canvas.saveLayer(0, 0, canvas.getWidth(), canvas.getHeight(), paint, Canvas.ALL_SAVE_FLAG);
    canvas.restore();
  }
}
