/*Write a Java Program to Segregate Even and Odd numbers
Given an array A[],
write a function that segregates even and odd numbers. 
The functions should put all even numbers first, and then odd numbers.
Example:Input = {12, 34, 45, 9, 8, 90, 3}Output = {12, 34, 8, 90, 45, 9, 3}
Algorithm: segregateEvenOdd()
1.Initialize two index variables left and right:left = 0, right = size -1
2.Keep incrementing left index until we see an odd number.
3.Keep decrementing right index until we see an even number.
4.If lef < right then swap arr[left] and arr[right]
*/
import java.io.*;
import java.util.Scanner;
public class oddeveninarray
{ 
    static void segregateEvenOdd(int a[]) 
    { 
        int left = 0, right = a.length - 1; 
        while (left < right) 
        { 
            while (a[left]%2 == 0 && left < right) 
                left++; 
            while (a[right]%2 == 1 && left < right) 
                right--; 
            if (left < right) 
            {
                int temp = a[left]; 
                a[left] = a[right]; 
                a[right] = temp; 
                left++; 
                right--; 
            } 
        } 
    } 
    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        segregateEvenOdd(a); 
        System.out.print("Array after segregation "); 
        for (int i = 0; i < a.length; i++) 
            System.out.print(a[i]+" "); 
    } 
} 
