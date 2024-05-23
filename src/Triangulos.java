public class Triangulos extends figuras_geometricas
{
    Double base;
    Double altura;

    public Triangulos() {}

    public Triangulos(Double base, Double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {return base;}

    public void setBase(Double base) {this.base = base;}

    public Double getAltura() {return altura;}

    public void setAltura(Double altura) {this.altura = altura;}

    public Double calcular_perimetro(){return (base*2)+(altura*2);}
    public Double calcular_area(){return (base*altura)/2;}
}
