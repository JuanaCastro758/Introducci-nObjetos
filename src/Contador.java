package src;
public class Contador {
    private int num=0;
    //Constructor por defecto
    public Contador(){
        this.num=5;
    }
    //metodo incremento por defecto
    public void incremento1(Contador a){
        num++;
        System.out.println("Incremento: "+num);
    }
    //metodo decremento por defecto
    public void decremento1(Contador a){
        num--;
        System.out.println("Decremento: "+num);
    }
    
    //constructor por parametro
    public Contador(int num){
        this.num=num;
    }
    //get y setter
    public int getI(){
        return num;
    }
    public void setI(int num){
        this.num=num;
    }
    //metodo incremento
    public void incremento(){
        int i=this.num+1;
        System.out.println("Incremento: "+i);
    }
    //metodo decremento
    public void decremento(){
        int d=this.num-1;
        System.out.println("Decremento: "+d);
    }
    
    //constructor copia
    public Contador(Contador ejer){
        this.num=ejer.num;
    }
    //Verificar su funcionalidad
    public static void main(String[] args) {
        System.out.println("----------Contador");
        Contador con=new Contador(5);
        Contador con2=con;
        con2.setI(8);
        con.incremento();
        con.decremento();
    }
    
}
