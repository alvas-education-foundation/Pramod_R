/*Given an array a[] of size n which contains elements from 0 to n-1, write a program printDuplicates which prints the duplicate elements of the given array. If no duplicate element is found print -1.
Input:
The first line of input must contains an integer n which denotes number of elements of Array. Second line contains n space separated integers denoting elements of array a[].
Output:
Print the duplicate elements from the given array.
*/

import java.util.Scanner;
public class Duplicate {
   
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        myObj.nextLine(); //ignore one space
        String [] s = myObj.nextLine().split(" ");
        if(s.length==n) {
            int [] arr = new int [n];
            for(int i=0; i<n;i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            for (int x = 0; x < arr.length; x++) {
                for (int y = x + 1 ; y < arr.length; y++) {
                    if (arr[x]==arr[y]) {
                        System.out.println(arr[x]);
                    }
                }
            }
        }else {
            System.out.println("Enter Array of length " + n);
        }
       
    }
}