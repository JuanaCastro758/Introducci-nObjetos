package src;
public class Libro {
    private int id=0;
    private int diasPrestado=0;
    private String titulo="";
    public Libro(int id,String titulo, int diasPrestado){
        this.id=id;
        this.diasPrestado=diasPrestado;
        this.titulo=titulo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDiasPrestado() {
        return diasPrestado;
    }
    public void setDiasPrestado(int diasPrestado) {
        this.diasPrestado = diasPrestado;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String prestamo(){
        return "*Emprestado con exito ";
    }
    public String info(){
        return "ID: "+this.id+"  Libro: "+this.titulo+"  Dias prestados: "+this.diasPrestado;
    }
    public String devolucion(){
        this.id=0;
        this.diasPrestado=0;
        this.titulo="----";
     return "Devolucion completada con exito";   
    }
     //comprobacion del funcionamiento
    public static void main(String[] args){
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
    }
}
