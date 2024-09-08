public class Dog {
    private String name;
    public static int dogCount = 0;

    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " метров.");
    }
}