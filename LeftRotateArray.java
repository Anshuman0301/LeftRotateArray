package JavaCodes;

import java.util.Scanner;

public class LeftRotateArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements:-");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:- ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        int first=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=first;
        System.out.println("Array elements after rotation are:- ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
