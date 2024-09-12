package Homework11;

 class Animal {

    public void sound(){
        System.out.println("Animal makes souds");
    }


}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog makes bark.");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog makes meow.");}
}
class Wolf extends Animal{
    @Override
    public void sound(){
        System.out.println("Wolf makes how");
    }
}
public class TestAnimal{
     public void main(String...args){
         Animal dog = new Dog();
         Animal cat = new Cat();
         Animal wolf = new Wolf();

         dog.sound();
         cat.sound();
         wolf.sound();
     }
}
