import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.price = 100000;
        laptop1.disk = 250;
        laptop1.RAM = 16;
        laptop1.system = "Windows";
        laptop1.color = "Черный";

        Laptop laptop2 = new Laptop();
        laptop2.price = 150000;
        laptop2.disk = 250;
        laptop2.RAM = 16;
        laptop2.system = "Linux";
        laptop2.color = "Серый";

        Laptop laptop3 = new Laptop();
        laptop3.price = 200000;
        laptop3.disk = 300;
        laptop3.RAM = 8;
        laptop3.system = "Windows";
        laptop3.color = "Красный";

        Laptop laptop4 = new Laptop();
        laptop4.price = 200000;
        laptop4.disk = 250;
        laptop4.RAM = 8;
        laptop4.system = "Mac OS";
        laptop4.color = "Белый";


        Scanner input = new Scanner(in);
        out.print("Введите цифру, соответствующую необходимому критерию:\n1 - ОЗУ \n2 - Объем ЖД \n3 - Операционная система \n4 - Цвет \n5 - поиск");
        out.println("\n");
        String bottom = input.nextLine(); // здесь идет считывание текста
        String[] array = new String[]{"2", "3", "4", "5"};
        /*switch(bottom){
            case "1":
                System.out.println("Введите желаемый ОЗУ");
                break;
            case "2":
                System.out.println("Введите желаемый объем ЖД");
                break;
            case "3":
                System.out.println("Введите желаемую операционную систему");
                break;
            case "4":
                System.out.println("Введите желаемый цвет");
                break;
            default:
                break;

        }*/
        int RAM = 0;
        int disk = 0;
        String color = null;
        String system = null;
        if (Objects.equals(bottom, "1")) {
            out.println("Введите желаемый ОЗУ: 8, 16");
            /*for (int i = 1; i < array.length; i++) {
                if (!Objects.equals(bottom, array[i])) {*/
            RAM = Integer.parseInt(input.nextLine());
        }

        if (Objects.equals(bottom, "12")) {
            out.println("Введите желаемый ОЗУ: 8, 16\n");
            RAM = Integer.parseInt(input.nextLine());
            out.println("Введите желаемый объем ЖД: 250, 300");
            disk = Integer.parseInt(input.nextLine());
        }
        if (Objects.equals(bottom, "13")) {
            out.println("Введите желаемый ОЗУ: 8, 16\n");
            RAM = Integer.parseInt(input.nextLine());
            out.println("Введите желаемую систему: Windows, Linux, Mac OS");
            system = input.nextLine();
        }
        if (Objects.equals(bottom, "14")) {
            out.println("Введите желаемый ОЗУ: 8, 16\n");
            RAM = Integer.parseInt(input.nextLine());
            out.println("Введите желаемый цвет: Белый, Красный, Черный, Серый");
            color = input.nextLine();
        }
        if (Objects.equals(bottom, "23")) {
            out.println("Введите желаемый объем ЖД: 250, 300\n");
            disk = Integer.parseInt(input.nextLine());
            out.println("Введите желаемую систему: Windows,Linux,Mac OS");
            system = input.nextLine();
        }
        if (Objects.equals(bottom, "24")) {
            out.println("Введите желаемый объем ЖД: 250, 300\n");
            disk = Integer.parseInt(input.nextLine());
            out.println("Введите желаемый цвет: Белый, Красный, Черный, Серый");
            color = input.nextLine();
        }
        if (Objects.equals(bottom, "34")) {
            out.println("Введите желаемую систему: Windows, Linux, Mac OS\n");
            system = input.nextLine();
            out.println("Введите желаемый цвет: Белый, Красный, Черный, Серый");
            color = input.nextLine();
        }
        if (Objects.equals(bottom, "34")) {
            out.println("Введите желаемую систему: Windows, Linux, Mac OS\n");
            system = input.nextLine();
            out.println("Введите желаемый цвет: Белый, Красный, Черный, Серый");
            color = input.nextLine();
        }
        if (Objects.equals(bottom, "123")) {
            out.println("Введите желаемый ОЗУ: 8, 16\n");
            RAM = Integer.parseInt(input.nextLine());
            out.println("Введите желаемый объем ЖД: 250, 300\n");
            disk = Integer.parseInt(input.nextLine());
            out.println("Введите желаемую систему: Windows, Linux, Mac OS");
            system = input.nextLine();
        }
        if (Objects.equals(bottom, "124")) {
            out.println("Введите желаемый ОЗУ: 8, 16\n");
            RAM = Integer.parseInt(input.nextLine());
            out.println("Введите желаемый объем ЖД: 250, 300\n");
            disk = Integer.parseInt(input.nextLine());
            out.println("Введите желаемый цвет: Белый, Красный, Черный, Серый");
            color = input.nextLine();
        }
        if (Objects.equals(bottom, "1234")) {
            out.println("Введите желаемый ОЗУ: 8, 16\n");
            RAM = Integer.parseInt(input.nextLine());
            out.println("Введите желаемый объем ЖД: 250, 300\n");
            disk = Integer.parseInt(input.nextLine());
            out.println("Введите желаемую систему: Windows, Linux, Mac OS\n");
            system = input.nextLine();
            out.println("Введите желаемый цвет: Белый, Красный, Черный, Серый");
            color = input.nextLine();
        }
        if (Objects.equals(bottom, "134")) {
            out.println("Введите желаемый ОЗУ: 8,16\n");
            RAM = Integer.parseInt(input.nextLine());
            out.println("Введите желаемую систему: Windows, Linux, Mac OS\n");
            system = input.nextLine();
            out.println("Введите желаемый цвет: Белый, Красный, Черный, Серый");
            color = input.nextLine();
        }
        if (Objects.equals(bottom, "2")) {
            out.println("Введите желаемый объем ЖД: 250, 300");
            disk = Integer.parseInt(input.nextLine());
        }
        if (Objects.equals(bottom, "3")) {
            out.println("Введите желаемую систему: Windows, Linux, Mac OS");
            system = input.nextLine();
        }
        if (Objects.equals(bottom, "4")) {
            out.println("Введите желаемый цве: Белый, Красный, Черный, Серый");
            color = input.nextLine();
        }


        out.println(RAM);
        out.println(disk);
        out.println(system);
        out.println(color);

        out.println("Укажите желаемую цену:");
        Integer price = Integer.parseInt(input.nextLine());


