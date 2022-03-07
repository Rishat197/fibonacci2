package ru.aminov.fibonacci2;
import java.util.HashMap;
import java.util.Scanner;

/* Нерекурсивное решение нахождения числа Фибоначчи, используя коллекию */

public class Main {
    public static void main(String[] args) {
        // коллекция, содержащая числа Фибоначчи, для исключения повторного нахождения числа Фибоначчи
        HashMap<Integer, Integer> fibonacci = new HashMap<>();
        fibonacci.put(0, 0);
        fibonacci.put(1, 1);

        Scanner input = new Scanner(System.in);
        boolean choice = true;
        do {
            System.out.println("Введите номер числа Фибоначчи, который хотите узнать:");
            Integer number = input.nextInt();

            // есть ли в коллекции необходимое число Фибоначчи
            if (!fibonacci.containsKey(number)) {
                //i - это кол-во уже известных чисел Фибоначчи в коллекции
                for (int i = fibonacci.size(); i <= number; i++) {
                    fibonacci.put(i,fibonacci.get(i-1)+fibonacci.get(i-2));
                }
            }
            System.out.println(number + "-е число Фибоначчи равно: " + fibonacci.get(number));

            System.out.println("Нажмите клавишу \"y\", если хотите выйти из программы");
            String character = input.next();
            if (character.equals("y")) {
                break;
            }
        } while (choice);
    }
}
