package ar.org.poo.tp.irinaayala.test;
import ar.org.poo.tp.irinaayala.entidades.Colectivo;
import ar.org.poo.tp.irinaayala.entidades.Radio;
import ar.org.poo.tp.irinaayala.entidades.AutoClasico;
import ar.org.poo.tp.irinaayala.entidades.AutoNuevo;

public class TestVehiculo {
    public static void main(String[] args) {
    //creamos radios
    Radio radio1 = new Radio("XBTQD", 60, false);
    Radio radio2 = new Radio("Oregon", 200, false);
    Radio radio3 = new Radio("Nakamichi", 50, false);
    Radio radio4 = new Radio("J520", 800, false);
    //AutoNuevo (tiene radio inicialmente)
    AutoNuevo auto1 = new AutoNuevo("Blanco", "Mercedes-Benz", "EQS", radio1);
    //AutoClasico (que inicialmente no tiene radio)
    AutoClasico auto2 = new AutoClasico("Rojo", "Jaguar", "E-Type");
    //Colectivo (tampoco tiene radio inicialmente)
    Colectivo auto3 = new Colectivo("Celeste", "Volvo", "Metalpar");
    //datos de AutoNuevo 
    auto1.mostrarDatos();
    //cambiamos radio de AutoNuevo
    System.out.println("Cambiando Radio a AutoNuevo");
    auto1.asignarRadio(radio4); //asignamos radio4
    auto1.mostrarDatos();
    //datos de AutoClasico
    auto2.mostrarDatos();
    //le agregamos una radio
    auto2.asignarRadio(radio2);
    //mostramos datos nuevamente pero ahora con una radio asignada
    auto2.mostrarDatos();
    //datos de Colectivo
    auto3.mostrarDatos();
    //le agregamos una radio a colectivo
    auto3.asignarRadio(radio3);
    auto3.mostrarDatos();
    System.out.println("******************************************************************************");
    //intentamos poner una radio en dos vehículos
    System.out.println("Intentamos poner una misma radio en dos vehículos:");
    auto2.asignarRadio(radio3); // ya está en auto3
    auto2.mostrarDatos();
    System.out.println("*****************************************************");
    //prueba "AutoNuevo siempre debe tener una Radio asignada." para AutoNuevo
    System.out.println("Probamos crear un AutoNuevo sin radio:");
    AutoNuevo auto4 = new AutoNuevo("Negro", "Audi", "A6", null); //esto debería lanzar una excepción
   auto4.mostrarDatos();
   // System.out.println("***********************PRUEBA DE AUTO NUEVO****************************");
   //auto1.quitarRadio();
   //System.out.println(auto1.getRadio().mostrarDatos());
   // auto1.cambiarRadio(radio2);
   
    }
}


