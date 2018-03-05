package com.example.manrique_matus.ejemplo_labo2_pdm2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Creamos las variables
    private Button btn;
    private TextView text;
    private TextView result;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Esto configura el titulo que aparece en la barra de herramientas
        getSupportActionBar().setTitle("Ejemplo RelativeLayout");

        //Enlazamos la variable al campo dentro del xml conectado al onCreate
        btn=(Button)findViewById(R.id.button_test);
        text=(TextView) findViewById(R.id.text);
        result=(TextView)findViewById(R.id.text2);
        edit=(EditText) findViewById(R.id.editT);

        //El boton realiza una accion al darle tab que es el onClick
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                text.setVisibility(View.VISIBLE);
                result.setText(edit.getText());
            }
        });
    }
    //Otra manera de enlazar la funcion a un xml es agregandole el atributo onClick con el nombre de la funcion
    public void reset(View view){
        text.setVisibility(View.INVISIBLE);
        result.setText("");

    }
}
