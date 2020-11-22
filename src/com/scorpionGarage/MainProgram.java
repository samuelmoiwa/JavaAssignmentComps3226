package com.scorpionGarage;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        System.out.println("\n\n");
        System.out.println("         ####################################");
        System.out.println("         #   WELCOME TO MAFAR'S CAR CENTER  #");
        System.out.println("         ####################################\n");
        System.out.println("          select from the numbers below");
        System.out.println("              1. To Exit");
        System.out.println("              2. To Continue");

        Scanner exitContinue = new Scanner(System.in);


        int toExitContinue = exitContinue.nextInt();
        if (toExitContinue == 1)
        {
            System.out.print("Exiting");
            String load = ".";
            for(int i = 0; i <=14; i++){
                Thread.sleep(300);
                System.out.print(load);
            }
            System.out.println("\n");
            System.exit(toExitContinue);
        } else if (toExitContinue == 2){
                Human humanOne = new Human("Hawa","14/03/1984","female");
               System.out.println(humanOne.getName() + " enter the car shop to enquire about cars\nafter several minutes of searching, she find some list of cars to check\n");

            System.out.print("Loading list of cars");
            String load = ".";
            for(int i = 0; i <=14; i++){
                Thread.sleep(400);
                System.out.print(load);
            }
            System.out.println("\n");
                Car carOne = new Car(48000,"green",1500,"BMW",127,54,4,true,false,15,5);
                Car carTwo = new Car(98000,"blue",1400,"NISSAN",107,40,4,true,false,15,5);
                Car carThree = new Car(265000,"yellow",13200,"Lamborghini",07,410,2,false,true,31,4);
                Car carFour = new Car(88000,"black",1800,"Ford",117,24,4,false,true,20,5);
                System.out.println("Car 1 Name :  "+carOne.getName()+" | Car price:  $" + carOne.getPrice()+" | car color: "+ carOne.getColor()+" | car mileage "+ carOne.getCurrentMilage());
                System.out.println("Car 2 Name :  "+carTwo.getName()+" | Car price:  $" + carTwo.getPrice()+" | car color: "+ carTwo.getColor()+" | car mileage "+ carTwo.getCurrentMilage()+ " | car description : Automatic "+carTwo.getAutomatic()+ ", Manual "+carTwo.getManual());
                System.out.println("Car 3 Name :  "+carThree.getName()+" | Car price:  $" + carThree.getPrice()+" | car color: "+ carThree.getColor()+" | car mileage "+ carThree.getCurrentMilage()+ " | car description : Automatic "+carThree.getAutomatic()+ ", Manual "+carThree.getManual());
                System.out.println("Car 4 Name :  "+carFour.getName()+" | Car price:  $" + carFour.getPrice()+" | car color: "+ carFour.getColor()+" | car mileage "+ carFour.getCurrentMilage()+"\n");

            System.out.println("after looking the features of about 4 cars "+ humanOne.getName()+ " decide to go with the " + carThree.getName()+ "\n");
            System.out.println(carThree.getName()+ " * Features");
            System.out.println("Price             : $"+carThree.getPrice());
            Thread.sleep(2000);
            System.out.println("Color             : "+carThree.getColor());
            Thread.sleep(2000);
            System.out.println("Top Speed         : "+carThree.getTopSpeed()+" KMH");
            Thread.sleep(2000);
            System.out.println("Name              : "+carThree.getName());
            Thread.sleep(2000);
            System.out.println("Current Milage    : KM"+carThree.getCurrentMilage());
            Thread.sleep(2000);
            System.out.println("Fuel Capacity     : "+carThree.getFuelCapacity());
            Thread.sleep(2000);
            System.out.println("Number of Doors   : "+carThree.getNumberOfDoors());
            Thread.sleep(2000);
            System.out.println("Automatic         : "+carThree.getAutomatic());
            Thread.sleep(2000);
            System.out.println("Tara Size         : "+carThree.getTaraSize()+" Inches");
            Thread.sleep(2000);
            System.out.println("Capacity          : "+carThree.getCapacity()+ "\n");
            Thread.sleep(2000);

                    System.out.println(humanOne.getName()+" Buy the car at $"+carThree.getPrice());
                    System.out.println("THANK YOU\n\n");


        }else {

            System.out.println("------WRONG ENTRY, TRY AGAIN------");
            System.out.print("Exiting");
            String load = ".";
            for(int i = 0; i <=14; i++){
                Thread.sleep(300);
                System.out.print(load);
            }
        }

    }

    public void human(){


    }


}
