package car;


import java.util.*;

public class Main {
     public static void main(String[] args) {
         GameStartup g = new GameStartup();

         int carSpeed = 0;
         Scanner s = new Scanner(System.in);
         Car car = new Car();

         g.Menu();
         String input = s.nextLine();
         car.setName(input);
          String carName = input;
         GameStartup.askName();
         car.helperMethods();



     }
     }
