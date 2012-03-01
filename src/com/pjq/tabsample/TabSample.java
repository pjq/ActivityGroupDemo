package com.pjq.tabsample;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.content.Intent;

public class TabSample extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TabHost tabHost = getTabHost();       
      
      tabHost.addTab(tabHost.newTabSpec("tab1")
              .setIndicator("OPT")
              .setContent(new Intent(this, TabGroup1Activity.class)));
      
      tabHost.addTab(tabHost.newTabSpec("tab2")
              .setIndicator("EDIT")
              .setContent(new Intent(this, TabGroup2Activity.class)));
      
      tabHost.setCurrentTab(1); 
      
    }
}