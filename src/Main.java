public class Main {
    public static void main(String[] args) {
        printFruits();
        checkSumSign();
        printColor();
        System.out.println(sumNumbers(10, 15));
        System.out.println(sumNumbers(8, 7));
        checkNumber(7);
        checkNumber(-6);
        checkNumber(0);
        System.out.println(isNegative(-3));
        System.out.println(isNegative(5));
        System.out.println(isNegative(0));
        printStrings("Привет, Астон", 3);
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(100));
        System.out.println(isLeapYear(400));
        int[] array = {1, 1, 0, 0, 1, 1, 0, 0};
        flipArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        int[] array1 = new int[100];
        fillArray(array1);
        for (int i : array1) {
            System.out.print(i + " ");
        }
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        processArray(array2);
        for (int i : array2) {
            System.out.print(i + " ");
        }
        int n = 5;
        int[][] squareArray = new int[n][n];
        fillDiagonals(squareArray);
        System.out.println();
        for (int[] row : squareArray) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        int len = 10;
        int initialValue = 7;
        int[] array3 = createArray(len, initialValue);
        System.out.println();
        for (int i : array3) {
            System.out.print(i + " ");
        }
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван", "Инженер", "ivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Петров Пётр", "Менеджер", "petr@mailbox.com", "892312313", 40000, 35);
        employees[2] = new Employee("Сидоров Сергей", "Дизайнер", "sergey@mailbox.com", "892312314", 35000, 28);
        employees[3] = new Employee("Кузнецов Николай", "Программист", "nikolay@mailbox.com", "892312315", 50000, 25);
        employees[4] = new Employee("Васильева Анна", "Аналитик", "anna@mailbox.com", "892312316", 45000, 32);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }

        Park park = new Park("Центральный Парк");

        Park.Attraction rollerCoaster = park.createAttraction("Американские горки", "10:00 - 20:00", 500);
        Park.Attraction ferrisWheel = park.createAttraction("Колесо обозрения", "11:00 - 22:00", 300);

        rollerCoaster.printAttractionInfo();
        System.out.println();
        ferrisWheel.printAttractionInfo();

        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        Bowl bowl = new Bowl(15);

// Тестируем действия
        dog1.run(400);
        dog1.swim(5);

        cat1.run(150);
        cat1.swim(5);

        cat1.eat(bowl, 10);
        cat2.eat(bowl, 10);

        bowl.addFood(20);
        cat2.eat(bowl, 10);

// Выводим количество созданных объектов
        System.out.println("Всего собак: " + Dog.dogCount);
        System.out.println("Всего котов: " + Cat.catCount);

        Circle circle = new Circle(5, "Красный", "Чёрный");
        Rectangle rectangle = new Rectangle(4, 6, "Синий", "Зелёный");
        Triangle triangle = new Triangle(3, 4, 5, "Жёлтый", "Оранжевый");

        circle.displayProperties();
        rectangle.displayProperties();
        triangle.displayProperties();
    }

    public static void printFruits() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2 задание/*
    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        int j = a + b;
        if (j >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3 задание/*
    public static void printColor() {
        int value = 45;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }

    }

    // 4 задание /*
    public static void compareNumbers() {
        int a = 5;
        int b = 6;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5  /*
    public static boolean sumNumbers(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6 /*
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }

    // 7 /*
    public static boolean isNegative(int number) {
        return ++number <= 0;
    }

    // 8 /*
    public static void printStrings(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9 /*
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // 10 /*
    public static void flipArray(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array2[i] == 0 ? 1 : 0;
        }
    }

    // 11 /*
    public static void fillArray(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
    }

    // 12 /*
    public static void processArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    // 13 /*
    public static void fillDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
    }

    // 14 /*
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    static class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phoneNumber;
        private double salary;
        private int age;

        // Конструктор
        public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        // Метод для вывода информации о сотруднике
        public void printInfo() {
            System.out.println("ФИО: " + fullName);
            System.out.println("Должность: " + position);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phoneNumber);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст: " + age);
        }
    }

    // Класс "Парк" с внутренним классом "Аттракцион"
    static class Park {
        private String parkName;

        public Park(String parkName) {
            this.parkName = parkName;
        }

        // Внутренний класс для аттракционов
        public class Attraction {
            private String attractionName;
            private String workingHours;
            private double cost;

            public Attraction(String attractionName, String workingHours, double cost) {
                this.attractionName = attractionName;
                this.workingHours = workingHours;
                this.cost = cost;
            }

            public void printAttractionInfo() {
                System.out.println("Аттракцион: " + attractionName);
                System.out.println("Часы работы: " + workingHours);
                System.out.println("Стоимость: " + cost);
            }
        }

        // Метод для создания аттракциона
        public Attraction createAttraction(String name, String hours, double cost) {
            return new Attraction(name, hours, cost);
        }
    }

    static class Animal {
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

    static class Dog extends Animal {
        public static int dogCount = 0;

        public Dog(String name) {
            super(name, 500, 10); // Лимит для бега 500 м, плавания 10 м
            dogCount++;
        }
    }

    static class Cat extends Animal {
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

        public boolean isSatiated() {
            return isSatiated;
        }
    }

    static class Bowl {
        private int foodAmount;

        public Bowl(int foodAmount) {
            this.foodAmount = foodAmount;
        }

        public boolean decreaseFood(int amount) {
            if (foodAmount >= amount) {
                foodAmount -= amount;
                return true;
            } else {
                return false;
            }
        }

        public void addFood(int amount) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды. Теперь в миске " + foodAmount + " еды.");
        }

        public int getFoodAmount() {
            return foodAmount;
        }
    }
    interface Shape {
        double calculatePerimeter();
        double calculateArea();
    }

    // Класс Circle (Круг), реализующий интерфейс Shape
    static class Circle implements Shape {
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
    static class Rectangle implements Shape {
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
    static class Triangle implements Shape {
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
}

