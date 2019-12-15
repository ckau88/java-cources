package com.epam.lessons;

import java.util.Random;

public class Human {
    private String name;
    private int age;
    private float weight;
    private int height;
    public static int counter=0;

    public String giveName ()    {
        return name;
      //  System.out.println("Меня зовут: " + Human.name);
    }
    public int giveAge ()    {
       return age;
    }
    public int giveHeight ()    {
        return height;
    }
    public float giveWeight ()    {
        return weight;
    }
    public void setName (String name)    {
        this.name=name;
    }
    public void setRandomAge ()    {
        Random random = new Random();
        this.age = random.nextInt(50);
    }

    public Human ()
    {}

    public Human (String name)
    {
        this.name=name;
    }

    public Human (String name, int age, float weight, int height)
     {
         this.age=age;
         this.name=name;
         this.weight=weight;
         this.height=height;
         this.counter++;
     }
}
