package com.commax.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeList();
    }

    private void makeList() {

        ArrayList<Device> devices = getTestDevices();

        ListView deviceList = (ListView) findViewById(R.id.deviceList);
        DeviceListAdapter adapter = new DeviceListAdapter(this, R.layout.list_item_device, devices);

        deviceList.setAdapter(adapter);

    }

    public ArrayList<Device> getTestDevices() {

        ArrayList<Device> devices = new ArrayList<>();

        Device device1 = new Device();
        device1.setDeviceType("디바이스1");
        device1.setProtocolCompany("commax");
        device1.setDeviceCount("1");
        device1.setUartPort("");

        Device device2 = new Device();
        device2.setDeviceType("디바이스2");
        device2.setProtocolCompany("commax");
        device2.setDeviceCount("1");
        device2.setUartPort("");

        Device device3 = new Device();
        device3.setDeviceType("디바이스3");
        device3.setProtocolCompany("commax");
        device3.setDeviceCount("1");
        device3.setUartPort("");


        devices.add(device1);
        devices.add(device2);
        devices.add(device3);

        return devices;
    }
}
