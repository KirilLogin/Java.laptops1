/*
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Info {
}
public class Cat {
    int age;
    String name;
    String owner;
    boolean sterilization;
    String color;

    @Override
    public String toString() {
        return "name: " + name + ", owner: " + owner + ", age: " + age + ", sterilization: " + sterilization +
                ", color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj instanceof Cat cat){
//            Cat cat = (Cat) obj;
            return age == cat.age && name.equals(cat.name) && owner.equals(cat.owner) &&
                    sterilization == cat.sterilization && color.equals(cat.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return age + 7*name.hashCode() + 11*owner.hashCode() + 13* Objects.hashCode(sterilization) + 17*color.hashCode();
    }
}




Laptop cat2 = new Laptop();
cat2.name = "Васька";
cat2.age = 11;
cat2.owner = "Кирилл Петрович";
cat2.color = "Черный";
cat2.sterilization = false;

Laptop cat3 = new Laptop();
cat3.name = "Мурка";
cat3.age = 12;
cat3.owner = "Мария Ивановна";
cat3.color = "Белый";
cat3.sterilization = true;

Laptop cat4 = new Laptop();
cat4.name = "Жорик";
cat4.age = 9;
cat4.owner = "Татьяна Петровна";
cat4.color = "Рыжий";
cat4.sterilization = true;

Laptop cat5 = new Laptop();
cat5.name = "Жорик";
cat5.age = 9;
cat5.owner = "Татьяна Петровна";
cat5.color = "Рыжий";
cat5.sterilization = true;

printSet(findByColor("Рыжий", laptops));

static Set<Laptop> findByColor(String color, Set<Laptop> cats){
    Set<Laptop> res = new HashSet<>();
    for (Laptop cat: cats){
        if (cat.color.equals(color)){
            res.add(cat);
        }
    }
    return res;
*/
//Scanner scanner =
//        String bottom = null;
//        switch(bottom){
//        case "1":
//        System.out.println("Введите желаемое количество ОЗУ");
//            case "2":
//                    System.out.println("Введите желаемый объем ЖД");
//            case "3":
//                    System.out.println("Введите желаемую операционную систему");
//            case "4":
//                    System.out.println("Введите желаемый цвет");
//        }