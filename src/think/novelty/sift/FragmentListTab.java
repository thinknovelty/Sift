package think.novelty.sift;


import java.util.ArrayList;
import java.util.List;

import think.novelty.adapters.MainListAdapter;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

public class FragmentListTab extends ListFragment {
	private MainListAdapter mAdapter;

	public FragmentListTab() {
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Temporarily create dummy data
		UserInfo user1 = new UserInfo();
		UserInfo user2 = new UserInfo();
		
		user1.setName("Bobby", "DeArmond");
		user2.setName("Gary", "Roberts");
		List<UserInfo> users = new ArrayList<UserInfo>();
		users.add(user1);
		users.add(user2);
		
		// Setup the adapter
		mAdapter = new MainListAdapter(getActivity(), users);
		this.setListAdapter(mAdapter);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
	}
}
