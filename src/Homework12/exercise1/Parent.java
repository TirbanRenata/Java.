package Homework12.exercise1;

    public abstract class Parent {
        void message(){

        }
        public static void main(String...args){
            Subclass1 subclass1 = new Subclass1();
            Subclass2 subclass2 = new Subclass2();
            subclass1.message();
            subclass2.message();
        }
}