//        System.out.println(cat4.equals(cat5));
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);

        printSet(laptops);

        out.println();
        if(Objects.equals(bottom, "4")) {
            printSet(findByColor(color, laptops));
        }
        printSet(findByRAM (RAM, laptops));
        printSet(findByDisk (disk, laptops));
        printSet(findBySystem (system, laptops));


    }
    static Set<Laptop> findByColor (String color, Set < Laptop > laptops){
        Set<Laptop> res = new HashSet<>();
        for (Laptop laptop : laptops) {
            if (laptop.color.equals(color)) {
                res.add(laptop);
            }
        }
        return res;
    }

    static Set<Laptop> findByRAM (Integer RAM, Set < Laptop > laptops){
        Set<Laptop> res = new HashSet<>();
        for (Laptop laptop : laptops){
            if(Objects.equals(laptop.RAM, RAM)){
                res.add(laptop);
            }
        }
        return res;
    }

    static Set<Laptop> findByDisk (Integer disk, Set < Laptop > laptops){
        Set<Laptop> res = new HashSet<>();
        for (Laptop laptop : laptops){
            if(Objects.equals(laptop.disk, disk)){
                res.add(laptop);
            }
        }
        return res;
    }

    static Set<Laptop> findBySystem (String system, Set < Laptop > laptops){
        Set<Laptop> res = new HashSet<>();
        for (Laptop laptop : laptops) {
            if (laptop.system.equals(system)) {
                res.add(laptop);
            }
        }
        return res;
    }

//    static Set<Laptop> findBy (Integer RAM, Integer disk, String system, String color, Set < Laptop > laptops){
//        Set<Laptop> res = new HashSet<>();
//        for (Laptop laptop : laptops){
//            if(Objects.equals(laptop.RAM, RAM){
//                res.add(laptop);
//            if
//            }
//        }
//    }
    static void printSet(Set<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            out.println(laptop);
        }
    }
}