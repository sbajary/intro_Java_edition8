package Chapter09.Exercises;

import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.9
 * @Title binary to hex
 */
public class Exercise9_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        String binary = scan.nextLine();
        System.out.println("The hex number is: ");
        binaryToHex(binary);
    }

    public static void binaryToHex(String binary) {
        int digitNumber = 1;
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (digitNumber == 1) {
                sum += Integer.parseInt(binary.charAt(i) + "") * 8;
            } else if (digitNumber == 2) {
                sum += Integer.parseInt(binary.charAt(i) + "") * 4;
            } else if (digitNumber == 3) {
                sum += Integer.parseInt(binary.charAt(i) + "") * 2;
            } else if (digitNumber == 4 || i < binary.length() + 1) {
                sum += Integer.parseInt(binary.charAt(i) + "") * 1;
                digitNumber = 0;
                if (sum < 10) {
                    System.out.print(sum);
                } else if (sum == 10) {
                    System.out.print("A");
                } else if (sum == 11) {
                    System.out.print("B");
                } else if (sum == 12) {
                    System.out.print("C");
                } else if (sum == 13) {
                    System.out.print("D");
                } else if (sum == 14) {
                    System.out.print("E");
                } else if (sum == 15) {
                    System.out.print("F");
                }
                sum = 0;
            }
            digitNumber++;
        }
        System.out.println();
    }
}
