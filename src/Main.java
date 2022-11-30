public class Main {
    public static void main(String[] args) {
        task1() ;
        task2() ;
        task3() ;
        task4() ;
        task5() ;
        task6() ;
        task7() ;
        task8() ;

    }

    public static void task1() {
        System.out.println("Задача 1") ;
        byte deepRivers = 126 ;
        short typeApples = 27898 ;
        int c = 12061994 ;
        long d = 678628736872L ;
        float e = 459.628376f ;
        double f = 9.5763883847 ;
        System.out.println("Значение переменной a с типом byte равно " + deepRivers ) ;
        System.out.println("Значение переменной b с типом short равно " + typeApples ) ;
        System.out.println("Значение переменной c с типом int равно " + c) ;
        System.out.println("Значение переменной d с типом long равно " + d) ;
        System.out.println("Значение переменной e с типом float равно " + e) ;
        System.out.println("Значение переменной f с типом double равно " + f) ;
    }
    public static void task2() {
        System.out.println("Задача 2") ;
        float a = 27.12f ;
        System.out.println(a) ;
        long b = 987678965549L ;
        System.out.println(b) ;
        double c = 2.786 ;
        System.out.println(c) ;
        int d = 569 ;
        System.out.println(d) ;
        short e = -159 ;
        System.out.println(e) ;
        int f = 27897 ;
        System.out.println(f) ;
        byte g = 67 ;
        System.out.println(g) ;
    }

    public static void task3() {
        System.out.println("Задача 3") ;
        byte ludmilaPal = 23 ;
        short annaSer = 27 ;
        int ekaterinaAnd = 30 ;
        int allPaper = 480 ;
        long paperForOne = allPaper / ( ludmilaPal + annaSer + ekaterinaAnd ) ;
        System.out.println("На каждого ученика рассчитано " + paperForOne + " листов бумаги") ;
    }

    public static void task4() {
        System.out.println("Задача 4") ;
        byte bottlePerTwo = 16 ;
        int bottlePerMinute = bottlePerTwo / 2 ;
        short twentyMinutes = 20 ;
        int bottlePerTwenty = bottlePerMinute * 20 ;
        System.out.println("За " + twentyMinutes + " машина произвела " + bottlePerTwenty + " штук бутылок") ;
        int hour = twentyMinutes * 3 ;
        int day = hour * 24 ;
        int bottlePerDay = bottlePerMinute * day ;
        System.out.println("За " + day + " машина произвела " + bottlePerDay + " штук бутылок") ;
        int threeDays = day * 3 ;
        int bottlePerThreeDays = bottlePerMinute * threeDays ;
        System.out.println("За " + threeDays + " машина произвела " + bottlePerThreeDays + " штук бутылок") ;
        int month = threeDays * 10 ;
        long bottlePerMonth = bottlePerMinute * month ;
        System.out.println("За " + month + " машина произвела "+ bottlePerMonth + " штук бутылок") ;
    }

    public static void task5() {
        System.out.println("Задача 5") ;
        int totalPaint = 120 ;
        byte whiteForOneClass = 2 ;
        byte brownForOneClass = 4 ;
        int paintForOneClass = whiteForOneClass + brownForOneClass ;
        int numberOfClasses = totalPaint / paintForOneClass ;
        int totalWhitePaint = numberOfClasses * whiteForOneClass ;
        int totalBrownPaint = numberOfClasses * brownForOneClass ;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски") ;

    }

    static public void task6() {
        System.out.println("Задача 6") ;
        byte bananaWeight = 80 ;
        byte bananaPortions = 5 ;
        byte milkWeight = 105 ;
        byte milkPortions = 2 ;
        byte iceCreamWeight = 100 ;
        byte iceCreamPortions = 2 ;
        byte eggWeight = 70 ;
        byte eggPortions = 4 ;
        double breakfastWeight = (bananaWeight * bananaPortions) + (milkWeight * milkPortions) + (iceCreamWeight * iceCreamPortions) + (eggWeight * eggPortions) ;
        double WeightInKilo = breakfastWeight / 1000 ;
        System.out.println("Завтрак спортсмена весит " + breakfastWeight + " г, или " + WeightInKilo + " кг") ;
    }

    static public void task7() {
        System.out.println("Задача 7") ;
        byte target = 7 ;
        float firstScript = 0.25f ;
        float secondScript = 0.5f ;
        double daysToFirst = target / firstScript ;
        double daysToSecond = target / secondScript ;
        double averageTime = (daysToFirst + daysToSecond) / 2D ;
        System.out.println("В первом случае спорстмен потеряет " + target + " кг за " + daysToFirst + " дней, а во втором случае - за " + daysToSecond + " дней") ;
        System.out.println("Чтобы добиться результата, спортсмену потребуется в среднем " + averageTime + " день" ) ;
    }

    static public void task8() {
        System.out.println("Задача 8") ;
        int beforeMashaMonth = 67760 ;
        int beforeMashaYear = beforeMashaMonth * 12 ;

        int beforeDenisMonth = 83690 ;
        int beforeDenisYear = beforeDenisMonth * 12 ;

        int beforeCristinaMonth = 76230 ;
        int beforeCristinaYear = beforeCristinaMonth * 12 ;

        double afterMashaMonth = beforeMashaMonth * 1.1 ;
        double afterMashaYear = afterMashaMonth * 12 ;
        double afterDenisMonth = beforeDenisMonth  * 1.1 ;
        double afterDenisYear = afterDenisMonth * 12 ;
        double afterCristinaMonth = beforeCristinaMonth * 1.1 ;
        double afterCristinaYear = afterCristinaMonth * 12 ;
        double averageMashaYear = afterMashaYear - beforeMashaYear ;
        double averageDenisYear = afterDenisYear - beforeDenisYear ;
        double averageCristinaYear = afterCristinaYear  - beforeCristinaYear ;
        System.out.println("Маша теперь получает " + afterMashaMonth + " рублей. Годовой доход вырос на " + averageMashaYear + " рублей") ;
        System.out.println("Денис теперь получает " + afterDenisMonth + " рублей. Годовой доход вырос на " + averageDenisYear + " рублей") ;
        System.out.println("Кристина теперь получает " + afterCristinaMonth + " рублей. Годовой доход вырос на " + averageCristinaYear + " рублей") ;
    }

}