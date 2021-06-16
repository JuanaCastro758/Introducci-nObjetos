package src;
public class Cuadrado {
    private float lado=0;
    public Cuadrado(float lado){
        this.lado=lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getLado(){
        return lado;
    }
    public float Area(){
        float area=this.lado*this.lado;
        return area;
    }
    public float Perimetro(){
        float perimetro=4*this.lado;
        return perimetro;
    }
    //Verificar su funcionalidad
    public static void main(String[] args) {
        System.out.println("----------Cuadrado");
        Cuadrado cuad=new Cuadrado(5);
        Cuadrado cuad2=cuad;
        cuad2.setLado(10);
        if(cuad.getLado()>0){
            System.out.println("Area: "+cuad.Area());
            System.out.println("Perimetro: "+cuad.Perimetro());
        }else{
            System.out.println("Medida negativa");
        }
    }
    
}
