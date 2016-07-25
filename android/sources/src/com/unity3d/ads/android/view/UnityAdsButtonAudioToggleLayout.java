package com.unity3d.ads.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RotateDrawable;
import android.view.View;
import android.widget.RelativeLayout;


class UnityAdsCloseButtonBackground extends GradientDrawable {

	private Context _context = null;
	private View _view = null;
	
	public UnityAdsCloseButtonBackground(Context context, View view) {
		_context = (context);
		_view = view;
	}
	
	private int dp2px(float dp) {
		final float density = _context.getResources().getDisplayMetrics().density;
		return (int) (dp * density + 0.5f);
	}
	
	@Override
	public void draw(Canvas canvas) {
		super.draw(canvas);
		Paint paint = new Paint();
		int width = _view.getLayoutParams().width;
		int height = _view.getLayoutParams().height;
		int margin = 0; //dp2px(8);
		paint.setColor(Color.WHITE);
		paint.setStyle(Style.STROKE);
		paint.setStrokeWidth(dp2px(2));
		canvas.drawLine(margin, margin, width-margin, height-margin, paint);
		canvas.drawLine(margin, height-margin, width-margin, margin, paint);
	}
}

public class UnityAdsButtonAudioToggleLayout extends UnityAdsRelativeLayout {
	
	private RelativeLayout unityAdsMuteButtonSpeakerWaves = null;
	
	private View unityAdsMuteButtonSpeakerX = null;

	public UnityAdsButtonAudioToggleLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}
	
	public RelativeLayout getUnityAdsMuteButtonSpeakerWaves() {
		return unityAdsMuteButtonSpeakerWaves;
	}
	
	public View getUnityAdsMuteButtonSpeakerX() {
		return unityAdsMuteButtonSpeakerX;
	}
	
	private void init() {
		int pxWH = dp2px(30.0f);
		getRoot().setLayoutParams(new LayoutParams(pxWH, pxWH));
		int pxPadding = dp2px(3.0f);
		getRoot().setPaddingRelative(pxPadding, pxPadding, pxPadding, pxPadding);
		
		View unityadsIconSpeakerTriangle = new View(getContext());
		RelativeLayout.LayoutParams unityadsIconSpeakerTriangleLayoutParams = new RelativeLayout.LayoutParams(pxWH, pxWH);
		int unityadsIconSpeakerTriangleMargin = dp2px(-15.0f);
		unityadsIconSpeakerTriangleLayoutParams.leftMargin = unityadsIconSpeakerTriangleMargin;
		unityadsIconSpeakerTriangleLayoutParams.setMarginStart(unityadsIconSpeakerTriangleMargin);
		unityadsIconSpeakerTriangleLayoutParams.addRule(CENTER_VERTICAL);
		unityadsIconSpeakerTriangle.setLayoutParams(unityadsIconSpeakerTriangleLayoutParams);
		RotateDrawable unityadsIconSpeakerTriangleRotate = new RotateDrawable();
		unityadsIconSpeakerTriangleRotate.setFromDegrees(45.0f);
		unityadsIconSpeakerTriangleRotate.setToDegrees(45.0f);
		unityadsIconSpeakerTriangleRotate.setPivotXRelative(true);
		unityadsIconSpeakerTriangleRotate.setPivotYRelative(true);
		unityadsIconSpeakerTriangleRotate.setPivotX(0.87f);
		unityadsIconSpeakerTriangleRotate.setPivotY(1.4f);
		GradientDrawable unityadsIconSpeakerTriangleShape = new GradientDrawable();
		unityadsIconSpeakerTriangleShape.setShape(GradientDrawable.RECTANGLE);
		unityadsIconSpeakerTriangleShape.setColor(Color.WHITE);
		unityadsIconSpeakerTriangleRotate.setDrawable(unityadsIconSpeakerTriangleShape);
		unityadsIconSpeakerTriangleRotate.setLevel(1);
		unityadsIconSpeakerTriangle.setBackground(unityadsIconSpeakerTriangleRotate);
		getRoot().addView(unityadsIconSpeakerTriangle);
		
		View unityadsIconSpeakerBase = new View(getContext());
		RelativeLayout.LayoutParams unityadsIconSpeakerBaseLayoutParams = new RelativeLayout.LayoutParams(dp2px(10.0f), dp2px(15.0f));
		unityadsIconSpeakerBaseLayoutParams.addRule(ALIGN_LEFT);
		unityadsIconSpeakerBaseLayoutParams.addRule(ALIGN_START);
		unityadsIconSpeakerBaseLayoutParams.addRule(CENTER_VERTICAL);
		unityadsIconSpeakerBase.setLayoutParams(unityadsIconSpeakerBaseLayoutParams);
		GradientDrawable unityadsIconSpeakerBaseShape = new GradientDrawable();
		unityadsIconSpeakerBaseShape.setShape(GradientDrawable.RECTANGLE);
		unityadsIconSpeakerBaseShape.setColor(Color.WHITE);
		unityadsIconSpeakerBase.setBackground(unityadsIconSpeakerBaseShape);
		getRoot().addView(unityadsIconSpeakerBase);
		
		unityAdsMuteButtonSpeakerWaves = new RelativeLayout(getContext());
		RelativeLayout.LayoutParams unityAdsMuteButtonSpeakerWavesLayoutParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		unityAdsMuteButtonSpeakerWavesLayoutParams.addRule(ALIGN_LEFT);
		unityAdsMuteButtonSpeakerWavesLayoutParams.addRule(ALIGN_START);
		unityAdsMuteButtonSpeakerWavesLayoutParams.addRule(CENTER_VERTICAL);
		int unityAdsMuteButtonSpeakerWavesMargin = dp2px(18.0f);
		unityAdsMuteButtonSpeakerWavesLayoutParams.leftMargin = unityAdsMuteButtonSpeakerWavesMargin;
		unityAdsMuteButtonSpeakerWavesLayoutParams.setMarginStart(unityAdsMuteButtonSpeakerWavesMargin);
		unityAdsMuteButtonSpeakerWaves.setLayoutParams(unityAdsMuteButtonSpeakerWavesLayoutParams);
		getRoot().addView(unityAdsMuteButtonSpeakerWaves);
		
		GradientDrawable unityadsIconSpeakerWaves = new GradientDrawable();
		unityadsIconSpeakerWaves.setShape(GradientDrawable.RECTANGLE);
		unityadsIconSpeakerWaves.setColor(Color.WHITE);
		
		View view1 = new View(getContext());
		RelativeLayout.LayoutParams view1LayoutParams = new RelativeLayout.LayoutParams(dp2px(2.0f), dp2px(10.0f));
		view1LayoutParams.addRule(CENTER_VERTICAL);
		view1.setLayoutParams(view1LayoutParams);
		view1.setBackground(unityadsIconSpeakerWaves);
		unityAdsMuteButtonSpeakerWaves.addView(view1);
		
		View view2 = new View(getContext());
		RelativeLayout.LayoutParams view2LayoutParams = new RelativeLayout.LayoutParams(dp2px(2.0f), dp2px(15.0f));
		int view2Margin = dp2px(4.0f);
		view2LayoutParams.leftMargin = view2Margin;
		view2LayoutParams.setMarginStart(view2Margin);
		view2LayoutParams.addRule(CENTER_VERTICAL);
		view2.setLayoutParams(view2LayoutParams);
		view2.setBackground(unityadsIconSpeakerWaves);
		unityAdsMuteButtonSpeakerWaves.addView(view2);
		
		View view3 = new View(getContext());
		RelativeLayout.LayoutParams view3LayoutParams = new RelativeLayout.LayoutParams(dp2px(2.0f), dp2px(24.0f));
		int view3Margin = dp2px(8.0f);
		view3LayoutParams.leftMargin = view3Margin;
		view3LayoutParams.setMarginStart(view3Margin);
		view3LayoutParams.addRule(CENTER_VERTICAL);
		view3.setLayoutParams(view3LayoutParams);
		view3.setBackground(unityadsIconSpeakerWaves);
		unityAdsMuteButtonSpeakerWaves.addView(view3);
		
		unityAdsMuteButtonSpeakerX = new View(getContext());
		int unityAdsMuteButtonSpeakerXWH = dp2px(15.0f);
		RelativeLayout.LayoutParams unityAdsMuteButtonSpeakerXLayoutParams = new RelativeLayout.LayoutParams(unityAdsMuteButtonSpeakerXWH, unityAdsMuteButtonSpeakerXWH);
		int unityAdsMuteButtonSpeakerXMargin = dp2px(18.0f);
		unityAdsMuteButtonSpeakerXLayoutParams.leftMargin = unityAdsMuteButtonSpeakerXMargin;
		unityAdsMuteButtonSpeakerXLayoutParams.setMarginStart(unityAdsMuteButtonSpeakerXMargin);
		unityAdsMuteButtonSpeakerXLayoutParams.topMargin = dp2px(7.5f);
		unityAdsMuteButtonSpeakerX.setLayoutParams(unityAdsMuteButtonSpeakerXLayoutParams);
		unityAdsMuteButtonSpeakerX.setVisibility(GONE);
		UnityAdsCloseButtonBackground unityAdsMuteButtonSpeakerXBG = new UnityAdsCloseButtonBackground(getContext(), unityAdsMuteButtonSpeakerX);
		unityAdsMuteButtonSpeakerX.setBackground(unityAdsMuteButtonSpeakerXBG);
		getRoot().addView(unityAdsMuteButtonSpeakerX);
	}

}
