package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText name;
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= (EditText)findViewById(R.id.name);
        button=(Button) findViewById(R.id.button);
        view= (TextView) findViewById(R.id.view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName= name.getText().toString();
                view.setText("Hello "+ getName);
            }
        });
}
}


