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
    public static void task1 () {
        System.out.println("Задача 1");
        int month = 0;
        int total = 0;
        int contribution = 15_000;
        while ( total <= 2_459_000 ) {
            month = month + 1;
            total = total + contribution;
            System.out.println("Месяц " + month + ", сумма наклплений равна " + total + " рублей");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int numbers = 0;
        while (numbers <= 9) {
            numbers = numbers + 1;
            System.out.print(" " + numbers + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int mortality = 8;
        int birthrate = 17;
        int population = 12_000_000;
        int populationGrowth = 0;
        int theDifferenceInGrowth = birthrate - mortality;
        for (int year = 0; year <= 10; year = year + 1) {
            populationGrowth = (int) (population / 1000) * theDifferenceInGrowth;
            population = population + populationGrowth;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int total = 15_000;
        double percentagePerMonth = 7;
        int mes = 0;
        int desiredAmount = 12_000_000;
        while (total <= desiredAmount) {
            total = (int) (total + ((total*percentagePerMonth)/100));
            mes = mes + 1;
            System.out.println("Месяц " + mes + " сумма накоплений " + total + " рублей");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int total = 15_000;
        double percentagePerMonth = 7;
        int mes = 0;
        int desiredAmount = 12_000_000;
        while (total <= desiredAmount) {
            total = (int) (total + ((total*percentagePerMonth)/100));
            mes = mes + 1;
            if (mes % 6 == 0) {
                System.out.println("Месяц " + mes + " сумма накоплений " + total + " рублей");}
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int total = 15_000;
        double percentagePerMonth = 7;
        int accumulationPeriod = 9;
        for (int i = 0; i <= (12*accumulationPeriod); i++) {
            total = (int) (total + ((total*percentagePerMonth)/100));
            if (i % 6 == 0 && i != 0) {
                System.out.println("Прошло пол года, " + i + " месяцев. Cумма накоплений " + total + " рублей");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 3;
        int daysOfMonth = 31;
        while (friday <= daysOfMonth) {
            System.out.println("Сегодня пятница " + friday + "-ое число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int cometCycle = 79;
        int currentYear = 2023;
        int hundredYearsBefore = currentYear - 200;
        int hundredYearsAfter = currentYear + 100;
        for (int i = 0; i <= hundredYearsAfter; i++) {
            if ((i % cometCycle == 0) && i > hundredYearsBefore && i < hundredYearsAfter) {
                System.out.println(i);
            }
        }
    }
}