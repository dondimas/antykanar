package net.antykanar.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import net.antykanar.antykanar.R;
import roboguice.activity.RoboActivity;

import java.util.ArrayList;
import java.util.List;

public class EntryActivity extends RoboActivity implements AdapterView.OnItemSelectedListener{

    com.google.android.gms.maps.MapFragment mapFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry_activity);
        initializeAccountSpinner();
    }

    private void initializeAccountSpinner() {
        Spinner selectAccountSpinner = (Spinner) findViewById(R.id.select_account_spinner);
        List<Transport> accounts = getTransportList();
        ArrayAdapter<Transport> accountAdapter = new ArrayAdapter<Transport>(
                this, R.layout.spinner_text, accounts);
        accountAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectAccountSpinner.setAdapter(accountAdapter);
        selectAccountSpinner.setOnItemSelectedListener(this);
    }

    private List<Transport> getTransportList() {
        List<Transport> result = new ArrayList<Transport>();
        result.add(new Transport("Autobus"));
        result.add(new Transport("Tramwaj"));
        return result;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        showTransportNumberSpinner();
    }

    private void showTransportNumberSpinner() {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //To change body of implemented methods use File | Settings | File Templates.
    }


    class Transport {

        public Transport(String name) {
            this.name = name;
        }
        public String  name;

        public String toString() {
            return name;
        }
    }
}
