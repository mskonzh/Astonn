import java.util.List;

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

        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "orange", "apple"};

        UniqueWords uniqueWords = new UniqueWords();
        uniqueWords.printUniqueWords(words);

        Phonebook phonebook = new Phonebook();

        phonebook.add("Ivanov", "123456");
        phonebook.add("Petrov", "654321");
        phonebook.add("Ivanov", "789123");

        List<String> ivanovNumbers = phonebook.get("Ivanov");
        System.out.println("Номера для Иванов: " + ivanovNumbers);

        int[] array = {1, 1, 0, 0, 1, 1, 0, 0};
        ArrayUtils.flipArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] array1 = new int[100];
        ArrayUtils.fillArray(array1);
        for (int i : array1) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        ArrayUtils.processArray(array2);
        for (int i : array2) {
            System.out.print(i + " ");
        }

        System.out.println();

        int n = 5;
        int[][] squareArray = new int[n][n];
        ArrayUtils.fillDiagonals(squareArray);
        for (int[] row : squareArray) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        int len = 10;
        int initialValue = 7;
        int[] array3 = ArrayUtils.createArray(len, initialValue);
        for (int i : array3) {
            System.out.print(i + " ");
        }

        System.out.println();

        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        Bowl bowl = new Bowl(15);

        dog1.run(400);
        dog1.swim(5);

        cat1.run(150);
        cat1.swim(5);

        cat1.eat(bowl, 10);
        cat2.eat(bowl, 10);

        bowl.addFood(20);
        cat2.eat(bowl, 10);

        System.out.println("Всего собак: " + Dog.dogCount);
        System.out.println("Всего котов: " + Cat.catCount);

        Circle circle = new Circle(5, "Красный", "Чёрный");
        Rectangle rectangle = new Rectangle(4, 6, "Синий", "Зелёный");
        Triangle triangle = new Triangle(3, 4, 5, "Жёлтый", "Оранжевый");

        circle.displayProperties();
        rectangle.displayProperties();
        triangle.displayProperties();

        String[][] testArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ProcessArray.processArray(testArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }
    }

    public static void printFruits() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

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

    public static void printColor() {
        int value = 45;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static boolean sumNumbers(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return ++number <= 0;
    }

    public static void printStrings(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}


