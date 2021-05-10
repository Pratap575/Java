package com.company;
import java.util.Scanner;
class mat{
    static void matrix1(){
        Scanner sc= new Scanner(System.in);
        int [][] a=new int[50][50];
        int [][] b=new int[50][50];
        int r,c;
        int i,j;
        int [][] sum=new int[50][50];
        System.out.println("Enter row value:");
        r=sc.nextInt();
        System.out.println("Enter coloum value:");
        c= sc.nextInt();
        System.out.println("This matrix for A:");
        for (i=0; i<r; i++)
        {
            for (j=0; j<c; j++)
            {
                System.out.printf("Matrix [%d%d]:",i+1,j+1);
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("This matrix for B:");
        for (i=0; i<r; i++)
        {
            for (j=0; j<c; j++)
            {
                System.out.printf("Matrix [%d%d]:",i+1,j+1);
                b[i][j]= sc.nextInt();
            }
        }
        for (i=0; i<r; i++)
        {
            for (j=0; j<c; j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for (i=0; i<r; i++)
        {
            for (j=0; j<c; j++)
            {
                System.out.printf("%d\t",sum[i][j]);
            }
        }
    }
}
public class Matrix {

    public static void main(String [] args){
        mat sc=new mat();
//        System.out.println();
        sc.matrix1();
    }
}
