public class Circulos extends figuras_geometricas
{
    Double radio;

    public Circulos(){}
    public Circulos(Double radio){this.radio=radio;}

    public Double getRadio(){return radio;}
    public void setRadio(Double radio){this.radio=radio;}

    public Double calcularPerimetro() {return (2*Math.PI*radio);}
    public Double calcular_area() {return Math.PI * radio * radio;}
}
