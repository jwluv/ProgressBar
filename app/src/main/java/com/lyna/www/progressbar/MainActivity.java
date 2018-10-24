package com.lyna.www.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        textView = (TextView)findViewById(R.id.textView);

        progressBar.setVisibility(View.INVISIBLE);
    }

    public void onClickToggleButton(View view){

        String text = toggleButton.getText() + "-" + toggleButton.isChecked();


        if(toggleButton.isChecked()) {
            progressBar.setVisibility(View.VISIBLE);
            textView.setText(text);
        }
        //else progressBar.setVisibility(View.GONE);
        else {
            progressBar.setVisibility(View.INVISIBLE);
            textView.setText(text);
        }

        //Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
