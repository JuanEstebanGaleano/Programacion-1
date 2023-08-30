class RegistroLibro{
    String titulo;
    String autor;
    int numero;
        //Constructor
    RegistroLibro (String titulo, String autor, int numero){
        this.titulo=titulo;
        this.autor=autor;
        this.numero=numero;
    }

public String Resumen(){
    return "Titulo: "+titulo+"\nAutor:    "+autor+"\nNumero de paginas: "+numero;
}
    public static void main(String[] args) {
        RegistroLibro miRegistro= new RegistroLibro("Los del choco", "kiriku", 10);
        System.out.println(miRegistro.Resumen());
    }
}