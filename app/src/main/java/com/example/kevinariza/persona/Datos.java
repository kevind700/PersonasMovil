package com.example.kevinariza.persona;

import java.util.ArrayList;

/**
 * Created by Kevin Ariza on 19/09/2017.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList<>();

    public static void guardar(Persona p){
        personas.add(p);
    }

    public static ArrayList<Persona> obtener(){
        return personas;
    }
}
