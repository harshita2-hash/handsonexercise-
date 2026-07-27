package com.cognizant.handson4;

public class Difference {

    public static void main(String[] args) {

        System.out.println("Difference Between JPA, Hibernate and Spring Data JPA");
        System.out.println();

        System.out.println("JPA");
        System.out.println("1. JPA is a Specification.");
        System.out.println("2. It defines standards for persistence.");
        System.out.println("3. It has no implementation.");

        System.out.println();

        System.out.println("Hibernate");
        System.out.println("1. Hibernate is an ORM Framework.");
        System.out.println("2. It implements JPA.");
        System.out.println("3. It handles database operations.");

        System.out.println();

        System.out.println("Spring Data JPA");
        System.out.println("1. Spring Data JPA works on top of JPA.");
        System.out.println("2. It reduces boilerplate code.");
        System.out.println("3. It provides JpaRepository.");
        System.out.println("4. It manages transactions automatically.");
    }
}