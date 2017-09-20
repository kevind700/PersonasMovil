package com.example.kevinariza.persona;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {
    private EditText cedula, nombre, apellido;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        cedula = (EditText)findViewById(R.id.txtCedula);
        nombre = (EditText)findViewById(R.id.txtNombre);
        apellido = (EditText)findViewById(R.id.txtApellido);
        resources = this.getResources();
    }

    public void guardar(View view){
        String ced, nom, apell;
        ced = cedula.getText().toString();
        nom = nombre.getText().toString();
        apell = apellido.getText().toString();

        Persona p = new Persona(ced, nom, apell);
        p.guardar();
        Toast.makeText(this, resources.getString(R.string.mensaje_exitoso), Toast.LENGTH_SHORT).show();
        }
        }
