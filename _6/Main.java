package javabasics.Javabasic_esercizi._6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        double value=Math.abs(10);
        double valueSquareRoot=Math.sqrt(value);
        System.out.println(valueSquareRoot);// Write your code here
    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;
    //Spostato l'ordine della stampa
        int Max=Math.max(valueA,valueB);
        int Min=Math.min(valueA,valueB);

        System.out.println("Max="+Max);
        System.out.println("Min="+Min);

        // Write your code here
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        int remainder = totalMoney%costPerBurger;// Write your code here
        System.out.println("Remainder="+remainder);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // Restituisce un valore il più vicino possibile del numero all'intorno superiore
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // Restituisce un valore il più vicino possibile del numero all'intorno inferiore
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        // La stessa cosa di sopra ma forse con un numero intero
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // Esegue la potenza di 2 del valore
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // Esegue la potenza di 3 del valore
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // Moltiplica per un numero randomico compreso credo tra 0.1 e 1 il valore
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}