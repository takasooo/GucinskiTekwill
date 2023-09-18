package homework_nr_5;

import java.math.BigInteger;

public class HomeWork5 {
    public static void main(String[] args) {

        int[] numbers = new int[101];
        long sumEven = 0;
        BigInteger productOdd = BigInteger.ONE;
        for(int i = 100; i >= 0; i--){
           numbers[i] = i;
            System.out.println(numbers[i] + "; ");

            if(numbers[i] % 2 == 0)
                sumEven += numbers[i];

            if(numbers[i] % 2 != 0)
                productOdd = productOdd.multiply(BigInteger.valueOf(numbers[i]));
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Product of odd numbers: " + productOdd);

        int[] copyNumbers = new int[numbers.length];
//копия массива но которая идет от 0 до 100
        for(int j = 0; j < numbers.length; j++){
            copyNumbers[j] = numbers[j];
            System.out.println(copyNumbers[j] + "; ");
        }
//копия массива которая идет от 100 до 0
        for(int x = numbers.length - 1; x >= 0; x--){
            copyNumbers[x] = numbers[x];
            System.out.println(copyNumbers[x] + ": ");
        }
    }
}