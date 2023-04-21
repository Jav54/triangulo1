import java.util.Scanner;

public class Triangulo {

    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;
    private double bx;
    private double by;


    public void ingresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x del primer punto: ");
        this.x1 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del primer punto: ");
        this.y1 = sc.nextDouble();
        System.out.println("Ingrese la coordenada x del segundo punto: ");
        this.x2 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del segundo punto: ");
        this.y2 = sc.nextDouble();
        System.out.println("Ingrese la coordenada x del tercer punto: ");
        this.x3 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del tercer punto: ");
        this.y3 = sc.nextDouble();
    }

    public void calcularBaricentro(){
        bx = (x1+x2+x3)/3;
        by = (y1+y2+y3)/3;
        System.out.println("Las coordenadas del baricentro son: " +bx +" , " +by);
    }

    public void calcularDistancias(){
        double d1;
        double d2;
        double d3;
        d1= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        d2= Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        d3= Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        System.out.println("La distancia entre el punto 1 y 2 es: " +d1);
        System.out.println("La distancia entre el punto 2 y 3 es: " +d2);
        System.out.println("La distancia entre el punto 1 y 3 es: " +d3);
    }
}