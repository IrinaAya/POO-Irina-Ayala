package ar.org.poo.tp.irinaayala.entidades;

import lombok.Getter;
import lombok.Setter;
@Getter 
@Setter
//no se pueden crear subproductos derivados de Colectivo
public final class Colectivo extends Vehiculo {
    
    //es final xq no se pueden crear subproductos 
    public Colectivo(String color, String marca, String modelo) {
        super(color, marca, modelo);
        // los colectivos se pueden fabricar sin radio y despues  se puede agregar Radio
    }

    //sobrescribe de la clase padre, mostramos datos de la clase Colectivo
    @Override
    public void mostrarDatos() {
        System.out.println("Colectivo - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Color: " + getColor());
        //condición si tiene radio informa sus datos ,si no tiene lo informa también 
        if (getRadio() != null) {
            System.out.println(getRadio().mostrarDatos());
        } else {
            System.out.println("No tiene radio.");
        }
    }

    //sobrescribe de la clase padre, informa que tipo de vehiculo es
    @Override
    public String tipoDeVehiculo() {
        return "Colectivo";
    }
}
