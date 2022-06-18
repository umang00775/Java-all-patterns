package com.company;

public class Number {
    public void halfPyramid(int num){
        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void invertedHalfPyramid(int num){
        for (int i=1; i<=num; i++){
            for (int j=1; j<=num-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void floydTriagle(int n){
        int count = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public void zeroOneTriangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public void numberPyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }

    public void palindromicPattern(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            for (int j=2; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
