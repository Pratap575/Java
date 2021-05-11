package com.company;

public class TransposeMatrix1 {
    public static void main(String[] args) {
        int [][] a={{50,47,30},{23,345,645},{50,65,78}};
        int [][] transpose=new int[3][3];
        for(int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                transpose[i][j]=a[j][i];
            }
        }
        System.out.println("Printing matrix without transpose:");
        for(int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing matrix after transpose:");
        for(int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
