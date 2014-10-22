package jp.co.fukuokak.zeronavigator.listener;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import jp.co.fukuokak.zeronavigator.model.CalendarValue;

/**
 * Created by fukuokak on 2014/10/20.
 */
public class LeftDrawerItemClickListener implements ListView.OnItemClickListener {
    private ArrayList<CalendarValue> cvArray;
    private Activity activity ;


    public LeftDrawerItemClickListener(Activity activity ,ArrayList<CalendarValue> cvArray){
        this.cvArray = cvArray ;
        this.activity = activity;

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    private void selectItem(int position) {
        Log.v(cvArray.get(position).getListText(), Integer.toString(position));

    }
}
