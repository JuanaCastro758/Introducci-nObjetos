package src;
import java.util.*;
public class Circulo {
    private double radio=0;

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public Circulo(double radio){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public double Area(){
        double p=3.1416;
        double area=p*this.radio*this.radio;
        return area;
    }
    public double Perimetro(){
        double p=3.1416;
        double perimetro=2*p*this.radio;
        return perimetro;
    }
    //Verificar su funcionalidad
    public static void main(String[] args) {
        System.out.println("----------Circulo");
        Circulo circulo=new Circulo(5);
        Circulo circulo2=circulo;
        circulo2.setRadio(2.5);
        if(circulo.getRadio()>0){
           System.out.println("Area: "+circulo.Area());
            System.out.println("Perimetro: "+circulo.Perimetro());
        }
    }
}
