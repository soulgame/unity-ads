package com.unity3d.ads.android.view;

import android.content.Context;
import android.widget.RelativeLayout;

public class UnityAdsRelativeLayout extends RelativeLayout {

	protected RelativeLayout rootLayout = null;
	
	public UnityAdsRelativeLayout(Context cx) {
		super(cx);
	}

	public UnityAdsRelativeLayout(Context cx, RelativeLayout root) {
		super(cx);
		rootLayout = root;
	}

	protected int dp2px(float dp) {
		final float density = getContext().getResources().getDisplayMetrics().density;
		return (int) (dp * density + 0.5f);
	}
	
	public RelativeLayout getRoot() {
		if (null == rootLayout) {
			return this;
		}
		return rootLayout;
	}
	
}
