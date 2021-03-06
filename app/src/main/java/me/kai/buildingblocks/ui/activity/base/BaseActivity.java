package me.kai.buildingblocks.ui.activity.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.kai.buildingblocks.R;

// simple baseactivity without:
// progressbar,
// newrelic,

public class BaseActivity extends AppCompatActivity {

    @Bind(R.id.toolbar) Toolbar toolbar;
    protected int layoutResID = R.layout.activity_base;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutResID);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }
}
