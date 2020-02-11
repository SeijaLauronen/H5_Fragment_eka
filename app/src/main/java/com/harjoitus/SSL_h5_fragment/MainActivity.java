package com.harjoitus.SSL_h5_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Uusifragment.IUusiFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayoutti, Uusifragment.newInstance())
                .commit();


    }

    @Override
    public void onButtonPressed() {
        Toast.makeText(getApplicationContext(), "Apua!", Toast.LENGTH_LONG).show();
    }
}
