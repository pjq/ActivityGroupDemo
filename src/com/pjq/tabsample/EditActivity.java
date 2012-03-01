package com.pjq.tabsample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

/**
 * @author Administrator
 *
 */
public class EditActivity extends ListActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mListContent));   
        ListView lv = getListView();
        lv.setOnItemClickListener(new OnItemClickListener() {
          
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent previewMessage = new Intent(getParent(), ArrowsActivity.class);
            TabGroupActivity parentActivity = (TabGroupActivity)getParent();
            parentActivity.startChildActivity("ArrowsActivity", previewMessage);
          }
          
        });
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //preventing default implementation previous to android.os.Build.VERSION_CODES.ECLAIR
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * Overrides the default implementation for KeyEvent.KEYCODE_BACK 
     * so that all systems call onBackPressed().
     */
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            TabGroupActivity parentActivity = (TabGroupActivity)getParent();
            parentActivity.onBackPressed();
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }
    
    private static String[] mListContent={"Item 1", "Item 2", "Item 3"};
}
