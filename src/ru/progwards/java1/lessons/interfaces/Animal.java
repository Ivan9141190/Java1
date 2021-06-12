package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

public class Animal {
    double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public Animal() {

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

    static class Cow extends Animal {

        Cow(double weight) {
            super(weight);
        }

        public AnimalKind getKind() {
            return COW;
        }

        public FoodKind getFoodKind() {
            return HAY;
        }

        public double getWeight() {
            return weight;
        }

        public double getFoodCoeff() {
            return 0.05;
        }
    }
    static class Duck extends Animal {

        Duck(double weight) {
            super(weight);
        }

        public AnimalKind getKind() {
            return DUCK;
        }

        public FoodKind getFoodKind() {
            return CORN;
        }

        public double getWeight() {
            return weight;
        }

        public double getFoodCoeff() {
            return 0.04;
        }}
    public interface FoodCompare {
        int compareFoodPrice();

    }

    private FoodKind foodKind = FoodKind.HAY;
    public double getFood1kgPrice() {
        switch (foodKind) {
            case HAY: return 20d;
            case CORN: return 50d;
        }
        return 0;
    }
    // возвращает информацию о цене еды для данного животного
    public double getFoodPrice() {
        return calculateFoodWeight() * getFood1kgPrice();
    }

    public static void main(String[] args) {


Cow cow = new Cow(11.11);
Cow cow1 = new Cow(11.11);
Duck duck = new Duck(11.11);
        System.out.println(cow.equals(cow1));
        Animal animal = new Animal();
        System.out.println(cow.getFoodPrice());
    }}
