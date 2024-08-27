 class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}

class Dog extends Animal {
    public static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10); // Лимит для бега 500 м, плавания 10 м
        dogCount++;
    }
}

class Cat extends Animal {
    public static int catCount = 0;
    private boolean isSatiated;

    public Cat(String name) {
        super(name, 200, 0); // Лимит для бега 200 м, плавание 0 м (не умеет плавать)
        catCount++;
        isSatiated = false;
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.decreaseFood(foodAmount)) {
            isSatiated = true;
            System.out.println(name + " покушал и сытый.");
        } else {
            isSatiated = false;
            System.out.println(name + " не смог покушать. Недостаточно еды.");
        }
    }
}
