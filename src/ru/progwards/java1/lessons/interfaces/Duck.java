package ru.progwards.java1.lessons.interfaces;
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

        public double getWeight() {
            return weight;
        }

        public double getFoodCoeff() {
            return 0.04;
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

