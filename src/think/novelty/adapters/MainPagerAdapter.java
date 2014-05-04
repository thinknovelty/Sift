package think.novelty.adapters;

import java.util.Locale;

import think.novelty.fragments.FragmentListTab;
import think.novelty.fragments.FragmentScanTab;
import think.novelty.fragments.FragmentSiftTab;
import think.novelty.sift.R;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainPagerAdapter extends FragmentPagerAdapter {
	private Context mContext;
	private Fragment[] mFragments;
	
	public MainPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
		init();
	}
	
	public void init() {
		if(mFragments == null) {
			mFragments = new Fragment[3];
			mFragments[0] = new FragmentSiftTab();
			mFragments[1] = new FragmentListTab();
			mFragments[2] = new FragmentScanTab();
		}
	}

	@Override
	public Fragment getItem(int position) {
		return mFragments[position];
	}

	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		switch (position) {
			case 0:
				return mContext.getString(R.string.main_sift_tab_title).toUpperCase(l);
			case 1:
				return mContext.getString(R.string.main_list_tab_title).toUpperCase(l);
			case 2:
				return mContext.getString(R.string.main_scan_tab_title).toUpperCase(l);
		}
		return null;
	}
}
