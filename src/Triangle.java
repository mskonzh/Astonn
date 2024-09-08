public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void displayProperties() {
        System.out.println("Треугольник:");
        System.out.println("Стороны: " + a + ", " + b + ", " + c);
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет обводки: " + borderColor);
    }
}
