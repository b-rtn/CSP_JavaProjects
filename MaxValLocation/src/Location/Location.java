/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Ratna
 */
public class Location {
    
public int row;
public int col;
public double maxValue;


public static int[] locateLargest(double[][] a)
{

double maxValue = a[0][0];
int r,c;
int [] b=new int[2];

for (int i = 0; i < a.length; i++)
{
    for (int j = 0; j < a.length; j++)
        {
            if (a[i][j] > maxValue){
                maxValue = a[i][j];
                b[0]=i;b[1]=j;}
            }
        }
    return b;
}
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of rows and columns of the array: ");
int rw = input.nextInt();
int cl = input.nextInt();


// Create a new Array object
double[][] a = new double[rw][cl];


System.out.println("Enter array: ");

for (int i = 0; i < a.length; i++)
for (int j = 0; j < a[i].length; j++)
a[i][j] = input.nextDouble();


Location loc = new Location();
int arr[]= locateLargest(a);

System.out.println("\nThe largest element is located at (" +arr[0]+","+arr[1]+")" );
}
}
