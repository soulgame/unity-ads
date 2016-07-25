package com.unity3d.ads.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import com.unity3d.ads.android.UnityAdsDeviceLog;
import com.unity3d.ads.android.UnityAdsUtils;

public class UnityAdsMuteVideoButton extends RelativeLayout {

	private UnityAdsMuteVideoButtonState _state = UnityAdsMuteVideoButtonState.UnMuted;

	public enum UnityAdsMuteVideoButtonState { UnMuted, Muted }
	private UnityAdsButtonAudioToggleLayout _layout = null;

	public UnityAdsMuteVideoButton(Context context) {
		super(context);
	}

	public UnityAdsMuteVideoButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public UnityAdsMuteVideoButton(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
	}

	public void setLayout (UnityAdsButtonAudioToggleLayout layout) {
		_layout = layout;
	}
	
	public void setState (UnityAdsMuteVideoButtonState state) {
		if (state != null && !state.equals(_state)) {
			_state = state;

			View muted = _layout.getUnityAdsMuteButtonSpeakerX();
			View unmuted = _layout.getUnityAdsMuteButtonSpeakerWaves();

			if (muted != null && unmuted != null) {
				switch (_state) {
					case Muted:
						muted.setVisibility(View.VISIBLE);
						unmuted.setVisibility(View.GONE);
						break;
					case UnMuted:
						muted.setVisibility(View.GONE);
						unmuted.setVisibility(View.VISIBLE);
						break;
					default:
						UnityAdsDeviceLog.debug("Invalid state: " + _state);
						break;
				}
			}

		}
	}
}