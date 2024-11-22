/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.Auto;

/**
 *
 * @author camper
 */
public interface AutoBuilder {
    void buildMotor();
    void buildAsientos();
    void buildPintura();
    void buildExtras();
    Auto getAuto();
}
