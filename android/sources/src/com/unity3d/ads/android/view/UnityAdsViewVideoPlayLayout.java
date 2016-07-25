package com.unity3d.ads.android.view;

import com.unity3d.ads.android.video.UnityAdsVideoView;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class UnityAdsViewVideoPlayLayout extends UnityAdsRelativeLayout {
	
	private UnityAdsVideoView unityAdsVideoView = null;
	private TextView unityAdsVideoBufferingText = null;
	private LinearLayout unityAdsVideoCountDown = null;
	private TextView unityAdsVideoTimeLeftText = null;
	private TextView unityAdsVideoSkipText = null;
	private UnityAdsButtonAudioToggleLayout unityAdsAudioToggleView = null;

	public UnityAdsViewVideoPlayLayout(Context context, RelativeLayout root) {
		super(context, root);
		// TODO Auto-generated constructor stub
		init();
	}
	
	public UnityAdsViewVideoPlayLayout(Context context) {
		super(context);
		init();
	}
	
	public UnityAdsVideoView getUnityAdsVideoView() {
		return unityAdsVideoView;
	}
	
	public TextView getUnityAdsVideoBufferingText() {
		return unityAdsVideoBufferingText;
	}
	
	public LinearLayout getUnityAdsVideoCountDown() {
		return unityAdsVideoCountDown;
	}
	
	public TextView getUnityAdsVideoTimeLeftText() {
		return unityAdsVideoTimeLeftText;
	}
	
	public TextView getUnityAdsVideoSkipText() {
		return unityAdsVideoSkipText;
	}
	
	public UnityAdsButtonAudioToggleLayout getUnityAdsAudioToggleView() {
		return unityAdsAudioToggleView;
	}
	
	private void init() {
		getRoot().setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		getRoot().setBackgroundColor(Color.parseColor("#FF000000"));
		getRoot().setClickable(false);
		
		unityAdsVideoView = new UnityAdsVideoView(getContext());
		RelativeLayout.LayoutParams unityAdsVideoViewLayoutParams = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		unityAdsVideoViewLayoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
		unityAdsVideoView.setLayoutParams(unityAdsVideoViewLayoutParams);
		unityAdsVideoView.setPadding(0, 0, 0, 0);
		unityAdsVideoView.setClickable(false);
		getRoot().addView(unityAdsVideoView);
		
		LinearLayout linearLayout = new LinearLayout(getContext());
		linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		linearLayout.setOrientation(LinearLayout.HORIZONTAL);
		getRoot().addView(linearLayout);
		
		RelativeLayout relativeLayout = new RelativeLayout(getContext());
		relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 0.5f));
		relativeLayout.setGravity(Gravity.LEFT);
		linearLayout.addView(relativeLayout);
		
		unityAdsVideoSkipText = new TextView(getContext());
		RelativeLayout.LayoutParams unityAdsVideoSkipTextLayoutParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		int unityAdsVideoSkipTextLayoutParamsMargin = dp2px(4.0f);
		unityAdsVideoSkipTextLayoutParams.leftMargin = unityAdsVideoSkipTextLayoutParamsMargin;
		unityAdsVideoSkipTextLayoutParams.topMargin = dp2px(3.0f);
		unityAdsVideoSkipTextLayoutParams.setMarginStart(unityAdsVideoSkipTextLayoutParamsMargin);
		unityAdsVideoSkipText.setLayoutParams(unityAdsVideoSkipTextLayoutParams);
		unityAdsVideoSkipText.setPadding(0, 0, dp2px(15.0f), dp2px(11.0f));
		unityAdsVideoSkipText.setTextColor(Color.WHITE);
		unityAdsVideoSkipText.setClickable(true);
		relativeLayout.addView(unityAdsVideoSkipText);
		
		unityAdsVideoBufferingText = new TextView(getContext());
		LinearLayout.LayoutParams unityAdsVideoBufferingTextLayoutParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 0.5f);
		unityAdsVideoBufferingTextLayoutParams.rightMargin = dp2px(3.0f);
		unityAdsVideoBufferingTextLayoutParams.topMargin = (dp2px(3.0f));
		unityAdsVideoBufferingTextLayoutParams.setMarginEnd(dp2px(3.0f));
		unityAdsVideoBufferingText.setLayoutParams(unityAdsVideoBufferingTextLayoutParams);
		unityAdsVideoBufferingText.setGravity(Gravity.RIGHT);
		unityAdsVideoBufferingText.setPadding(0, 0, 0, 0);
		unityAdsVideoBufferingText.setTextColor(Color.WHITE);
		unityAdsVideoBufferingText.setText("Buffering...");
		linearLayout.addView(unityAdsVideoBufferingText);
		
		unityAdsVideoCountDown = new LinearLayout(getContext());
		RelativeLayout.LayoutParams unityAdsVideoCountDownLayoutParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		unityAdsVideoCountDownLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		unityAdsVideoCountDownLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_END);
		unityAdsVideoCountDownLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		unityAdsVideoCountDownLayoutParams.rightMargin = dp2px(3.0f);
		unityAdsVideoCountDownLayoutParams.bottomMargin = dp2px(3.0f);
		unityAdsVideoCountDownLayoutParams.setMarginEnd(dp2px(3.0f));
		unityAdsVideoCountDown.setLayoutParams(unityAdsVideoCountDownLayoutParams);
		unityAdsVideoCountDown.setPadding(0, 0, 0, 0);
		getRoot().addView(unityAdsVideoCountDown);
		
		TextView unityAdsVideoTimeLeftPrefix = new TextView(getContext());
		LinearLayout.LayoutParams unityAdsVideoTimeLeftPrefixLayoutParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		unityAdsVideoTimeLeftPrefix.setLayoutParams(unityAdsVideoTimeLeftPrefixLayoutParams);
		unityAdsVideoTimeLeftPrefix.setPadding(0, 0, 0, 0);
		unityAdsVideoTimeLeftPrefix.setTextColor(Color.WHITE);
		unityAdsVideoTimeLeftPrefix.setText("his video ends in ");
		unityAdsVideoCountDown.addView(unityAdsVideoTimeLeftPrefix);
		
		unityAdsVideoTimeLeftText = new TextView(getContext());
		LinearLayout.LayoutParams unityAdsVideoTimeLeftTextLayoutParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		unityAdsVideoTimeLeftTextLayoutParams.leftMargin = dp2px(2.0f);
		unityAdsVideoTimeLeftTextLayoutParams.rightMargin = dp2px(2.0f);
		unityAdsVideoTimeLeftText.setLayoutParams(unityAdsVideoTimeLeftTextLayoutParams);
		unityAdsVideoTimeLeftText.setPadding(0, 0, 0, 0);
		unityAdsVideoTimeLeftText.setTextColor(Color.WHITE);
		unityAdsVideoCountDown.addView(unityAdsVideoTimeLeftText);
		
		TextView unityAdsVideoTimeLeftSuffix = new TextView(getContext());
		LinearLayout.LayoutParams unityAdsVideoTimeLeftSuffixLayoutParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		unityAdsVideoTimeLeftSuffix.setLayoutParams(unityAdsVideoTimeLeftSuffixLayoutParams);
		unityAdsVideoTimeLeftSuffix.setPadding(0, 0, 0, 0);
		unityAdsVideoTimeLeftSuffix.setTextColor(Color.WHITE);
		unityAdsVideoTimeLeftSuffix.setText("seconds");
		unityAdsVideoCountDown.addView(unityAdsVideoTimeLeftSuffix);
		
		unityAdsAudioToggleView = new UnityAdsButtonAudioToggleLayout(getContext());
		RelativeLayout.LayoutParams unityAdsAudioToggleViewLayoutParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		unityAdsAudioToggleViewLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
		unityAdsAudioToggleViewLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_START);
		unityAdsAudioToggleViewLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		unityAdsAudioToggleView.setLayoutParams(unityAdsAudioToggleViewLayoutParams);
		getRoot().addView(unityAdsAudioToggleView);
	}

}
