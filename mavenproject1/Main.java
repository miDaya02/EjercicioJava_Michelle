/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author camper
 */
public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        // Construir un auto deportivo
        AutoBuilder autoDeportivoBuilder = new AutoDeportivoBuilder();
        fabrica.setAutoBuilder(autoDeportivoBuilder);
        fabrica.construirAuto();
        Auto autoDeportivo = fabrica.getAuto();
        System.out.println("Auto construido: " + autoDeportivo);

        System.out.println("------------------");

        // Construir un auto familiar
        AutoBuilder autoFamiliarBuilder = new AutoFamiliarBuilder();
        fabrica.setAutoBuilder(autoFamiliarBuilder);
        fabrica.construirAuto();
        Auto autoFamiliar = fabrica.getAuto();
        System.out.println("Auto construido: " + autoFamiliar);
    }
}
