package com.sourcekode.practo.practo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class DrawerNavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    List<Doctor> listdoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        listdoc = new ArrayList<>();
        listdoc.add(new Doctor("Audiologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Allergist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Anesthesiologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Cardiologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Dentist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Dermatologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Endocrinologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Epidemiologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Gynecologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Immunologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Infectious Disease Specialist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Internal Medicine Specialist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Medical Geneticist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Microbiologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Neonatologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Neurologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Neurosurgeon",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Obstetrician",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Oncologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Orthopedic Surgeon",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("ENT Specialist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Pediatrician",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Physiologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Plastic Surgeon",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Podiatrist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Psychiatrist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Radiologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Rheumatologist",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Surgeon",R.drawable.ic_launcher_foreground));
        listdoc.add(new Doctor("Urologist",R.drawable.ic_launcher_foreground));


        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,listdoc);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(myAdapter);
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
        getMenuInflater().inflate(R.menu.drawer_navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
