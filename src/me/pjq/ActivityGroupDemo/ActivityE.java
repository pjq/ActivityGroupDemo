package me.pjq.ActivityGroupDemo;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityE extends BaseActivity implements OnClickListener {
	private Button mLayoutFButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.layout_f);

		initUI();
		setClickListener();
	}

	private void initUI() {
		mLayoutFButton = (Button) findViewById(R.id.layout_f_button);
	}

	private void setClickListener() {
		mLayoutFButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		int id = v.getId();

		switch (id) {
		case R.id.layout_f_button: {

			break;
		}

		default:
			break;
		}
	}

}
