package me.kai.buildingblocks.ui.activity;

import android.os.Bundle;

import butterknife.ButterKnife;
import me.kai.buildingblocks.R;
import me.kai.buildingblocks.ui.activity.base.ToolbarActivity;
import me.kai.buildingblocks.ui.fragment.PrefsFragment;

public class PrefsActivity extends ToolbarActivity {
    @Override
    protected int getLayoutResource() {
        return R.layout.activity_prefs;
    }

    @Override
    public boolean canBack() {
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        setTitle(getString(R.string.settings_title));
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_frame, new PrefsFragment())
                .commit();
    }
}