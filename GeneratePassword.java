package lab7;

import java.util.Random;
import java.util.Scanner;

public class GeneratePassword {
    public static void main(String[] args){
        Random      random = new Random();
        Scanner     input = new Scanner(System.in);
        String      range1 = "sbcdefghijklmnopqrstuvwxyz";
        String      range2 = range1.toUpperCase();
        String      range3 = "!\"#$%&";
        String      range4 = "0123456789";
        int         index;
        String[]    arr = {range1, range2, range3, range4};

        System.out.println("Enter the length of the password:");
        int len = input.nextInt();
        System.out.println("The random password is:");
        for (int i = 0, j = 0; i < len; i++){
            if (j == 4)
                j = 0;
            index = random.nextInt(arr[j].length());
            System.out.print(arr[j].charAt(index));
            j++;
        }
    }


}
