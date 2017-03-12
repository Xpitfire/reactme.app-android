package com.dork.app.react.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dork.app.react.R;
import com.dork.app.react.fragment.MyActsFragment;
import com.dork.app.react.fragment.UserFragment;
import com.dork.app.react.fragment.WildActsFragment;
import com.dork.app.react.model.ActMessage;
import com.dork.app.react.model.User;
import com.dork.app.react.util.AppSettings;
import com.google.firebase.auth.FirebaseAuth;

import org.apache.commons.lang3.NotImplementedException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements UserFragment.OnListFragmentInteractionListener, WildActsFragment.OnListFragmentInteractionListener {

    private static final String TAG = "reactMe:MainActivity";

    private AppSettings mSettings;

    // Icons source: https://icons8.com
    // <a href="https://icons8.com/web-app/5572/Home">Home icon credits</a>

    @BindView(R.id.activity_main__view_pager) ViewPager mViewPager;
    @BindView(R.id.activity_main__toolbar) Toolbar mToolbar;
    @BindView(R.id.activity_main__tab_layout) TabLayout mTabLayout;
    @BindView(R.id.activity_main__fab) FloatingActionButton mFab;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__main);
        ButterKnife.bind(this);
        mSettings = new AppSettings(this);

        setSupportActionBar(mToolbar);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReactActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
    }

    private void logout() {
        mSettings.resetSettings();
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu__main_swipe, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.activity_main__menu_item__option) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onListFragmentInteraction(User user) {
        Log.i(TAG, user.getUsername());
        Intent intent = new Intent(this, ChatDetailActivity.class);
        intent.putExtra("username", user.getUsername());
        intent.putExtra("email", user.getEmail());
        intent.putExtra("id", user.getId());
        startActivity(intent);
    }

    @Override
    public void onListFragmentInteraction(ActMessage message) {
        Log.i(TAG, message.getDescription());
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).

            if (position == 0) return new WildActsFragment();
            if (position == 1) return UserFragment.newInstance(1);
            if (position == 2) return new MyActsFragment();

            throw new NotImplementedException("Unknown tab position!");
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.activity_main__pager_title__act_wild);
                case 1:
                    return getString(R.string.activity_main__pager_title__friends);
                case 2:
                    return getString(R.string.activity_main__pager_title__my_acts);
            }
            return null;
        }

    }
}
