package org.elisys;

public class AverageNumber {
    public static float findAverageGPA(String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("Строка не должна быть пустой");
        }

        int sum = 0;
        int count = string.length();

        for (char ch : string.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch); // превращаем символ '5' в число 5
            } else {
                throw new IllegalArgumentException("Строка должна содержать только цифры");
            }
        }

        return (float) sum / count;
    }

    public static void main(String[] args) {
        String input = "53444553333344335345555554345555544";
        System.out.println("Среднее арифметическое = " + findAverageGPA(input));
    }
}
