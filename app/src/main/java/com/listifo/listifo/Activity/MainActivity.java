package com.listifo.listifo.Activity;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.listifo.listifo.Adapter.AdapterIcon;
import com.listifo.listifo.Adapter.AdapterSpa;
import com.listifo.listifo.Adapter.AdapterTrade;
import com.listifo.listifo.Model.IconModel;
import com.listifo.listifo.Model.ModelSpa;
import com.listifo.listifo.Model.ModelTrading;
import com.listifo.listifo.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private AdapterIcon adapterIcon;
    private List<IconModel> iconModels;

    // trading rv
    private List<ModelTrading> modelTradings;
    private AdapterTrade adapterTrade;
    private RecyclerView.LayoutManager tlayoutManager;
    private RecyclerView trecyclerView;

    // spa rv
    private List<ModelSpa> modelSpas;
    private AdapterSpa adapterSpa;
    private RecyclerView.LayoutManager sLayoutManager;
    private RecyclerView sRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // RecyclerView Call

        recyclerView = findViewById(R.id.rcvOne);
        layoutManager = new GridLayoutManager(getApplication(),3);
        recyclerView.setLayoutManager(layoutManager);
        diplay();
        homePageDisplay();

        // rv trading

        trecyclerView = findViewById(R.id.rcvTrad);
        tlayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        trecyclerView.setLayoutManager(tlayoutManager);
        trading();
        listTrading();


        //rv  spa

        sRecyclerView = findViewById(R.id.rcvBeaytySpa);
        sLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        sRecyclerView.setLayoutManager(sLayoutManager);

        spaRv();
        listSpaBeauty();

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


    public void diplay(){

        iconModels = new ArrayList<>();
        adapterIcon = new AdapterIcon(getApplication(),iconModels);
        recyclerView.setAdapter(adapterIcon);


    }


    // rv trading

    public void trading(){

        modelTradings = new ArrayList<>();
        adapterTrade = new AdapterTrade(getApplication(),modelTradings);
        trecyclerView.setAdapter(adapterTrade);


    }


    public void spaRv(){

        modelSpas = new ArrayList<>();
        adapterSpa = new AdapterSpa(getApplication(),modelSpas);
        sRecyclerView.setAdapter(adapterSpa);


    }


    public void homePageDisplay() {

        int[] image = new int[]{
                R.drawable.ic_status,
                R.drawable.ic_status,
                R.drawable.ic_status,
                R.drawable.ic_status,
                R.drawable.ic_status,
                R.drawable.ic_status,

        };

        String[] title = new String[]

                {

                        "Listifo","Application","Beauty Spa","Listifo","Listifo","Listifo"


                };
        IconModel iconModel;
        for (int i = 0; i < image.length; i++) {
            iconModel = new IconModel(title[i], image[i]);
            iconModels.add(iconModel);
        }
        adapterIcon.notifyDataSetChanged();
    }


//rv tranding

    public void listTrading() {

        int[] imageTrading = new int[]{
                R.drawable.banner_120,
                R.drawable.spa,
                R.drawable.banner_120,
                R.drawable.banner_120,
                R.drawable.banner_120,
                R.drawable.banner_120,

        };

        String[] title = new String[]

                {

                        "Listifo","app","Beauty Spa","Listifo","Listifo","Listifo"


                };
        ModelTrading mdt;
        for (int i = 0; i < imageTrading.length; i++) {
            mdt = new ModelTrading(title[i], imageTrading[i]);
            modelTradings.add(mdt);
        }
        adapterTrade.notifyDataSetChanged();
    }

    //  spa
    public void listSpaBeauty() {

        int[] imageSpa = new int[]{
                R.drawable.banner_120,
                R.drawable.ic_status,
                R.drawable.spa,
                R.drawable.spa,
                R.drawable.spa,
                R.drawable.spa,



        };

        String[] title = new String[]

                {"spa","app","Beauty Spa","Listifo","Listifo","Listifo"};
        ModelSpa spa;
        for (int i = 0; i < imageSpa.length; i++) {
            spa = new ModelSpa(title[i], imageSpa[3]);
            modelSpas.add(spa);
        }
        adapterSpa.notifyDataSetChanged();
    }








}
