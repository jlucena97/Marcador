package com.ejercicio.jlm.marcador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView texto;
    TextView texto2;
    int contadorVisitante = 0;
    int contadorLocal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.punto1);
        boton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                texto = (TextView) findViewById(R.id.marcador1);
                contadorVisitante++;

                texto.setText(" Local \n "+contadorVisitante);
            }
        });

        Button boton2 = (Button) findViewById(R.id.punto2);
        boton2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                texto = (TextView) findViewById(R.id.marcador1);
                contadorVisitante += 2;

                texto.setText(" Local \n "+contadorVisitante);
            }
        });

        Button boton3 = (Button) findViewById(R.id.punto3);
        boton3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                texto = (TextView) findViewById(R.id.marcador1);
                contadorVisitante += 3;

                texto.setText(" Local \n "+contadorVisitante);
            }
        });

        Button menos1 = (Button) findViewById(R.id.menospunto);
        menos1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                texto = (TextView) findViewById(R.id.marcador1);
                if(contadorVisitante > 0) {
                    contadorVisitante -= 1;
                }
                texto.setText(" Local \n "+contadorVisitante);
            }
        });



        Button boton4 = (Button) findViewById(R.id.puntos1);
        boton4.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                texto2 = (TextView) findViewById(R.id.marcador2);
                contadorLocal++;

                texto2.setText(" Visitante \n "+contadorLocal);
            }
        });

        Button boton5 = (Button) findViewById(R.id.puntos2);
        boton5.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                texto2 = (TextView) findViewById(R.id.marcador2);
                contadorLocal += 2;

                texto2.setText(" Visitante \n "+contadorLocal);
            }
        });

        Button boton6 = (Button) findViewById(R.id.puntos3);
        boton6.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                texto2 = (TextView) findViewById(R.id.marcador2);
                contadorLocal += 3;

                texto2.setText(" Visitante \n "+contadorLocal);
            }
        });
        Button meno1 = (Button) findViewById(R.id.menospuntos);
        meno1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                texto = (TextView) findViewById(R.id.marcador2);
                if(contadorLocal > 0){
                contadorLocal -= 1;
                }

                texto.setText(" Visitante \n "+contadorLocal);
            }
        });

        Button reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                texto2 = (TextView) findViewById(R.id.marcador2);
                texto = (TextView) findViewById(R.id.marcador1);

                contadorLocal = 0;
                contadorVisitante = 0;

                texto.setText(" Local \n "+contadorVisitante);
                texto2.setText(" Visitante \n "+contadorLocal);
            }
        });
    }
}
