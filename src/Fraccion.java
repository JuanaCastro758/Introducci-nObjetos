package src;
public class Fraccion {
    private int numerador=0;
    private int denominador=0;

    public Fraccion(int denominador,int numerador) {
        this.denominador=denominador;
        this.numerador=numerador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public String sumar(int nume1,int deno1){
        int s_num=0;
        int s_deno=0;
        if(deno1==this.denominador){
            s_num=nume1+this.numerador;
            s_deno=this.denominador;
        }else{
            s_deno=deno1*this.denominador;
            s_num=(this.denominador* nume1)+(this.numerador*deno1);
        }
        
        return "La suma es: "+s_num+"/"+s_deno;
    }
    public String restar(int nume1,int deno1){
        int r_num=0;
        int r_deno=0;
        if(deno1==this.denominador){
            r_num=this.numerador-nume1;
            r_deno=this.denominador;
        }else{
            r_deno=deno1*this.denominador;
            r_num=(this.numerador*deno1)-(this.denominador* nume1);
        }
        
        return "La resta es: "+r_num+"/"+r_deno;
    }
    public String multiplicar(int nume1,int deno1){
        int m_num=0;
        int m_deno=0;
            m_deno=deno1*this.denominador;
            m_num=this.numerador*nume1;
        
        return "La resta es: "+m_num+"/"+m_deno;
    }
    public String dividir(int nume1,int deno1){
        int m_num=0;
        int m_deno=0;
            m_deno=numerador*this.denominador;
            m_num=this.numerador*deno1;
        
        return "La resta es: "+m_num+"/"+m_deno;
    }
     //comprobacion del funcionamiento
    public static void main(String[] args){
        System.out.println("-----------Fraccion");
        Fraccion fraccion=new Fraccion(3,2);
        Fraccion fraccion1=fraccion;
        fraccion1.setDenominador(9);
        fraccion1.setNumerador(7);
        System.out.println(fraccion.sumar(5, 7));
        System.out.println(fraccion.restar(5, 7));
        System.out.println(fraccion.multiplicar(5, 7));
    }
}
