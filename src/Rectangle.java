public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayProperties() {
        System.out.println("Прямоугольник:");
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет обводки: " + borderColor);
    }
}