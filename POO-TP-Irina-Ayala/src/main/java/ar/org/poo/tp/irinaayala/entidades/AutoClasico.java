package ar.org.poo.tp.irinaayala.entidades;

import lombok.Getter;
import lombok.Setter;
@Getter 
@Setter  
//extends marca la herencia
public class AutoClasico extends Vehiculo{
    public AutoClasico(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    //sobrescribe de la clase padre,mostramos la información de la clase hija AutoClasico
    @Override
    public void mostrarDatos() {
        System.out.println("AutoClasico - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Color: " + getColor());
        //condición si tiene radio informa sus datos, si no tiene lo informa también 
        if (getRadio() != null) {
            System.out.println(getRadio().mostrarDatos());
        } else {
            System.out.println("No tiene radio.");
        }
    }

    //sobrescribe de la clase padre, informa el tipo de vehículo que es 
    @Override
    public String tipoDeVehiculo() {
        return "Auto Clásico";
    }
}
