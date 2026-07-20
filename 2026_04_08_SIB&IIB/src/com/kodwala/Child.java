package com.kodwala;

class Parent
{
    static
    {
        System.out.println("Parent SIB");
    }

    {
        System.out.println("Parent IIB");
    }

    Parent()
    {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent
{
    static
    {
        System.out.println("Child SIB");
    }

    {
        System.out.println("Child IIB");
    }

    Child()
    {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args)
    {
        System.out.println("Main");

        new Child();
    }
}