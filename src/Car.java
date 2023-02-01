public class Car {
    private String model;
    private int miles;

    public Car(String mod, int mi){
        model=mod;
        miles=mi;
    }
    public String toString(){
        return model+ " "+ miles+ "mi";
    }
}
