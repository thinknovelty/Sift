package think.novelty.fragments;

import think.novelty.sift.R;
import think.novelty.sift.R.id;
import think.novelty.sift.R.layout;
import think.novelty.sift.R.string;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentScanTab extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main_scan_tab, container, false);
		
		TextView textView = (TextView) view.findViewById(R.id.tvScan);
		textView.setText(getString(R.string.main_scan_tab_title));

		return view;
	}
}
