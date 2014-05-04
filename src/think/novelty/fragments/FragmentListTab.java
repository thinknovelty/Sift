package think.novelty.fragments;


import java.util.ArrayList;
import java.util.List;

import think.novelty.adapters.ListListAdapter;
import think.novelty.objects.UserObject;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

public class FragmentListTab extends ListFragment {
	private ListListAdapter mAdapter;

	public FragmentListTab() {
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Temporarily create dummy data
		UserObject user1 = new UserObject("Bobby", "DeArmond");
		UserObject user2 = new UserObject("Gary", "Roberts");

		List<UserObject> users = new ArrayList<UserObject>();
		users.add(user1);
		users.add(user2);
		
		// Setup the adapter
		mAdapter = new ListListAdapter(getActivity(), users);
		setListAdapter(mAdapter);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
	}
}
