public class Main {
    public static void main(String[] args){

        Triangulo triangulo1 = new Triangulo();
        triangulo1.ingresarPuntos();
        triangulo1.calcularBaricentro();
        triangulo1.calcularDistancias();

        Circulo circulo1= new Circulo(triangulo1);
        circulo1.calcularArea();
    }

}