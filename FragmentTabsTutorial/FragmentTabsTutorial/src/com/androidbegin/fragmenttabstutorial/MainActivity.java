package com.androidbegin.fragmenttabstutorial;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
	// Declare Tab Variable
	Tab tab;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Create an actionbar
		ActionBar actionBar = getActionBar();

		// Hide Actionbar Icon
		actionBar.setDisplayShowHomeEnabled(false);

		// Hide Actionbar Title
		actionBar.setDisplayShowTitleEnabled(false);

		// Create Actionbar Tabs
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Create first Tab
		tab = actionBar.newTab().setTabListener(new FragmentTab1());
		// Create your own custom icon
		tab.setIcon(R.drawable.tab1);
		actionBar.addTab(tab);

		// Create Second Tab
		tab = actionBar.newTab().setTabListener(new FragmentTab2());
		// Set Tab Title
		tab.setText("Tab2");
		actionBar.addTab(tab);

		// Create Third Tab
		tab = actionBar.newTab().setTabListener(new FragmentTab3());
		// Set Tab Title
		tab.setText("Tab3");
		actionBar.addTab(tab);
	}
}
