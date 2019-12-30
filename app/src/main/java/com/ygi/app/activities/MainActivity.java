package com.ygi.app.activities;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.preference.PreferenceManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;

import com.ygi.app.R;
import com.ygi.app.adapters.FragmentsTabAdapter;
import com.ygi.app.fragments.FridayFragment;
import com.ygi.app.fragments.MondayFragment;
import com.ygi.app.fragments.SaturdayFragment;
import com.ygi.app.fragments.SundayFragment;
import com.ygi.app.fragments.ThursdayFragment;
import com.ygi.app.fragments.TuesdayFragment;
import com.ygi.app.fragments.WednesdayFragment;
import com.ygi.app.utils.AlertDialogsHelper;
import com.ygi.app.utils.DailyReceiver;

import java.util.Calendar;



public class MainActivity extends AppCompatActivity {

    private FragmentsTabAdapter adapter;
    private ViewPager viewPager;
    private boolean switchSevenDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAll();
    }


    private void initAll() {
        PreferenceManager.setDefaultValues(this, R.xml.settings, false);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setupFragments();
        setupCustomDialog();


        setDailyAlarm();
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    private void setupFragments() {
        adapter = new FragmentsTabAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        adapter.addFragment(new MondayFragment(), getResources().getString(R.string.monday));
        adapter.addFragment(new TuesdayFragment(), getResources().getString(R.string.tuesday));
        adapter.addFragment(new WednesdayFragment(), getResources().getString(R.string.wednesday));
        adapter.addFragment(new ThursdayFragment(), getResources().getString(R.string.thursday));
        adapter.addFragment(new FridayFragment(), getResources().getString(R.string.friday));
        adapter.addFragment(new SaturdayFragment(), getResources().getString(R.string.saturday));
        adapter.addFragment(new SundayFragment(), getResources().getString(R.string.sunday));
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(day == 1 ? 6 : day - 2, true);
        tabLayout.setupWithViewPager(viewPager);
    }


    private void setupCustomDialog() {
        final View alertLayout = getLayoutInflater().inflate(R.layout.dialog_add_subject, null);
        AlertDialogsHelper.getAddSubjectDialog(MainActivity.this, alertLayout, adapter, viewPager);
    }


    private void setDailyAlarm() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Calendar cur = Calendar.getInstance();

        if (cur.after(calendar)) {
            calendar.add(Calendar.DATE, 1);
        }

        Intent myIntent = new Intent(this, DailyReceiver.class);
        int ALARM1_ID = 10000;
        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                this, ALARM1_ID, myIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager) this.getSystemService(ALARM_SERVICE);
        if (alarmManager != null) {
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);
        }

    }



}