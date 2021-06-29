package ru.progwards.java1.lessons.interfaces;
import java.util.Objects;

public class Animal implements CompareWeight {
    double weight;
    private Animal animal;

    public Animal(double weight) {
        this.weight = weight;
    }
    public CompareWeight.CompareResult compareWeight(double smthHasWeigt) {

        if (smthHasWeigt >= weight) {
            return LESS;
        } else {
            if (smthHasWeigt == weight) {
                return EQUAL;
            }
            if (smthHasWeigt <= weight) {
                return GREATER;
            }

            return null;
        }

    }

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
    AnimalKind ANIMAL = AnimalKind.ANIMAL;
   AnimalKind COW = AnimalKind.COW;
   AnimalKind HAMSTER = AnimalKind.HAMSTER;
   AnimalKind DUCK =AnimalKind.DUCK;

    public AnimalKind getKind() {
        return ANIMAL;
    }

    enum FoodKind {UNKNOWN, HAY, CORN}

   Animal.FoodKind UNKNOWN = FoodKind.UNKNOWN;
    Animal.FoodKind HAY = FoodKind.HAY;
   Animal.FoodKind CORN = FoodKind.CORN;

    public Animal.FoodKind getFoodKind() {
        return UNKNOWN;
    }

    @Override
    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind() ;

    }

    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff() {
        return 0.02;
    }

    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }

    @Override
    public boolean equals(Object anOject) {
        if (this == anOject) return true;
        if (anOject == null || getClass() != anOject.getClass()) return false;
        Animal animal = (Animal) anOject;
        return Double.compare(animal.weight, weight) == 0 && ANIMAL == animal.ANIMAL && COW == animal.COW && HAMSTER == animal.HAMSTER && DUCK == animal.DUCK && UNKNOWN == animal.UNKNOWN && HAY == animal.HAY && CORN == animal.CORN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, ANIMAL, COW, HAMSTER, DUCK, UNKNOWN, HAY, CORN);
    }

    public String toStringFull() {

        return "I am " + getKind() + ", eat " + getFoodKind() +" " +  calculateFoodWeight();
    }

    FoodKind foodKind = FoodKind.UNKNOWN;
    // информация о цене 1 кг еды
    public double getFood1kgPrice() {
        switch (foodKind) {
            case HAY: return 20d;

            case CORN: return 50d;
        }
        return 0;
    }
    public int compareFoodPrice(Animal aminal){
        
        return Double.compare(getFoodPrice(), aminal.getFoodPrice());
    }

    public double getFoodPrice() {
        return calculateFoodWeight() * getFood1kgPrice();
    }

    public static void main(String[] args) {

Hamster hamster =new Hamster(2.00);
Cow cow = new Cow(1.00);
Cow cow1 = new Cow(1.00);
Duck duck = new Duck(1.00);

        System.out.println(cow.equals(cow1));
       // Animal animal = new Animal();
        System.out.println(duck);
        System.out.println(cow.getFoodPrice());
        System.out.println(hamster.getFoodPrice());
        Animal h = new Hamster(0.2);
        Animal d = new Duck(0.2);
        System.out.println(h.compareFoodPrice(d));
    }}
