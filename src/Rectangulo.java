package src;
import java.util.*;
public class Rectangulo {
    private double largo=0;
    private double ancho=0;
    public Rectangulo(double largo,double ancho){
        this.largo=largo;
        this.ancho=ancho;
    }
    public double getLargo(){
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getAncho(){
        return ancho;
    }
    public double Area(){
        double area=this.largo*this.ancho;
        return area;
    }

    public double Perimetro(){
        double perimetro=2*(this.ancho+this.largo);
        return perimetro;
    }
    //comprobacion del funcionamiento
    public static void main(String[] args){
        System.out.println("-----------Rectangulo");
        Rectangulo rec=new Rectangulo(10,8);
        Rectangulo rec2=rec;
        rec2.setAncho(2.5);
        rec2.setLargo(5);
        if(rec.getAncho()!=rec.getLargo() && rec.getAncho()>0 && rec.getLargo()>0){
            System.out.println("Area: "+rec.Area());
            System.out.println("Perimetro: "+rec.Perimetro());
        }else{
            System.out.println("Error en la lectura de las medidas");
        }
    }
}
