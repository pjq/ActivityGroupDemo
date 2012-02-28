package me.pjq.ActivityGroupDemo;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityB extends BaseActivity implements OnClickListener {
	private Button mLayoutBButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.layout_b);

		initUI();
		setClickListener();
	}

	private void initUI() {
		mLayoutBButton = (Button) findViewById(R.id.layout_b_button);
	}

	private void setClickListener() {
		mLayoutBButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		int id = v.getId();

		switch (id) {
		case R.id.layout_b_button: {

			break;
		}

		default:
			break;
		}
	}

}
