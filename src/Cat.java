public class Cat {
    private String name;
    public static int catCount = 0;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " метров.");
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            System.out.println(name + " поел, осталось " + bowl.getFoodAmount() + " еды.");
        } else {
            System.out.println(name + " хочет поесть, но еды не хватает.");
        }
    }
}