package com.example.manrique_matus.ejemplo_labo2_pdm2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView text;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Ejemplo RelativeLayout");

        btn=(Button)findViewById(R.id.button_test);
        text=(TextView) findViewById(R.id.text);
        edit=(EditText) findViewById(R.id.editT);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                text.setText(edit.getText());
            }
        });
    }
}
