package src;
import java.util.*;
public class Principal1 {

    public static void main(String[] args) {
       Principal1 p1=new Principal1();
    }
    public Principal1(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nombre: ");
        String n=scanner.next();
        System.out.print("Edad: ");
        int e=scanner.nextInt();
        System.out.print("Sexo (M 0 H): ");
        String s=scanner.next();
        System.out.print("Peso: ");
        double p=scanner.nextDouble();
        System.out.print("Altura: ");
        double h=scanner.nextDouble();
        Persona persona1=new Persona();
        Persona persona2=new Persona(n,e,s);
        Persona persona3=new Persona(n,e,s,p,h);
        System.out.println(persona1.imc());
        System.out.println(persona2.imc());
        System.out.println(persona3.imc());
        System.out.println(persona1.mayor());
        System.out.println(persona2.mayor());
        System.out.println(persona3.mayor());
        persona1.generaDNI();
        persona2.generaDNI();
        persona3.generaDNI();
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
    
}
