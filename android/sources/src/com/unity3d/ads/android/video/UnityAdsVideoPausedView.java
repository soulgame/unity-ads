package com.unity3d.ads.android.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.unity3d.ads.android.UnityAdsUtils;

public class UnityAdsVideoPausedView extends RelativeLayout {
	public UnityAdsVideoPausedView(Context context) {
		super(context);
		createView();
	}

	public UnityAdsVideoPausedView(Context context, AttributeSet attrs) {
		super(context, attrs);
		createView();
	}

	public UnityAdsVideoPausedView(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
		createView();
	}

	private void createView () {
		LayoutInflater inflater = LayoutInflater.from(getContext());
		inflater.inflate(UnityAdsUtils.findResourceId("layout", "unityads_view_video_paused", this.getContext()), this);
	}
}