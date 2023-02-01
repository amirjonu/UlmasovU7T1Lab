import java.util.*;
public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }
    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int ind1, int ind2){
        if (ind1>-1 && ind2>-1 && ind1<inventory.size() && ind2< inventory.size()){
            Car temp= inventory.get(ind1);
            inventory.set(ind1, inventory.get(ind2));
            inventory. set(ind2, temp);
            return true;
        }
        return false;
    }

}
