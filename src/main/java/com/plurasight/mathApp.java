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








    }
}