package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int count=1;
        double max = 0.0;
        double num;
        do {
            System.out.print("Number " + count + ": ");
            num=scanner.nextDouble();
            if(count == 1 && num<=0){
                System.out.println("No number entered.");
            }
            if (max < num) {
                max = num;
            }
            count++;
        } while(num > 0);
        if (max != 0.0) {
            System.out.printf("The largest number is %,.2f", max);
            System.out.println();
        }
    }


    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number!");
        }

        int counter = 1;
        for(int row = 0; row < n; row++) {
            for(int column = 0; column <= row; column++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        final int ROWS = 6;
        for(int row = 1; row <= ROWS; row++){
            for(int col = ROWS; col > row; col--){
                System.out.print(" ");
            }
            for(int star = 0; star<row*2-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h % 2 == 1){
            //upper half
            for (int row = 0; row <= h / 2; row++){
                for(int spaces = row; spaces < h / 2; spaces++){
                    System.out.print(" ");
                }
                for(int diff = 0 - row; diff <= row; diff++){
                    System.out.print((char)(c - Math.abs(diff)));
                }
                System.out.println();
            }
            //lower half
            for(int row = h / 2; row > 0; row--){
                for(int rowForSpaces = row; rowForSpaces <= h / 2;rowForSpaces++){
                    System.out.print(" ");
                }
                for(int diff = 0 - row + 1; diff < row; diff++){
                    System.out.print((char)(c - Math.abs(diff)));
                }
                System.out.println();
            }
        }
        else if(h % 2 == 0){
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num = 0;
        int five = 0;
        int sum = 0;
        float average = 0;

        do {
            System.out.print("Mark " + (count + 1) + ": ");
            num = scanner.nextInt();

            if (num > 5 || (num < 1 && num != 0)) {
                System.out.println("Invalid mark!");
            } else if (num != 0) {
                if (num == 5) {
                    five++;
                }
                sum += num;
                count++;
            }
        }
            while (num != 0);
                average = sum / (float) count;
                if (Float.isNaN(average)) {
                    System.out.println("Average: " + "0.00");
                } else {
                    System.out.println("Average: " + String.format("%.2f", average));
                }
                System.out.println("Negative marks: " + five);
            }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        System.out.print("n: ");
        number = scanner.nextInt();

        while(number != 1 && number != 4){
            while (number != 0) {
                sum += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = sum;
            sum = 0;
        }
        if(number ==1){
            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}