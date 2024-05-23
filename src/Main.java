public class Main
{
    public static void main(String[] args)
    {
        figuras_geometricas miFigura_1 = new figuras_geometricas();
        Circulos miFigura_2 = new Circulos();
        Cuardilateros miFigura_3 = new Cuardilateros();
        Triangulos miFigura_4 = new Triangulos();

        Circulos miFigura_5 = new Circulos(3.00);
        Triangulos miFigura_6 = new Triangulos(6.0, 8.0);
        Cuardilateros miFigura_7 = new Cuardilateros(5.0, 5.0);
        Cuardilateros miFigura_8 = new Cuardilateros(5.0, 10.0);

        /*miFigura_2.setNombre("Pileta del CEC");
        System.out.println(miFigura_2.getNombre());
        miFigura_2.setRadio(4.00);
        System.out.println("Radio del círculo" + miFigura_2.getRadio() + "metros.");
        System.out.println("Su perímetro será: " + miFigura_2.calcularPerimetro() + " metros.");
        System.out.println("Su área será: " + miFigura_2.calcular_area() + "metros cuadrados");

        //Figura 3
        miFigura_3.setNombre("Caja de pizza");
        System.out.println(miFigura_3.getNombre());
        miFigura_3.setAncho(5.0);miFigura_3.setLargo(6.0);
        System.out.println("Ancho del cuadrilatero: " + miFigura_3.getAncho() + "metros.");
        System.out.println("Largo del cuadrilatero: " + miFigura_3.getLargo() + "metros");
        System.out.println("Su perímetro será: " + miFigura_3.calcular_perimetro() + " metros.");
        System.out.println("Su área será: " + miFigura_3.calcular_area() + "metros cuadrados");

        //Figura 4
        miFigura_4.setNombre("Cartel de peligro");
        System.out.println(miFigura_4.getNombre());
        miFigura_4.setAltura(1.00);miFigura_4.setBase(0.60);
        System.out.println("Altura del triángulo: " +  miFigura_4.getAltura() + "metros.");
        System.out.println("Base del triángulo: " + miFigura_4.getBase() + "metros.");
        System.out.println("Su perímetro será: " + miFigura_4.calcular_perimetro() + " metros.");
        System.out.println("Su área será: " + miFigura_4.calcular_area() + "metros cuadrados");

        //Figura 5
        miFigura_5.setNombre("Piscina del CEC");
        System.out.println(miFigura_5.getNombre());
        System.out.println("Radio del círculo" + miFigura_5.getRadio() + "metros.");
        System.out.println("Su perímetro será: " + miFigura_5.calcularPerimetro() + " metros.");
        System.out.println("Su área será: " + miFigura_5.calcular_area() + "metros cuadrados");

        //Figura 6
        miFigura_6.setNombre("Aviso Eléctrico");
        System.out.println(miFigura_6.getNombre());
        System.out.println("Altura del triángulo: " +  miFigura_6.getAltura() + "metros.");
        System.out.println("Base del triángulo: " + miFigura_6.getBase() + "metros.");
        System.out.println("Su perímetro será: " + miFigura_6.calcular_perimetro() + " metros.");
        System.out.println("Su área será: " + miFigura_6.calcular_area() + "metros cuadrados");

        //Figura 7
        miFigura_7.setNombre("Caja de Carton");
        System.out.println("Ancho del cuadrilatero: " + miFigura_7.getAncho() + " metros.");
        System.out.println("Largo del cuadrilatero: " + miFigura_7.getLargo() + " metros");
        System.out.println("Su perímetro será: " + miFigura_7.calcular_perimetro() + " metros.");
        System.out.println("Su área será: " + miFigura_7.calcular_area() + " metros cuadrados");

        //Figura 8

        miFigura_7.setNombre("Contenerdor de acero");
        System.out.println("Ancho del cuadrilatero: " + miFigura_8.getAncho() + " metros.");
        System.out.println("Largo del cuadrilatero: " + miFigura_8.getLargo() + " metros");
        System.out.println("Su perímetro será: " + miFigura_8.calcular_perimetro() + " metros.");
        System.out.println("Su área será: " + miFigura_8.calcular_area() + " metros cuadrados");*/

        Pentagono miFigura_9 = new Pentagono();
        System.out.println(miFigura_9.getNumeroLados());

        // Este es el primer cambio


    }
}