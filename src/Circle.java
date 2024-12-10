public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    public void displayProperties() {
        System.out.println("Круг:");
        System.out.println("Радиус: " + radius);
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет обводки: " + borderColor);
    }
}
