package me.pjq.ActivityGroupDemo;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityA extends BaseActivity implements OnClickListener {
	private Button mLayoutAButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.layout_a);

		initUI();
		setClickListener();
	}

	private void initUI() {
		mLayoutAButton = (Button) findViewById(R.id.layout_a_button);
	}

	private void setClickListener() {
		mLayoutAButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		int id = v.getId();

		switch (id) {
		case R.id.layout_a_button: {

			break;
		}

		default:
			break;
		}
	}

}
