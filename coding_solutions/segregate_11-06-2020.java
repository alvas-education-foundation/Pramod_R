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
