import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Fruit
{
    String color;
    String name;
    int numberOfFruits;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFruits() {
        return numberOfFruits;
    }

    public void setNumberOfFruits(int numberOfFruits) {
        this.numberOfFruits = numberOfFruits;
    }

    public Fruit(String color, String name, int numberOfFruits) {
        this.color = color;
        this.name = name;
        this.numberOfFruits = numberOfFruits;
    }
}

public class PredicateInJava {

    public static List<Fruit> getFruits(List<Fruit> fruits, Predicate<Fruit> predicate)
    {
        return fruits.stream().filter(predicate).collect(Collectors.toList());

    }

    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("Red","Apple",100);
        Fruit fruit2 = new Fruit("Blue","Berry",1);
        Fruit fruit3 = new Fruit("Green","Mango",50);

        List<Fruit> fruitsList = new ArrayList<>();
        fruitsList.add(fruit1);
        fruitsList.add(fruit2);
        fruitsList.add(fruit3);
        //  fruitsList.stream().filter(f->f.numberOfFruits>10).collect(Collectors.toList());
        // fruitsList.stream().filter(f->f.color=="white").collect(Collectors.toList());
        //fruitsList.stream().filter(f->f.name.startsWith("A")).collect(Collectors.toList());



        System.out.println(PredicateInJava.getFruits(fruitsList, fruit -> fruit.numberOfFruits>10).stream().count());
        System.out.println(new ArrayList<>(PredicateInJava.getFruits(fruitsList, fruit -> fruit.name.startsWith("A"))).size());
        PredicateInJava.getFruits(fruitsList, fruit -> fruit.color.equals("Green")).stream().forEach(System.out::println);

    }
}
//Code is still buggy will update it soon
//thank you, Oracle