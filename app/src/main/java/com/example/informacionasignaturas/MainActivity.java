package com.example.informacionasignaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton asignatura1;
    private ImageButton asignatura2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asignatura1 = (ImageButton) findViewById(R.id.entornos3D);
        asignatura1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AsignaturaAtivity.class);
                intent.putExtra("asignatura", 1);
                v.getContext().startActivity(intent);
            }
        });

        asignatura2 = (ImageButton) findViewById(R.id.produccionAudiovisual);
        asignatura2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AsignaturaAtivity.class);
                intent.putExtra("asignatura", 2);
                v.getContext().startActivity(intent);
            }
        });
    }
}