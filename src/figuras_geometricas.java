public class figuras_geometricas
{
    String nombre;
    int numero_lados;
    boolean regularidad;

    // Definir constructor vacío
    public figuras_geometricas(){}

    // Definir constructor lleno
    public figuras_geometricas(String nombre, int numero_lados, boolean regularidad)
    {
        this.nombre = nombre;
        this.numero_lados = numero_lados;
        this.regularidad = regularidad;
    }

    //Definir getters y setters


    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getNumero_lados() {return numero_lados;}

    public void setNumero_lados(int numero_lados) {this.numero_lados = numero_lados;}

    public boolean isRegularidad() {return regularidad;}

    public void setRegularidad(boolean regularidad) {this.regularidad = regularidad;}
}
