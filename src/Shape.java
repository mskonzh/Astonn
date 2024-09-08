public abstract class Shape {
    protected String fillColor;
    protected String borderColor;

    public Shape(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public abstract void displayProperties();
}

