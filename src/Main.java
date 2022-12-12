public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("______Задача 1______");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("______Задача 2______");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("______Задача 3______");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0 && i != 0) System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("______Задача 4______");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("______Задача 5______");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("______Задача 6______");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("______Задача 7______");
        for (int i = 8; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("______Задача 8______");
        int save$ = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + save$;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("______Задача 9______");
        int save$ = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + save$;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println("______Задача 10______");
        int two = 2;
        int mnozh = 1;
        for (int i = 1; i <= 10; i++) {
            int ravno = two * mnozh;
            System.out.println(two + "*" + mnozh + "=" + ravno);
            mnozh++;
        }
    }

}