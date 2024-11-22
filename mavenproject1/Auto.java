/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author camper
 */
public class Auto {
    private String tipoMotor;
    private int cantidadAsientos;
    private String pintura;
    private String extras;

    // Setters para configurar cada parte del auto
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "Auto [Motor: " + tipoMotor + ", Asientos: " + cantidadAsientos + 
               ", Pintura: " + pintura + ", Extras: " + extras + "]";
    }
}

