package com.example.ex1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        public void metodoClick(View view){
            TextView texto = (TextView) findViewById(R.id.texto);
            EditText campo = (EditText) findViewById(R.id.campo);
            texto.setText("Olá " + campo.getText());

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
