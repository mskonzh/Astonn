interface Shape {
double calculatePerimeter();
double calculateArea();
    }

// Класс Circle (Круг), реализующий интерфейс Shape
class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayProperties() {
        System.out.println("Circle - Perimeter: " + calculatePerimeter() +
                ", Area: " + calculateArea() +
                ", Fill Color: " + fillColor +
                ", Border Color: " + borderColor);
    }
}

// Класс Rectangle (Прямоугольник), реализующий интерфейс Shape
class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double calculateArea() {
        return width * height;
    }

    public void displayProperties() {
        System.out.println("Rectangle - Perimeter: " + calculatePerimeter() +
                ", Area: " + calculateArea() +
                ", Fill Color: " + fillColor +
                ", Border Color: " + borderColor);
    }
}

// Класс Triangle (Треугольник), реализующий интерфейс Shape
class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;

    public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public void displayProperties() {
        System.out.println("Triangle - Perimeter: " + calculatePerimeter() +
                ", Area: " + calculateArea() +
                ", Fill Color: " + fillColor +
                ", Border Color: " + borderColor);
    }
}

