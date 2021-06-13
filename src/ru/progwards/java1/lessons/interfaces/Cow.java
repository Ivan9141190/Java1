package ru.progwards.java1.lessons.interfaces;

 class Cow extends Animal {

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

        FoodKind foodKind = FoodKind.HAY;
        // информация о цене 1 кг еды
        public double getFood1kgPrice() {
            switch (foodKind) {
                case HAY: return 20d;

                case CORN: return 50d;
            }
            return 0;
        }

    }



