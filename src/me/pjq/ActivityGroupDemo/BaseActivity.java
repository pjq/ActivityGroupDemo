package me.pjq.ActivityGroupDemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends Activity {
	protected static final String TAG = BaseActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		logI("onCreate");
	}

	protected void logI(String tag, String msg) {
		Log.i(tag, msg);
	}

	protected void logI(String msg) {
		logI(TAG, msg);
	}

}
