package me.pjq.ActivityGroupDemo;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityC extends BaseActivity implements OnClickListener {
	private Button mLayoutCButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.layout_c);

		initUI();
		setClickListener();
	}

	private void initUI() {
		mLayoutCButton = (Button) findViewById(R.id.layout_c_button);
	}

	private void setClickListener() {
		mLayoutCButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		int id = v.getId();

		switch (id) {
		case R.id.layout_c_button: {

			break;
		}

		default:
			break;
		}
	}

}

