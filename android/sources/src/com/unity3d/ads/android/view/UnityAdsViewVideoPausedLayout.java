package com.unity3d.ads.android.view;

import android.content.Context;
import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class UnityAdsViewVideoPausedLayout extends UnityAdsRelativeLayout {

	public UnityAdsViewVideoPausedLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}
	
	public UnityAdsViewVideoPausedLayout(Context context, RelativeLayout root) {
		super(context, root);
		init();
	}
	
	private void init() {
		LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		getRoot().setLayoutParams(layoutParams);
		getRoot().setBackgroundColor(Color.parseColor("#A9000000"));
		
		UnityAdsButtonPauseLayout unityAdsPauseButton = new UnityAdsButtonPauseLayout(getContext());
		int unityAdsPauseButtonWH = dp2px(120.0f);
		RelativeLayout.LayoutParams unityAdsPauseButtonLayoutParams = new RelativeLayout.LayoutParams(unityAdsPauseButtonWH, unityAdsPauseButtonWH);
		unityAdsPauseButtonLayoutParams.addRule(CENTER_IN_PARENT);
		unityAdsPauseButton.setLayoutParams(unityAdsPauseButtonLayoutParams);
		getRoot().addView(unityAdsPauseButton);
		
		TextView unityadsTapToContinue = new TextView(getContext());
		RelativeLayout.LayoutParams unityadsTapToContinueLayoutParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		unityadsTapToContinueLayoutParams.addRule(CENTER_HORIZONTAL);
		unityadsTapToContinueLayoutParams.addRule(ALIGN_PARENT_BOTTOM);
		unityadsTapToContinueLayoutParams.bottomMargin = dp2px(45.0f);
		unityadsTapToContinue.setLayoutParams(unityadsTapToContinueLayoutParams);
		unityadsTapToContinue.setTextColor(Color.parseColor("#FFFFFFFF"));
		unityadsTapToContinue.setText("Video paused. Tap screen to continue watching.");
		getRoot().addView(unityadsTapToContinue);
		
	}

}
