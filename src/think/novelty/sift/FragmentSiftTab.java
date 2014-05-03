package think.novelty.sift;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentSiftTab extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main_sift_tab, container, false);
		
		TextView textView = (TextView) view.findViewById(R.id.tvSift);
		textView.setText(getString(R.string.main_sift_tab_title));

		return view;
	}
}
