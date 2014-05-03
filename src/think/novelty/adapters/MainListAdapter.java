package think.novelty.adapters;

import java.util.List;

import think.novelty.sift.R;
import think.novelty.sift.UserInfo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainListAdapter extends ArrayAdapter<UserInfo> {
	private final Context mContext;
	private List<UserInfo> mUsers;

	public MainListAdapter(Context context, List<UserInfo> users) {
		super(context, R.layout.listview_list_row, users);
		mContext = context;
		mUsers = users;
	}
	
	public void addList(UserInfo user) {
		mUsers.add(user);
		this.notifyDataSetChanged();
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.listview_list_row, parent, false);
		TextView tvName = (TextView)rowView.findViewById(R.id.tvName);
		TextView tvDate = (TextView)rowView.findViewById(R.id.tvDate);
		UserInfo user = mUsers.get(position);
		
		if(user != null) {
			tvName.setText(user.getName());
			tvDate.setText("Today");
		}

		return rowView;
	}
}
