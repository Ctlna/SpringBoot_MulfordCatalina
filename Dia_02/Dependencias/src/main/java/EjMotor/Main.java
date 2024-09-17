package EjMotor;

public class Main {
    public static void main(String[] args){

        Motor motorGasolina = new MotorGasolina();
        Vehiculo miCarro = new Vehiculo(motorGasolina);

        miCarro.iniciar();
    }

    //  Clase B, donde la clase B consume de la clase A
}
