package com.company;

public class Main {

    public static void main(String[] args) {
        // Star Pattern
        Star star = new Star();
        System.out.println("\nSolid rectangle\n");
        star.solidRectangle(4,5);
        System.out.println("\nHollow rectangle\n");
        star.hollowRectangle(4,5);
        System.out.println("\nHalf rectangle\n");
        star.halfRectangle(5);
        System.out.println("\nInverted half pyramid\n");
        star.invertedHalfPyramid(5);
        System.out.println("\nInverted half pyramid 180deg\n");
        star.invertedPyramid180(5);
        System.out.println("\nButterfly pattern\n");
        star.butterflyPattern(5);
        System.out.println("\nSolid rhombus\n");
        star.solidRhombus(5);
        System.out.println("\nDiamond\n");
        star.diamondPattern(5);


        // Number pattern
        Number number = new Number();
        System.out.println("\nHalf pyramid\n");
        number.halfPyramid(5);
        System.out.println("\nInverted half pyramid\n");
        number.invertedHalfPyramid(5);
        System.out.println("\nFloyd's triangle\n");
        number.floydTriagle(5);
        System.out.println("\n1 & 0 triangle\n");
        number.zeroOneTriangle(5);
        System.out.println("\nPyramid\n");
        number.numberPyramid(5);
        System.out.println("\nPalindromic pattern\n");
        number.palindromicPattern(5);
    }
}