package car;

import java.util.Scanner;

public class Car implements ICarInterface {
     private String driver;
    private String name;
    private int speed  = 0;
    boolean isDriving = true;
    String bClick = "";
    Scanner scan = new Scanner(System.in);



    public void helperMethods(){
        GameStartup.gameControls();
        bClick = scan.nextLine();
           if(bClick.equals("x")){
                Drive();
            }
            else if(bClick.equals("z")){
                Stop();
            }
            else if(bClick.equals("y")){
                TurnLeft();
            }
            else if(bClick.equals("u")){
                TurnRight();
            }
            else if(bClick.equals("b")){
                Accelerate();
            }
            else {
                System.out.println("Not a valid button click!");
            }
            while(isDriving){
                helperMethods();
                RandomEvent();
            }

        }







    @Override
    public void Drive() {
        speed = speed +60;
        System.out.println("This " + this.name +" is driving at " + speed +" mph!");

    }

    @Override
    public void Stop() {
        System.out.println("This car is stopping");
        speed = 0;
        System.out.println(" speed: " + speed );

    }

    @Override
    public void TurnRight() {
        System.out.println("This car is turning right");
        speed = 30;
        System.out.println(" speed: " + speed );

    }
    public void TurnLeft() {
        System.out.println("This car is turning left");
        speed = 30;
        System.out.println(" speed: " + speed );

    }
    public void Accelerate(){
            speed = speed + 10;
            System.out.println(" speed: " + speed);


    }
    public void RandomEvent(){
        if(speed > 100){
            System.out.println(" You crashed :( ");
        }
        else{
            System.out.println("Slow down");
        }
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        driver = driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){

    if(name.equals("Lamborghini") || name.equals("BMW") || name.equals("Dragon")) {
        this.name = name;
        System.out.println("You chose: " + name);
        System.out.println("Speed " + speed);
    }
        else {
        System.out.println("Not a valid entry!");
    }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
