package car;

import groovy.console.ui.SystemOutputInterceptor;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameStartup {




    public void Menu (){
        System.out.println("Welcome to Racer 3! \n");
        System.out.println("Choose your Vehicle! \n");
        System.out.println(CarTypes.BMW + "");
        System.out.println(CarTypes.Lamborghini + "");
        System.out.println(CarTypes.Dragon + "");
        System.out.println(CarTypes.Volt + "");




    }
    public static void askName (){
        System.out.println(" What is the drivers name?: ");
    }
    public static void gameControls(){
        System.out.println("press x to start driving");
        System.out.println("press z to stop driving");
        System.out.println("press y to turn left ");
        System.out.println("press u to turn right ");
        System.out.println("press b to accelerate");
        System.out.println("");
