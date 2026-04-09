package com.plurasight;

public class mathApp {
    public static void main(String[] args) {
// Question 1
        double bobSalary = 55000;
        double garySalary = 62000;
        double highestSalary;
        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is "+ highestSalary);

 // Question 2
        double carPrice = 25000;
        double truckPrice = 30000;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);
// Question 3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);
// Question 4
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number +" is " + squareRoot);
// Question 5
        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between the points is " + distance);







    }
}