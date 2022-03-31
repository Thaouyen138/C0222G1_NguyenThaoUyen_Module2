package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to read:");
        int number = Integer.parseInt(scanner.nextLine());
        int hangTram = number / 100;
        int hangChuc = (number % 100) / 10;
        int hangDonVi = number % 10;
        String string = "";

        if (hangTram == 0 && hangChuc == 0 && hangDonVi == 0) {
            string += "zero";
        } else {
            if (hangTram >= 1 && hangTram <= 9) {
                switch (hangTram) {
                    case 1:
                        string += "one hundered ";
                        break;
                    case 2:
                        string += "two hundered ";
                        break;
                    case 3:
                        string += "three hundered ";
                        break;
                    case 4:
                        string += "four hundered ";
                        break;
                    case 5:
                        string += "five hundered ";
                        break;
                    case 6:
                        string += "six hundered ";
                        break;
                    case 7:
                        string += "seven hundered ";
                        break;
                    case 8:
                        string += "eight hundered ";
                        break;
                    case 9:
                        string += "nine hundered ";
                        break;

                }
                if (hangChuc != 0 || hangDonVi != 0) {
                    string += "and ";
                }

            }
            if (hangChuc == 1) {
                switch (hangDonVi) {
                    case 0:
                        string += "ten";
                        break;
                    case 1:
                        string += "eleven";
                        break;
                    case 2:
                        string += "twelve";
                        break;
                    case 3:
                        string += "thirteen";
                        break;
                    case 4:
                        string += "fourteen";
                        break;
                    case 5:
                        string += "fifteen";
                        break;
                    case 6:
                        string += "sixteen";
                        break;
                    case 7:
                        string += "seventeen";
                        break;
                    case 8:
                        string += "eighteen";
                        break;
                    case 9:
                        string += "nineteen";

                }
            } else {
                switch (hangChuc) {
                    case 2:
                        string += "twenty ";
                        break;
                    case 3:
                        string += "thirty ";
                        break;
                    case 4:
                        string += "fourty ";
                        break;
                    case 5:
                        string += "fifty ";
                        break;
                    case 6:
                        string += "sixty ";
                        break;
                    case 7:
                        string += "seventy ";
                        break;
                    case 8:
                        string += "eighty ";
                        break;
                    case 9:
                        string += "ninety ";
                        break;
                }


                switch (hangDonVi) {
                    case 1:
                        string += "one";
                        break;
                    case 2:
                        string += "two";
                        break;
                    case 3:
                        string += "three";
                        break;
                    case 4:
                        string += "four";
                        break;
                    case 5:
                        string += "five";
                        break;
                    case 6:
                        string += "six";
                        break;
                    case 7:
                        string += "seven";
                        break;
                    case 8:
                        string += "eight";
                        break;
                    case 9:
                        string += "nine";
                        break;

                }
            }

        }
        System.out.println(string);


    }
}