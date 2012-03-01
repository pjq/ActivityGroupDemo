package com.pjq.tabsample;

import android.content.Intent;
import android.os.Bundle;

public class TabGroup2Activity extends TabGroupActivity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startChildActivity("EditActivity", new Intent(this,EditActivity.class));
    }
}
