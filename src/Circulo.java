public class Circulo {
    
    private double radio;
    private Triangulo triangulo;

    private double area;

    public Circulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public void calcularRadio(){
        radio = Math.sqrt(Math.pow(triangulo.getBx()-triangulo.getX1(),2)+Math.pow(triangulo.getBy()-triangulo.getY1(),2));
    }

    public void calcularArea(){
        this.calcularRadio();
        area = Math.PI * Math.pow(radio,2);
        System.out.println("El área del circulo circunscrito es: " +area);
    }


}
