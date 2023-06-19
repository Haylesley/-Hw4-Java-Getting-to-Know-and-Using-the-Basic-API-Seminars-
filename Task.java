// Даны два Deque, представляющие два целых числа.
// Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа могут быть отрицательными.

// Даны два Deque, цифры в обратном порядке.
// [3,2,1] - пример Deque
// [5,4,3]- пример второго Deque
// 1) 123 * 345 = 42 435
// Ответ всегда - связный список, в обычном порядке
// [4,2,4,3,5] - пример ответа

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task {

    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>(Arrays.asList(3,2,1));
        Deque<Integer> deque2 = new ArrayDeque<>(Arrays.asList(5,4,3));
        int num1 = NumberAllocation(deque1);
        int num2 = NumberAllocation(deque2);

        System.out.println("Произведение двух чисел: ");
        System.out.println(Multiply(num1,num2));
        System.out.println("Сумма двух чисел: ");
        System.out.println(Summ(num1,num2));

    }
    public static Integer NumberAllocation(Deque<Integer> deque1) {
        int firstNum = 0;
        int size1 = deque1.size();

        for (int i = 0; i < size1; i++) {
            firstNum *= 10;
            firstNum += deque1.removeLast();
        }
        
        return firstNum;
    }

    public static Deque<Integer> Multiply(int a, int b) {
        int result = a*b;
        Deque<Integer> link = new ArrayDeque<>();

        while (result > 0) {
            link.addFirst(result % 10);
            result /= 10;
        }
        return link;
    }

    public static Deque<Integer> Summ(int a, int b) {
        int result = a + b;
        Deque<Integer> link = new ArrayDeque<>();

        while (result > 0) {
            link.addFirst(result % 10);
            result /= 10;
        }
        return link;
    }
}