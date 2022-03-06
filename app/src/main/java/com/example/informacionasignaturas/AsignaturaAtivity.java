package com.example.informacionasignaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AsignaturaAtivity extends AppCompatActivity {
    private int identificador;
    private TextView nombre;
    private TextView descripcion;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asignatura_activity);

        identificador = this.getIntent().getIntExtra("asignatura", 1);

        nombre = (TextView) findViewById(R.id.nombre);
        descripcion = (TextView) findViewById(R.id.descripcion);
        imagen = (ImageView) findViewById(R.id.imagen);

        switch (identificador){
            case 1:
                nombre.setText(R.string.nombre_asignatura_1);
                descripcion.setText(R.string.desc_asignatura_1);
                imagen.setBackgroundResource(R.drawable._d_personalizado_puntodis_1_300x185);
                break;

            case 2:
               nombre.setText(R.string.nombre_asignatura_2);
               descripcion.setText(R.string.desc_asignatura_2);
               imagen.setBackgroundResource(R.drawable.filmacion_de_eventos_productora_audiovisual_1_300x185);
                break;

            default: break;
        }
    }
}