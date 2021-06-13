package ru.progwards.java1.lessons.interfaces;
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
            return 0.03;
        }

        FoodKind foodKind = FoodKind.CORN;
        // информация о цене 1 кг еды
        public double getFood1kgPrice() {
            switch (foodKind) {
                case HAY: return 20d;

                case CORN: return 50d;
            }
            return 0;
        }
    }





