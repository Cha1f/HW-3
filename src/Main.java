import java.util.Locale;

import static java.util.Locale.US;

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
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte margarita = 5;
        System.out.println("Значение переменной margarita с типом byte равно " + margarita);
        short sunrise = 30000;
        System.out.println("Значение переменной sunrise с типом short равно " + sunrise);
        int bluLagoon = 2000000000;
        System.out.println("Значение переменной bluLagoon с типом int равно " + bluLagoon);
        long longIsland = 9000000000000000000L;
        System.out.println("Значение переменной longIsland с типом long равно " + longIsland);
        float bloodMary = 3.1236f;
        System.out.println("Значение переменной bloodMary с типом float равно " + bloodMary);
        double icedTea = 6.123453436789;
        System.out.println("Значение переменной icedTea с типом double равно " + icedTea);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float number1 = 27.12f;
        long number2 = 987678965549L;
        float number3 = 2.786f;
        short number4 = 569;
        char number5 = 159;
        short number6 = 27897;
        byte number7 = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        byte totalChildren = (byte) (lp + as + ea);
        int oneChildrenPaper = paper / totalChildren;
        System.out.println("На каждого ученика рассчитано " + oneChildrenPaper + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time = 2;
        byte bottleInOneTime = (byte) (bottle / time);
        int bottlesPer20Minutes = bottleInOneTime * 20;
        int bottlesPerHour = bottlesPer20Minutes * 3;
        int bottlesPerDay = bottlesPerHour * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int numberPerMonths = bottlesPer3Days * 10;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + numberPerMonths + " штук бутылок (с учётом того, что в месяце 30 дней)");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte totalJar = 120;
        byte perOneClassWhite = 2;
        byte perOneClassBrown = 4;
        int totalClasses = totalJar / (perOneClassWhite + perOneClassBrown);
        int theWhiteColor = totalClasses * perOneClassWhite;
        int theBrownColor = totalClasses * perOneClassBrown;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + theWhiteColor + " банок белой краски и " + theBrownColor + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananasCount = 5;
        byte milkCount = 2;
        byte iceCreamCount = 2;
        byte eggsCount = 4;
        byte weightBananas = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEggs = 70;
        int totalWeightGg = bananasCount * weightBananas + milkCount * weightMilk + iceCreamCount * weightIceCream + eggsCount * weightEggs;
        double totalWeightKg = totalWeightGg / 1000D;
        System.out.println("Вес спортзавтрака " + totalWeightGg + " грамм или " + totalWeightKg + " килограмм");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weightForLossInGrams = 7000;
        int lossWeightPerDayMin = 250;
        int lossWeightPerDayMax = 500;
        double maxDays = (double) weightForLossInGrams / lossWeightPerDayMin;
        double minDays = (double) weightForLossInGrams / lossWeightPerDayMax;
        double lossWeightAverage = (lossWeightPerDayMin + lossWeightPerDayMax) / 2D;
        double averageDays = weightForLossInGrams / lossWeightAverage;
        System.out.println("Минимальное количество дней для похудания " + minDays);
        System.out.println("Максимальное количество дней для похудания " + maxDays);
        System.out.printf(US, "Среднее количество дней для похудания %.2f%n", averageDays);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double percent = 1.1;
        double newMashaSalary = salaryMasha * percent;
        double yearMashaSalary = salaryMasha * 12;
        double newYearMashaSalary = newMashaSalary * 12;

        double newDenisSalary = salaryDenis * percent;
        double yearDenisSalary = salaryDenis * 12;
        double newYearDenisSalary = newDenisSalary * 12;

        double newKristinaSalary = salaryKristina * percent;
        double yearKristinaSalary = salaryKristina * 12;
        double newYearKristinaSalary = newKristinaSalary * 12;

        System.out.printf(Locale.US,"Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newMashaSalary, newYearMashaSalary - yearMashaSalary);
        System.out.printf(Locale.US,"Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newDenisSalary, newYearDenisSalary - yearDenisSalary);
        System.out.printf(Locale.US,"Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newKristinaSalary, newYearKristinaSalary - yearKristinaSalary);

    }
}