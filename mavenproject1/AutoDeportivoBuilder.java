/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author camper
 */
public class AutoDeportivoBuilder implements AutoBuilder {
    private Auto auto;

    public AutoDeportivoBuilder() {
        this.auto = new Auto();
    }

    @Override
    public void buildMotor() {
        auto.setTipoMotor("Motor V8");
    }

    @Override
    public void buildAsientos() {
        auto.setCantidadAsientos(2);
    }

    @Override
    public void buildPintura() {
        auto.setPintura("Rojo brillante");
    }

    @Override
    public void buildExtras() {
        auto.setExtras("Sistema de navegación y sonido premium");
    }

    @Override
    public Auto getAuto() {
        return auto;
    }
}
