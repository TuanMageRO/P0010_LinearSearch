
package linearsearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class solveData {
    private static final Scanner sc = new Scanner(System.in);
    public int getInteger(String mess, int min, int max) {
        int n;
        while(true) {
            try {
                System.out.print(mess);
                n = Integer.parseInt(sc.nextLine());
                if(n < min || n > max) {
                    System.err.println("Only Integer in range " + min + " to " + max);
                    continue;
                }
                return n;
            }
            catch (NumberFormatException e) {
                System.err.println("Integer number only");
            }
        }
   
    }
    
    public void getRandomInt(int size, int[] arr) {
        Random ran = new Random();
        for(int i = 0; i < size; ++i) {
            arr[i] = ran.nextInt(size);
        }
    }
    
    public void displayArray(int size, int[] arr) {
        System.out.println("The generated array: ");
        System.out.print("[ ");
        for(int i = 0; i < size-1; ++i) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[size-1] + " ]");
        System.out.println("");
    }
    
    public int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
