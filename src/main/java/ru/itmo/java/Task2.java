package ru.itmo.java;

//@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber)
    {
        return realNumber % 1;  //your code here
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {

        //your code here
        return c;

    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b)
    {
        //your code here
        if (a.equals(b))
            return true;
        else
            return false;
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively)
    {
        //your code here
        if (inclusively != null && inclusively && number != null && leftBound != null && rightBound != null && number >= leftBound && number <= rightBound)
            return true;
        else
            return false;
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3)
    {
        //your code here
        if ( (c1 >= '0' && c1 <= '9') || (c2 >= '0' && c2 <= '9') || (c3 >= '0' && c3 <= '9'))
            return true;
        else
            return false;
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {

        a = (double)Math.round(a*100000000) / 100000000;
        b = (double)Math.round(b*100000000) / 100000000;
        //your code here
        if (Double.compare(a,b) == 0)
            return true;
        else
            return false;
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {

        //your code here
        int s = (int) (n / 100) +  (int)((n % 100)/10) + n % 10;
        return s;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n)
    {
        //your code here
        if (n % 2 == 0)
            return n + 2;
        else
            return n + 1;
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3)
    {
        //your code here
        int sum = 0;
        if(num1 % 2 == 0)
            sum += num1 / 2;
        else
            sum += (int)(num1 / 2) + 1;
        if(num2 % 2 == 0)
            sum += num2 / 2;
        else
            sum += (int)(num2 / 2) + 1;
        if(num3 % 2 == 0)
            sum += num3 / 2;
        else
            sum += (int)(num3 / 2) + 1;

        return sum;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N)
    {
        //your code here
        int a = N % 10;
        int b = (int)((N % 100) / 10);

        return a ^ b;
    }

}
