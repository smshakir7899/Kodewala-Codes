package com.kodewala.client;

import com.kodewala.example.Employee;

public class Manager extends Employee
{
    public Manager(String name)
    {
        super(name);
    }

    public void displayGreeting()
    {
        sayHello();
    }

    public static void main(String[] args)
    {
        Manager manager = new Manager("Shakir");

        manager.displayGreeting();
    }
}