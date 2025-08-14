package abstraction;

abstract class Vehicle{

    abstract void start();
    void stop(){
        System.out.println("Vehicle Stopped");
    }

}

class Car extends Vehicle{

    void start(){
        System.out.println("Car enginee started");
    }

}

public class AbstractionDemo {
    public static void main(String args[]){
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}
