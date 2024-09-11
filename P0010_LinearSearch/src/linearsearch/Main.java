/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linearsearch;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        
        solveData sD = new solveData();
        int size = sD.getInteger("Enter size of an array: ", 1, 1024);
        int key = sD.getInteger("Enter key value to search: ", 0, size-1);
        int arr[] = new int[size];
        sD.getRandomInt(size, arr);
        sD.displayArray(size, arr);
        int res = sD.linearSearch(arr, key);
        
        if(res >= 0) {
            System.out.println("The value " + key + " is found at index: " + res);
        }
        else 
            System.out.println("The value " + key + " does not exist in the array.");
    }
}
