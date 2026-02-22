package M3_UF1_Pract08;

import java.util.Scanner;

public class M3_UF1_Practi08_Garcia_Àlex {

    static Scanner sc = new Scanner(System.in);

    public static void Exercise1() {

        System.out.println("Input a number: ");
        int number = sc.nextInt();

        System.out.println("[1] Using for");
        System.out.println("[2] Using while");
        System.out.println("[3] Using do-while");
        System.out.print("Selection: ");
        int selection = sc.nextInt();

        switch (selection) {
            case 1:
                for (int i = 0; i <= 100; i++) {
                    if (i % number == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 2:
                int i_w = 0;
                while (i_w <= 100) {
                    System.out.print(i_w + " ");
                    i_w += number;
                }
                break;
            case 3:
                int i_dw = 0;
                if (number > 100 && number != 0) {
                    System.out.print("0 ");
                } else if (number != 0) {
                    do {
                        System.out.print(i_dw + " ");
                        i_dw += number;
                    } while (i_dw <= 100);
                }
                break;
        }

    }

    public static void Exercise2() {
        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        System.out.println("Let's count numbers 10 by 10 between N (" + N + ") and 0");
        System.out.println("[1] Using for");
        System.out.println("[2] Using while");
        System.out.println("[3] Using do-while");
        System.out.print("Selection: ");
        int selection = sc.nextInt();

        int start = N;
        System.out.print("Countdown: ");

        switch (selection) {
            case 1:
                for (int i = start; i >= 0; i -= 10) {
                    System.out.print(i + " ");
                }
                break;
            case 2:
                int i_w = start;
                while (i_w >= 0) {
                    System.out.print(i_w + " ");
                    i_w -= 10;
                }
                break;
            case 3:
                int i_dw = start;
                if (i_dw >= 0) {
                    do {
                        System.out.print(i_dw + " ");
                        i_dw -= 10;
                    } while (i_dw >= 0);
                }
                break;
            default:
                System.out.print("Invalid loop selection.");
        }
    }

    public static void Exercise3() {
        System.out.print("Insert a number: ");
        int number = sc.nextInt();

        int multiplication = 0;

        while (multiplication <= 9) {
            multiplication++;

            System.out.print((number * multiplication) + ", ");

        }
    }

    public static void Exercise4() {
         int startNum;
        long currentNum;
        long sq;
        long cu;

        System.out.print("Input number: ");
        
        if (sc.hasNextInt()) {
            startNum = sc.nextInt();
        } else {
            System.out.println("Invalid.");
            sc.close();
            return;
        }

        System.out.printf("%15s%15s%15s\n", "Numero", "Cuadrado", "Cubo");

        for (int i = 0; i < 5; i++) {
            currentNum = (long)startNum + i;

            sq = currentNum * currentNum;

            cu = currentNum * currentNum * currentNum;

            System.out.printf("%15d%15d%15d\n", currentNum, sq, cu);
        }

    }

    public static void Exercise5() {
            System.out.print("Input a number: ");
        
        int inputNumber = sc.nextInt();
        int number = inputNumber;
        int digitCount = 0;

        if (number < 0) {
            number = Math.abs(number);
        }

        if (number == 0) {
            digitCount = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                digitCount++;
            }
        }
        
        System.out.printf("The number " + inputNumber + "has " + digitCount + "dígits.\n");
    }

    @SuppressWarnings("empty-statement")
    public static void Exercise6() {
        int random = (int) (Math.random() * 100);
        int guess;
        
        do {
        System.out.println("Input a number:");
      
        guess = sc.nextInt(); 

        if (random != guess) {
            System.out.println("Guess again: ");
        }
    } while (random != guess);

    System.out.println("You're right");
    }
    
    public static void Exercise7() {
        
         System.out.println("Inserte la base: ");
         int base = sc.nextInt();
         System.out.println("Inserte el exponente: ");
         int exponente = sc.nextInt();
         
    }

    public static void main(String[] args) {

        System.out.println("Choose an exercise:");
        System.out.println("Exercise 1");
        System.out.println("Exercise 2");
        System.out.println("Exercise 3");
        System.out.println("Exercise 4");
        System.out.println("Exercise 5");
        System.out.println("Exercise 6");
        System.out.println("Exercise 7");
        System.out.print("Select a number (1 - 7): ");

        if (sc.hasNextInt()) {
            int selection = sc.nextInt();

            switch (selection) {
                case 1:
                    Exercise1();
                    break;
                case 2:
                    Exercise2();
                    break;
                case 3:
                    Exercise3();
                    break;
                case 4:
                    Exercise4();
                    break;
                case 5:
                    Exercise5();
                    break;
                case 6:
                    Exercise6();
                    break;
                case 7:
                    Exercise7();
                    break;
            }
        }
    }
}
