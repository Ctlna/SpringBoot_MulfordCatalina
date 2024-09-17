/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjMotor;

/**
 *
 * @author camper
 */
public class Vehiculo {
    private final Motor motor;

    public Vehiculo(Motor motor) {
        this.motor = motor;
    }

    void iniciar(){
        motor.arrancar();
    }
}
