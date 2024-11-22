/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;


/**
 *
 * @author camper
 */
public class AutoFamiliarBuilder implements AutoBuilder {
    private Auto auto;

    public AutoFamiliarBuilder() {
        this.auto = new Auto();
    }

    @Override
    public void buildMotor() {
        auto.setTipoMotor("Motor eficiente 1.6L");
    }

    @Override
    public void buildAsientos() {
        auto.setCantidadAsientos(5);
    }

    @Override
    public void buildPintura() {
        auto.setPintura("Blanco clásico");
    }

    @Override
    public void buildExtras() {
        auto.setExtras("Sistema básico de aire acondicionado");
    }

    @Override
    public Auto getAuto() {
        return auto;
    }
}

