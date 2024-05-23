public class Cuardilateros extends figuras_geometricas
{
    Double largo;
    Double ancho;

    public Cuardilateros(){}

    public Cuardilateros(Double largo, Double ancho)
    {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Double getLargo() {return largo;}

    public void setLargo(Double largo) {this.largo = largo;}

    public Double getAncho() {return ancho;}

    public void setAncho(Double ancho) {this.ancho = ancho;}



    public Double calcular_perimetro(){return largo*2 + ancho*2;}
    public Double calcular_area(){return largo * ancho;}

}
