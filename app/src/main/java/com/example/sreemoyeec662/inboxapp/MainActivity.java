package com.example.sreemoyeec662.inboxapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        InboxFragment inboxFragment = new InboxFragment();
        fragmentTransaction.replace(R.id.fragment_container, inboxFragment);
        fragmentTransaction.commit();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ComposeActivity.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_search) {
            Toast.makeText(this, "Search menu is clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (id) {
            case R.id.inbox:
                InboxFragment inboxFragment = new InboxFragment();
                fragmentTransaction.replace(R.id.fragment_container, inboxFragment);
                fragmentTransaction.commit();
                break;
            case R.id.snooze:
                Toast.makeText(this, "Snoozed is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.done:
                Toast.makeText(this, "Done is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.drafts:
                Toast.makeText(this, "Drafts is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sent:
                Toast.makeText(this, "Sent is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.reminders:
                Toast.makeText(this, "Reminders is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bin:
                Toast.makeText(this, "Bin is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.spam:
                Toast.makeText(this, "Spam is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.trips:
                Toast.makeText(this, "Trips is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.saved:
                Toast.makeText(this, "Saved is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.purchases:
                Toast.makeText(this, "Purchases is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.finance:
                Toast.makeText(this, "Finance is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.social:
                Toast.makeText(this, "Social is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.updates:
                Toast.makeText(this, "Updates is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.promos:
                Toast.makeText(this, "Promos is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(this, "Settings is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help_feedback:
                Toast.makeText(this, "Help and feedback is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
