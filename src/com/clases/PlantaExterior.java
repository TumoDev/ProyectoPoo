/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import java.util.Date;

/**
 *
 * @author romin
 */
public class PlantaExterior extends Planta{
    private String tipoClima;
    private String temporada;


    public PlantaExterior(String nombreIngresado, Date fechaSembradoIngresado, int cantVecesRiegoIngresado,
            String tipoClimaIngresado, String temporadaIngresado) {
        super(nombreIngresado, fechaSembradoIngresado, cantVecesRiegoIngresado);
        this.tipoClima = tipoClima;
        this.temporada = temporada;
    }

    public String getTemporada() {
        return temporada;
    }


    public String getTipoClima() {
        return tipoClima;
    }

    public void setTipoClima(String tipoClima) {
        this.tipoClima = tipoClima;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }


    public void mostrarDatos(String tipoClima){

        System.out.println("El nombre de la planta es " + getNombre() + ".");
        System.out.println("La fecha de siembra es " +getFechaSembrado()+ ".");
        if(getCantVecesRiego() == 1){
            System.out.println("Se ha regado " +getCantVecesRiego()+ " vez esta planta.");
        }
        else{
            System.out.println("Se ha regado " +getCantVecesRiego()+ " veces esta planta.");
        }
        System.out.println("El tipo de clima en el que se encuentra la planta actualmentes es" + tipoClima);
        System.out.println("La temporada en la que se encuentra la planta actualmente es" + temporada);

    }
}
