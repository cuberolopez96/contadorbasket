package com.example.juan.contadorbasket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView contadorlocal;
    private TextView contadorVisitante;
    private Button local3;
    private Button local2;
    private Button localm3;
    private Button localm2;
    private Button vis3;
    private Button vis2;
    private Button vism3;
    private Button vism2;
    private Equipo local;
    private Equipo visitante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        local2 = (Button) findViewById(R.id.b2local);
        local3 = (Button) findViewById(R.id.b3local);
        localm2 = (Button) findViewById(R.id.bm2local);
        localm3 = (Button) findViewById(R.id.bm3local);
        vis2 = (Button) findViewById(R.id.b2vis);
        vis3 = (Button) findViewById(R.id.b3vis);
        vism3 = (Button) findViewById(R.id.bm3vis);
        vism2 = (Button) findViewById(R.id.bm2vis);
        contadorlocal = (TextView) findViewById(R.id.contadorlocal);
        contadorVisitante = (TextView) findViewById(R.id.contadorvis);
        local = new Equipo();
        visitante = new Equipo();
        local2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                local.setContador(local.getContador()+2);
                contadorlocal.setText(""+local.getContador());
            }
        });
        local3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                local.setContador(local.getContador()+3);
                contadorlocal.setText(""+local.getContador());
            }
        });
        localm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                local.setContador(local.getContador()-2);
                contadorlocal.setText(""+local.getContador());
            }

        });
        localm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                local.setContador(local.getContador()-3);
                contadorlocal.setText(""+local.getContador());

            }
        });
        vis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visitante.setContador(visitante.getContador()+2);
                contadorVisitante.setText(""+visitante.getContador());
            }
        });

        vis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visitante.setContador(visitante.getContador()+3);
                contadorVisitante.setText(""+visitante.getContador());
            }
        });
        vism2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visitante.setContador(visitante.getContador()-2);
                contadorVisitante.setText(""+visitante.getContador());
            }
        });
        vism3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visitante.setContador(visitante.getContador()-3);
                contadorVisitante.setText(""+visitante.getContador());
            }
        });


    }


}
