package com.company;

public class Star {
    public void solidRectangle(int rows, int columns){
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void hollowRectangle(int rows, int columns){
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=columns; j++){
                if (i==1 || j==1 || i ==rows || j==columns){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void halfRectangle(int num){
        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void invertedHalfPyramid(int num){
        for (int i=num; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void invertedPyramid180(int num){
        for (int i=1;i<=num; i++){
            // print space
            for (int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            // print star
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void butterflyPattern(int n){
        // Upper part
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void solidRhombus(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void diamondPattern(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
