package com.unity3d.ads.android.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RotateDrawable;
import android.view.View;
import android.widget.RelativeLayout;

public class UnityAdsButtonPauseLayout extends UnityAdsRelativeLayout {

	public UnityAdsButtonPauseLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}
	
	private void init() {
		int pxWH = dp2px(120.0f);
		RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(pxWH, pxWH);
		getRoot().setLayoutParams(layoutParams);
		
		GradientDrawable unityadsBackgroundButtonPause = new GradientDrawable();
		unityadsBackgroundButtonPause.setShape(GradientDrawable.OVAL);
		unityadsBackgroundButtonPause.setStroke(dp2px(4.0f), Color.WHITE);
		unityadsBackgroundButtonPause.setColor(Color.parseColor("#90000000"));
		getRoot().setBackground(unityadsBackgroundButtonPause);
		
		int viewWH = dp2px(70.0f);
		View view = new View(getContext());
		RelativeLayout.LayoutParams viewLayoutParams = new RelativeLayout.LayoutParams(viewWH, viewWH);
		int viewMargin = dp2px(48.0f);
		viewLayoutParams.leftMargin = (viewMargin);
		viewLayoutParams.setMarginStart((viewMargin));
		viewLayoutParams.topMargin = dp2px(25.0f);
		view.setLayoutParams(viewLayoutParams);
		GradientDrawable unityadsIconPlayShape = new GradientDrawable();
		unityadsIconPlayShape.setShape(GradientDrawable.RECTANGLE);
		unityadsIconPlayShape.setColor(Color.WHITE);
		RotateDrawable unityadsIconPlayRotate = new RotateDrawable();
		unityadsIconPlayRotate.setFromDegrees(45.0f);
		unityadsIconPlayRotate.setToDegrees(45.0f);
		unityadsIconPlayRotate.setPivotXRelative(true);
		unityadsIconPlayRotate.setPivotYRelative(true);
		unityadsIconPlayRotate.setPivotX(0.13f);
		unityadsIconPlayRotate.setPivotY(-0.4f);
		unityadsIconPlayRotate.setDrawable(unityadsIconPlayShape);
		unityadsIconPlayRotate.setLevel(1);
		view.setBackground(unityadsIconPlayRotate);
		getRoot().addView(view);
	}

}
