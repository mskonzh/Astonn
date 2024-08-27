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
    }

    class Bowl {
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


