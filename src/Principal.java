package src;
public class Principal{
    
    public static void main(String[] args) {
        Principal menu=new Principal();
    }
    public Principal(){
        //claseContador
        System.out.println("----------Contador");
        Contador con=new Contador(5);
        Contador con2=con;
        con2.setI(8);
        con.incremento();
        con.decremento();
        //
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
        //
        System.out.println("----------Circulo");
        Circulo circulo=new Circulo(5);
        Circulo circulo2=circulo;
        circulo2.setRadio(2.5);
        if(circulo.getRadio()>0){
            System.out.println("Area: "+circulo.Area());
            System.out.println("Perimetro: "+circulo.Perimetro());
        }
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
        System.out.println("-----------Libro");
        Libro libro=new Libro(15,"Libro 1",5);
        Libro libro2=libro;
        libro2.setDiasPrestado(3);
        libro2.setId(8);
        libro2.setTitulo("Libro 3");
        System.out.println(libro.prestamo());
        System.out.println("Informacion");
        System.out.println(libro.info());
        System.out.println(libro.devolucion());
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
