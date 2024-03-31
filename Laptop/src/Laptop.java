import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Laptop {
    int price;
    int disk;
    int RAM;
    String system;
    String color;

    @Override
    public String toString(){
        return "Price: " + price + ",Disc: " + disk + ", Ram: " + RAM + ", System: " + system +
                ", color: " + color;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj instanceof Laptop laptop){
           // Laptop laptop = (Laptop) obj;
            return price == laptop.price && disk == laptop.disk && RAM == laptop.RAM &&
                    system.equals(laptop.system) && color.equals(laptop.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return price + 7*disk + 11*RAM + 13*system.hashCode() + 17*color.hashCode();
    }
}













