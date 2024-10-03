package Homework13;

public class Engine {
    void start(){
        System.out.println("Engine starts.");
    }
}

class Car {
    private Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }
    void start(){
        engine.start();
    }
}
