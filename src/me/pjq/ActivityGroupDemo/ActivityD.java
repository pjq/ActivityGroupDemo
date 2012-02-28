package me.pjq.ActivityGroupDemo;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityD extends BaseActivity implements OnClickListener {
	private Button mLayoutDButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.layout_d);

		initUI();
		setClickListener();
	}

	private void initUI() {
		mLayoutDButton = (Button) findViewById(R.id.layout_d_button);
	}

	private void setClickListener() {
		mLayoutDButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		int id = v.getId();

		switch (id) {
		case R.id.layout_d_button: {

			break;
		}

		default:
			break;
		}
	}

}
