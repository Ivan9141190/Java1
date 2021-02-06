package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

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

    public String toStringFull() {

        return "I am " + getKind() + ", eat " + getFoodKind() + calculateFoodWeight();
    }

}



     class Cow extends Animal {

    Cow(double weight){ super(weight);
    }
        public AnimalKind getKind() {
            return COW;
        }

        public FoodKind getFoodKind(){
            return HAY;
        }
         public double getWeight(){
             return weight;
         }
         public double getFoodCoeff(){
             return 0.05;
         }


}

class Hamster extends Animal {

    Hamster (double weight){ super(weight);
    }
    public AnimalKind getKind() {
        return HAMSTER;
    }

    public FoodKind getFoodKind() {
        return CORN;
    }
    public double getWeight(){
        return weight;
    }
    public double getFoodCoeff(){
        return 0.03;}
}
    class Duck extends Animal {

        Duck(double weight) {
            super(weight);
        }

        public AnimalKind getKind() {
            return DUCK;
        }

        public FoodKind getFoodKind() {
            return CORN;
        }
        public double getWeight(){
            return weight;
        }
        public double getFoodCoeff(){
            return 0.04;}

        public static void main(String[] args) {
            Animal animal = new Animal(1);
            Cow cow = new Cow(1);
            Duck duck = new Duck(1);
            Hamster hamster = new Hamster(1);
            System.out.println(animal);
            System.out.println(cow);
            System.out.println(duck);
            System.out.println(hamster);


        }
    }
