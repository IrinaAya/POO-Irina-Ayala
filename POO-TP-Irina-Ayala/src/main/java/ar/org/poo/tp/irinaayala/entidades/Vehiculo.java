package ar.org.poo.tp.irinaayala.entidades;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//no existen instancias puras de vehículo
public abstract class Vehiculo {
    //atributos
    //un vehículo siempre tiene marca, color y modelo
    private String color;
    private String marca;
    private String modelo;
    @Setter(AccessLevel.NONE)
    private Radio radio; 
    //un vehículo no siempre tiene precio
    private Double precio;

    //constructor
    //tenemos el constructor sin radio ya que en un principio no se agrega
    public Vehiculo(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    //método abstracto para mostrar los datos de cada vehículo 
    public abstract void mostrarDatos();

    //método abstracto para que cada subclase informe que tipo de vehículo es
    public abstract String tipoDeVehiculo();

    //asignarRadio verifica si el vehículo tiene una radio, en caso de no tener, le asigna una y el valor booleano de radioAsignada es true
    //si el vehículo ya tiene una radio o la radio ya está asigna a otro vehículo, lo informa
    public void asignarRadio(Radio radio){
        if (this.radio == null) { 
            if (!radio.isRadioAsignada()) {
                this.radio = radio; 
                radio.setRadioAsignada(true);
            } else {
                System.out.println("La Radio ya está en otro vehículo."); 
            }
        }else{
            System.out.println("Ya tiene una radio asignada"); 
        }
    }
    
    //quitarRadio quita radio al vehículo y el valor del booleano pasa a ser false, en caso de no haber radio que quitar, lo informa 
    public void quitarRadio(){
        if (this.radio != null) {
            this.radio.setRadioAsignada(false);
            this.radio = null;
        }else{
            System.out.println("No hay radio que cambiar.");
        }
    } 
}