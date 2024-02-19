public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        }
        if (age < 18) {
            System.out.println(" Надо немного подождать");
        }
        // Task 2
        System.out.println("Task 2");
        int temperature = 6;
        boolean putOnAHat = temperature < 5;
        if (putOnAHat) {
            System.out.println("На улице холодно, - " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, - " + temperature + " градусов, можно идти без шапки");
        }
        // Task 3
        System.out.println("Task 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println(" Если скорость больше - " + speed + " км/ч, то придётся заплатить штраф");
        } else {
            System.out.println(" Если скорость меньше - " + speed + " км/ч, можно ездить спокойно");
        }

        // Task 4
        System.out.println("Task 4");
        int years = 23;
        if (years > 2 && years < 6) {
            System.out.println("Если возраст человека равен " + years + " ,то ему нужно ходить в детский сад");
        }
        if (years > 7 && years < 17) {
            System.out.println("Если возраст человека равен " + years + " ,то ему нужно ходить в школу");
        }
        if (years >= 18 && years < 24) {
            System.out.println("Если возраст человека равен " + years + " ,то ему нужно ходить в университет");
        } else {
            System.out.println(" Если возраст больше " + years + " ,то придётся искать работу");
        }

        // Task 5
        System.out.println("Task 5");

        int age1 = 4;
        if (age1 < 5) {
            System.out.println(" Если возраст ребенка равен - " + age1 + " ,то он не может кататься на аттракционе");
        } else if (age1 > 5 && age1 < 14) {
            System.out.println(" Если возраст ребенка равен - " + age1 + " ,то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println(" Если возраст ребенка больше - " + age1 + " лет,то он может кататься без сопровождения взрослого.");
        }

        // Task 6
        System.out.println("Task 6");
        int place = 45;
        if (place <= 102 && place < 60) {
            System.out.println(" Есть сидячие места в вагоне");
        } else if (place < 102 && place >= 60) {
            System.out.println(" Есть стоячие места в вагоне");
        } else if (place > 102) {
            System.out.println(" Мест в вагоне нет");
        }
        // Task 7
        System.out.println("Task 7");

        int one = 4;
        int two = 8;
        int three = 7;
        if (one > two && one > three) {
            System.out.println("Первое число больше");
        } else if (two > one && two > three) {
            System.out.println(" Второе число больше");
        } else if (three > one && three > two) {
            System.out.println(" Третье число больше");
        }
    }
}


