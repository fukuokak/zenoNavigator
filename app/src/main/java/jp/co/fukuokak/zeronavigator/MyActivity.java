package jp.co.fukuokak.zeronavigator;

import android.app.ActionBar;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

import jp.co.fukuokak.zeronavigator.listener.LeftDrawerItemClickListener;
import jp.co.fukuokak.zeronavigator.model.CalendarValue;
import jp.co.fukuokak.zeronavigator.model.Human;


public class MyActivity extends BaseActivity {

    //For Navigation Drawer
    Calendar calendar = Calendar.getInstance();
    ArrayList<CalendarValue> cvArray;

    PlaceholderFragment fragment = new PlaceholderFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        fragment.setText1("AAA");
        Human iAmKen = new Human("1", "2", "3");
        fragment.setHuman(iAmKen);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, fragment)
                    .commit();
        }
    }

    public ArrayList<CalendarValue> setCalendarValueList(Calendar calendar) {

        Integer loopCount = 7;
        ArrayList<CalendarValue> calendarList = new ArrayList<CalendarValue>();
        for (int i = 0; i <= loopCount; i++) {
            CalendarValue cv = new CalendarValue(calendar);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            calendarList.add(cv);
        }
        return calendarList;
    }

    public String[] getSelectItemList(ArrayList<CalendarValue> cvArray) {
        ArrayList<String> menuArray = new ArrayList<String>();
        menuArray.add("Welcome");
        for (int i = 0; i < cvArray.size(); i++) {
            menuArray.add(cvArray.get(i).getListText());
        }
        menuArray.add("Optional Menu");
        String[] selectItem = (String[]) menuArray.toArray(new String[0]);
        return selectItem;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
