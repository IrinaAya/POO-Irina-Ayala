package ar.org.poo.tp.irinaayala.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Radio {
    //atributos
    private String marca;
    private int potencia;
    private boolean radioAsignada;
    
    //constructor
    public Radio(String marca, int potencia, boolean radioAsignada) {
        this.marca = marca;
        this.potencia = potencia;
        this.radioAsignada = radioAsignada;
    }

    //metodo para informar los datos de radio
    public String mostrarDatos() {
        return "Radio: " + marca + ", Potencia: " + potencia + "Watts";
    }


}
