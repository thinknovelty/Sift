package think.novelty.adapters;

import java.util.List;

import think.novelty.objects.SiftObject;
import think.novelty.sift.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SiftListAdapter extends ArrayAdapter<SiftObject> {
	private final Context mContext;
	private List<SiftObject> mItems;

	public SiftListAdapter(Context context, List<SiftObject> items) {
		super(context, R.layout.listview_sift_row, items);
		mContext = context;
		mItems = items;
	}
	
	public void addList(SiftObject item) {
		mItems.add(item);
		this.notifyDataSetChanged();
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.listview_sift_row, parent, false);
		TextView tvName = (TextView)rowView.findViewById(R.id.tvName);
		TextView tvDescription = (TextView)rowView.findViewById(R.id.tvDescription);
		TextView tvPrice = (TextView)rowView.findViewById(R.id.tvPrice);
		SiftObject item = mItems.get(position);
		
		if(item != null) {
			tvName.setText(item.getName());
			tvDescription.setText(item.getDescription());
			tvPrice.setText(item.getPriceString());
		}

		return rowView;
	}
}
