package org.folug.consumi;



import java.util.List;
import org.folug.consumi.model.Rifornimento;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class RifornimentiRowAdapter extends ArrayAdapter<Rifornimento> {

	public RifornimentiRowAdapter(Context context, int resource, List<Rifornimento> objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see android.widget.ArrayAdapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		Rifornimento r = getItem(position);
		convertView = inflater.inflate(android.R.layout.simple_list_item_2, null);
		TextView uptext = (TextView)convertView.findViewById(android.R.id.text1);
		uptext.setText(r.getCarburante().name());
		TextView downtext = (TextView)convertView.findViewById(android.R.id.text2);
		downtext.setText("data");
		return convertView;
	}

	
	
}
