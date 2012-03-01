package me.pjq.ActivityGroupDemo;

import java.util.HashMap;

import me.pjq.tabsample.TabSample;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityGroupDemoActivity extends ActivityGroup implements
		OnClickListener {
	private LinearLayout mContainerLayout;
	private LinearLayout mFootViewLayout;

	private TextView mFootViewATextView;
	private TextView mFootViewBTextView;
	private TextView mFootViewCTextView;
	private TextView mFootViewDTextView;

	private Button mLayoutBButton;
	private Button mLayoutCButton;
	private Button mLayoutDButton;
	private Button mLayoutEButton;
	private Button mLayoutFButton;

	private HashMap<String, ActivityHolder> mActivityListHashMap = new HashMap<String, ActivityGroupDemoActivity.ActivityHolder>();

	class ActivityHolder {
		String mId;
		Class<BaseActivity> mActivity;
		Intent mIntent;
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activitygroup);

		initUI();
		setClickListener();
		registerActivityList();
	}

	private void initUI() {
		mContainerLayout = (LinearLayout) findViewById(R.id.content_container);
		mFootViewLayout = (LinearLayout) findViewById(R.id.footview_container);
		mFootViewATextView = (TextView) findViewById(R.id.footview_a);
		mFootViewBTextView = (TextView) findViewById(R.id.footview_b);
		mFootViewCTextView = (TextView) findViewById(R.id.footview_c);
		mFootViewDTextView = (TextView) findViewById(R.id.footview_d);
	}

	private void registerActivityList() {
		if (null == mActivityListHashMap) {
			mActivityListHashMap = new HashMap<String, ActivityGroupDemoActivity.ActivityHolder>();
		}
		ActivityHolder holder = new ActivityHolder();
		holder.mId = ActivityA.TAG;
		holder.mIntent = new Intent(this, ActivityA.class);
		mActivityListHashMap.put(holder.mId, holder);

		holder = new ActivityHolder();
		holder.mId = ActivityB.TAG;
		holder.mIntent = new Intent(this, ActivityB.class);
		mActivityListHashMap.put(holder.mId, holder);

		holder = new ActivityHolder();
		holder.mId = ActivityC.TAG;
		holder.mIntent = new Intent(this, ActivityC.class);
		mActivityListHashMap.put(holder.mId, holder);

		holder = new ActivityHolder();
		holder.mId = ActivityD.TAG;
		holder.mIntent = new Intent(this, ActivityD.class);
		mActivityListHashMap.put(holder.mId, holder);

		holder = new ActivityHolder();
		holder.mId = ActivityE.TAG;
		holder.mIntent = new Intent(this, ActivityE.class);
		mActivityListHashMap.put(holder.mId, holder);

		holder = new ActivityHolder();
		holder.mId = ActivityF.TAG;
		holder.mIntent = new Intent(this, ActivityF.class);
		mActivityListHashMap.put(holder.mId, holder);
	}

	private void setClickListener() {
		mFootViewATextView.setOnClickListener(this);
		mFootViewBTextView.setOnClickListener(this);
		mFootViewCTextView.setOnClickListener(this);
		mFootViewDTextView.setOnClickListener(this);
	}

	// private void updateView(Class<Activity> activity) {
	// mContainerLayout.removeAllViews();
	// // Intent intent = new Intent();
	// // intent.setClass(this, activity.getClass());
	// View v = getLocalActivityManager().startActivity(activity.TAG,
	// new Intent(this, getClass())).getDecorView();
	// mContainerLayout.addView(v);
	// }

	private void showActivity(ActivityHolder activityHolder) {
		if (null == activityHolder) {
			return;
		}

		mContainerLayout.removeAllViews();
		View v = getLocalActivityManager().startActivity(activityHolder.mId,
				activityHolder.mIntent).getDecorView();
		mContainerLayout.addView(v);
	}

	private ActivityHolder findActivityHolder(String key) {
		if (null != mActivityListHashMap) {
			return mActivityListHashMap.get(key);
		} else {
			return null;
		}
	}

	@Override
	public void onClick(View v) {

		int id = v.getId();

		switch (id) {
		case R.id.footview_a: {

			String key = ActivityA.TAG;
			ActivityHolder activityHolder = findActivityHolder(key);
			showActivity(activityHolder);

			break;
		}

		case R.id.footview_b: {
			String key = ActivityB.TAG;
			ActivityHolder activityHolder = findActivityHolder(key);
			showActivity(activityHolder);

			break;
		}

		case R.id.footview_c: {
			String key = ActivityC.TAG;
			ActivityHolder activityHolder = findActivityHolder(key);
			showActivity(activityHolder);

			break;
		}

		case R.id.footview_d: {
			String key = ActivityD.TAG;
			ActivityHolder activityHolder = findActivityHolder(key);
			showActivity(activityHolder);

			Intent intent = new Intent();
			intent.setClass(this, TabSample.class);
			startActivity(intent);

			break;
		}

		default:
			break;
		}

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}

}