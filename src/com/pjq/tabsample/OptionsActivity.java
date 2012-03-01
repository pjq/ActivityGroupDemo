package com.pjq.tabsample;

import me.pjq.ActivityGroupDemo.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

/**
 * @author Administrator
 *
 */
public class OptionsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionspage);
        
        Button back = (Button) findViewById(R.id.BackButton1);
        Button next = (Button) findViewById(R.id.NextButton1);
        
        OnTouchListener backListener = new OnTouchListener() {
                public boolean  onTouch  (View  v, MotionEvent  event) {
                    if (event.getAction()==MotionEvent.ACTION_UP){
                        finish();
                        //return true;
                    }
                    return false;
                }
            };
            
        OnTouchListener nextListener = new OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent event) {
        		 if (event.getAction()==MotionEvent.ACTION_UP){
        			 Intent edit = new Intent(getParent(), EditActivity.class);
             		TabGroupActivity parentActivity = (TabGroupActivity)getParent();
             		parentActivity.startChildActivity("EditActivity", edit);
             		return true;
        		 }
        		 return false;
        	}
        };
        
        back.setOnTouchListener(backListener);
        next.setOnTouchListener(nextListener);
    }
}
