package com.example.juan.contadorbasket;

/**
 * Created by juan on 9/06/16.
 */
public class Equipo {
    private int contador;
    public Equipo(){
        setContador(0);
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {

        if(contador>=0){
            this.contador = contador;
        }
    }

}
