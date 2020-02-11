package com.example.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridAdapter extends BaseAdapter {

    Context context;
    private final String[] values;
    private final int [] images;
    View view;
    LayoutInflater layoutInflater;

    public GridAdapter(Context context, String[] values, int[] images) {
        this.context = context;
        this.values = values;
        this.images = images;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null)  {
            //view = new View(context);
            convertView = layoutInflater.inflate(R.layout.gridview_item,null);
            holder = new ViewHolder();
            holder.images = convertView.findViewById(R.id.imageView6);
            holder.text= convertView.findViewById(R.id.textView7);
            convertView.setTag(holder);
            //imageView.setImageResource(images[position]);
            //textView.setText(values[position]);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.text.setText(values[position]);
        holder.images.setImageResource(images[position]);

        return convertView;
    }
}
