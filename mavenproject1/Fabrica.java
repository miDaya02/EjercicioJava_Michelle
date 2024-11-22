/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;



/**
 *
 * @author camper
 */
public class Fabrica {
    private AutoBuilder builder;

    public void setAutoBuilder(AutoBuilder builder) {
        this.builder = builder;
    }

    public Auto getAuto() {
        return builder.getAuto();
    }

    public void construirAuto() {
        builder.buildMotor();
        builder.buildAsientos();
        builder.buildPintura();
        builder.buildExtras();
    }
}
