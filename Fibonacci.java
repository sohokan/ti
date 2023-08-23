package FibonacciTarea;

import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Fibonacci Series");

        int num1 = 0, num2 = 1, limit = 15;
		


     /*   for (int i = 0; i < limit; i++){
            System.out.println(num1 + " ");
            int sum = num1 + num2;

            num1 = num2;
            num2 = sum;*/

        Stream.iterate(new int[]{num1, num2}, t -> new int[]{t[num2], t[num1] + t[num2]})
                .limit(limit)
                .forEach(x -> System.out.println("{" + x[0] + "," + x[1] + "}"));
        }
    }