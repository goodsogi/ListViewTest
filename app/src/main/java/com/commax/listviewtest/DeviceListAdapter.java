package com.commax.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by bagjeong-gyu on 2016. 8. 22..
 */
public class DeviceListAdapter extends ArrayAdapter<Device> {


    private final LayoutInflater mLayoutInflater;
    private final List<Device> mDatas;


    public DeviceListAdapter(Context context, int resource, List<Device> devices) {
        super(context, resource, devices);
        mLayoutInflater = LayoutInflater.from(context);
        mDatas = devices;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.list_item_device,
                    parent, false);
        }


        TextView deviceType = PlusViewHolder.get(convertView, R.id.deviceType);
        deviceType.setText(mDatas.get(position).getDeviceType());




        return convertView;
    }



}
