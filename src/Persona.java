package src;
import java.util.*;
public class Persona {
    String nombre;
    int edad;
    int dni;
    String sexo;
    double peso;
    double altura;
    //constructor por defecto
    public Persona(){
        this.nombre="";
        this.edad=0;
        this.sexo="H";
        this.altura=0;
        this.peso=0;
    }
    public Persona(String nombre, int edad,String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.altura=0;
        this.peso=0;
    }
    public Persona(String nombre, int edad,String sexo,double peso,double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.altura=altura;
        this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String imc(){
        double p_ideal=(this.peso)/(this.altura*this.altura);
        if(p_ideal<20){
            return "IMC: "+p_ideal+"   Resultado: -1";
        }else if(p_ideal<=25 && p_ideal>=20){
            return "IMC: "+p_ideal+"   Resultado: 0";
        }else{
            return "IMC: "+p_ideal+"   Resultado: 1";
        } 
    }
    public String mayor(){
        boolean mayorEdad=false;
        if(this.edad>=18){
           mayorEdad=true;
        }
        return "¿Es mayor de eda? "+mayorEdad;
    }
    public String comprobarSexo(){
        if(this.sexo=="M"){
            return "Es sexo femenino";
        }else if(this.sexo=="H"){
            return "Es sexo Masculino";
        }else {
            return this.sexo;
        }
    }
    public void generaDNI(){
        Random random=new Random();
        this.dni=random.nextInt(100000000-9999999+1)+9999999;
                
    }
    
    @Override
    public String toString(){
        return "nombre: "+this.nombre+"  edad: "+this.edad+"   DNI: "+this.dni+"   sexo: "+this.sexo+"   peso: "+this.peso+"   altura: "+this.altura;
    }
            
    
}
