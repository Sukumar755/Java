package Assignments;
abstract class Personclass {

    abstract void eat();
    abstract void exercise();
}


class Athlete extends Personclass {

    @Override
    void eat() {
        System.out.println("Athlete takes nutritious food.");
    }

    @Override
    void exercise() {
        System.out.println("Athlete exercises daily.");
    }
}


class LazyPerson extends Personclass {

    @Override
    void eat() {
        System.out.println("Lazy person eats whatever he likes.");
    }


    @Override
    void exercise() {
        System.out.println("Lazy person doesn't exercise.");
    }
}


public class Asgmnts020224_3 {
    public static void main(String[] args) {

        Athlete A = new Athlete();
        LazyPerson L = new LazyPerson();


        A.eat();
        A.exercise();

        System.out.println();

        L.eat();
        L.exercise();
    }
}
