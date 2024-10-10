package Homework17;


interface PairMarker<T,U>{
    Pair<T,U> makePair(T t,U u);

}
public class Pair <T, U>{
    private T first;
    private U second;
    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
    @Override
    public String toString() {
        return "Pair{" +  first + " : " + second + '}';
    }

    public static void main(String[] args){
    PairMarker<String,Integer> pairMarker = (t,u)-> new Pair<>(t,u);
    Pair<String,Integer> pair = pairMarker.makePair("Age",30);
        System.out.println(pair);
    }

}
