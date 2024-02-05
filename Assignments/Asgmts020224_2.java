package Assignments;

abstract class Animal {

    abstract void eat();
    abstract void sleep();
}


    class Lion extends Animal {

        @Override
        void eat() {
            System.out.println("Lion eats meat.");
        }


        @Override
        void sleep() {
            System.out.println("Lion sleeps for more than 15 hours a day.");
        }
    }

    // Tiger class extending Animal
    class Tiger extends Animal {

        @Override
        void eat() {
            System.out.println("Tiger eats meat");
        }


        @Override
        void sleep() {
            System.out.println("Tiger sleeps in forests.");
        }
    }


    class Deer extends Animal {

        @Override
        void eat() {
            System.out.println("Deer eats grass.");
        }


        @Override
        void sleep() {
            System.out.println("Deer sleeps in fields.");
        }
    }


    public class Asgmts020224_2 {
        public static void main(String[] args) {

            Lion L = new Lion();
            L.eat();
            L.sleep();
            System.out.println();

            Tiger tiger = new Tiger();
            tiger.eat();
            tiger.sleep();
            System.out.println();

            Deer D = new Deer();
            D.eat();
            D.sleep();




        }
    }

