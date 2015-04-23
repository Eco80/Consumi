package org.folug.consumi.elencorifornimenti;

import java.text.SimpleDateFormat;
import java.util.List;

import org.folug.consumi.R;
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
		convertView = inflater.inflate(R.layout.rifornimenti_row, null);
		TextView descrizione = (TextView)convertView.findViewById(R.id.tvTipoRifornimento);
		descrizione.setText(r.getCarburante().name());
		TextView data = (TextView)convertView.findViewById(R.id.tvData);
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		String d = format1.format(r.getData().getTime());
		data.setText(d);
		return convertView;
	}

	
	
}
