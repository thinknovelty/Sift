package think.novelty.fragments;

import java.util.ArrayList;
import java.util.List;

import think.novelty.adapters.SiftListAdapter;
import think.novelty.objects.SiftObject;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

public class FragmentSiftTab extends ListFragment {
	private SiftListAdapter mAdapter;

	public FragmentSiftTab() {
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		SiftObject item1 = new SiftObject("Pyramid Beer", "Hefeweizen beer brewed in Seattle.", 6.99);
		SiftObject item2 = new SiftObject("Sapporo Beer", "German style barley beer brewed in Japan.", 7.99);
		
		List<SiftObject> items = new ArrayList<SiftObject>();
		items.add(item1);
		items.add(item2);
		
		mAdapter = new SiftListAdapter(getActivity(), items);
		setListAdapter(mAdapter);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
	}
}
