package me.pjq.tabsample;

import me.pjq.ActivityGroupDemo.R;
import android.app.Activity;
import android.app.ProgressDialog;
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
public class ArrowsActivity extends Activity {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrowspage);
        
        Button back = (Button) findViewById(R.id.BackButton2);
        Button dialog = (Button) findViewById(R.id.Button01);
        Button select = (Button) findViewById(R.id.Button02);
        
        OnTouchListener backListener = new OnTouchListener() {
            public boolean  onTouch  (View  v, MotionEvent  event) {
                if (event.getAction()==MotionEvent.ACTION_UP){
                	//ProgressDialog pd = ProgressDialog.show(getParent(), "","Loading...", true);
                    finish();
                    //return true;
                }
                return false;
            }
        };
        
        OnTouchListener dialogListener = new OnTouchListener() {
            public boolean  onTouch  (View  v, MotionEvent  event) {
                if (event.getAction()==MotionEvent.ACTION_UP){
                	ProgressDialog pd = ProgressDialog.show(getParent(), "","Loading...", true);
                	pd.setCancelable(true);
                    //return true;
                }
                return false;
            }
        };
        
        OnTouchListener selectListener = new OnTouchListener() {
            public boolean  onTouch  (View  v, MotionEvent  event) {
                if (event.getAction()==MotionEvent.ACTION_UP){
                	Intent edit = new Intent(getParent(), SelectActivity.class);
             		TabGroupActivity parentActivity = (TabGroupActivity)getParent();
             		parentActivity.startChildActivity("SelectActivity", edit);
             		return true;
                }
                return false;
            }
        };
        
        back.setOnTouchListener(backListener);
        dialog.setOnTouchListener(dialogListener);
        select.setOnTouchListener(selectListener);
    }
}