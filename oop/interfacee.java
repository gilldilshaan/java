interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {

    public void eatPlants() {
        System.out.println("Bear eats plants.");
    }

    public void eatMeat() {
        System.out.println("Bear eats meat.");
    }

    void display() {
        System.out.println("Bear is an omnivore.");
    }
}

public class interfacee {
    public static void main(String[] args) {

        Bear b = new Bear();

        b.eatPlants();
        b.eatMeat();
        b.display();
    }
}