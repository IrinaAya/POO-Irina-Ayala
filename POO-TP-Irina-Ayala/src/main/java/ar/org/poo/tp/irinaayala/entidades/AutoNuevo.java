package ar.org.poo.tp.irinaayala.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
//extends marca la herencia
public class AutoNuevo extends Vehiculo{
    //un AutoNuevo siempre tiene Radio 
    public AutoNuevo(String color, String marca, String modelo, Radio radio) {
        super(color, marca, modelo);
        //un AutoNuevo siempre tiene Radio
        if (radio == null || radio.isRadioAsignada())  { //si quiere crear un AutoNuevo sin radio...
            throw new IllegalArgumentException("AutoNuevo siempre debe tener una Radio asignada.");
        }
        asignarRadio(radio);
    }
    
    //sobrescribe de la clase padre, mostramos los datos de la clase AutoNuevo, más la radio
    @Override
    public void mostrarDatos() {
        System.out.println("AutoNuevo - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Color: " + getColor());
        System.out.println(getRadio().mostrarDatos());
    }
    
    //sobrescribe de la clase padre,informa el tipo de vehículo que es
    @Override
    public String tipoDeVehiculo() {
        return "Auto Nuevo";
    }
 
   //este método sobrescribe de la clase padre, impide que se quite la radio de un AutoNuevo y muestra un mensaje indicando cómo realizar el cambio seguro(llamando al método cambiarRadio)
    @Override
    public void quitarRadio() {
        System.out.println("No puede dejar un Auto Nuevo sin Radio. ");
        System.out.println("Para cambiar la radio existente, llame al método cambiarRadio");
    }


   //este método reemplaza la radio actual por una nueva, respetando que un AutoNuevo siempre debe tener una radio y que no quede null
    public void cambiarRadio(Radio radio){
        super.quitarRadio();    
        asignarRadio(radio);     
    }

    
}
