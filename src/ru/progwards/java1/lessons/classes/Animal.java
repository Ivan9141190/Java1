package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

    Animal() {
    }

    public Animal(double weight) {
        this.weight = weight;
    }

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}

    AnimalKind ANIMAL = AnimalKind.ANIMAL;
    AnimalKind COW = AnimalKind.COW;
    AnimalKind HAMSTER = AnimalKind.HAMSTER;
    AnimalKind DUCK = AnimalKind.DUCK;

    public AnimalKind getKind() {
        return ANIMAL;
    }

    enum FoodKind {UNKNOWN, HAY, CORN}

    FoodKind UNKNOWN = FoodKind.UNKNOWN;
    FoodKind HAY = FoodKind.HAY;
    FoodKind CORN = FoodKind.CORN;
    public FoodKind getFoodKind() {
        return UNKNOWN;
    }

    @Override
    public String toString() {
        return "I am " + getKind() + " eat " + getFoodKind();
    }

    static class Cow extends Animal {

        public AnimalKind getKind() {
            return COW;
        }

        public FoodKind getFoodKind(){
            return HAY;
        }
    }
class Hamster extends Cow {
    public AnimalKind getKind() {
        return HAMSTER;
    }

    public FoodKind getFoodKind() {
        return CORN;
    }
}
    class Duck extends Hamster {
        public AnimalKind getKind(){
            return DUCK;
        }
        public FoodKind getFoodKind(){
            return CORN;
        }
    }


    public static void main(String[] args) {
        Animal animal = new Animal(2);
        Cow cow = new Cow();
        System.out.println(animal);
        System.out.println(cow);
    }
}
