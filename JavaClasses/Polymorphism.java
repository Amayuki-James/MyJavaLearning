package JavaClasses;

public class Polymorphism {
    // Polymorphism means "many forms", 
    // and it occurs when we have multiple classes that are related to each other by inheritance.
    // Think of a superclass called Animal that has a method called animalSound().
    // Then, we have subclasses called Dog and Cat that inherit from Animal and override the animalSound() method.
    // This allows us to have multiple classes that perform the same action, but in different ways.

    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog barks");
        }
    }

    class Cat extends Animal {
        public void animalSound() {
            System.out.println("The cat meows");
        }
    }

    class Main {
        public static void main(String[] args) {
            Polymorphism poly = new Polymorphism();
            Animal myAnimal = poly.new Animal();
            Animal myDog = poly.new Dog();
            Animal myCat = poly.new Cat();

            myAnimal.animalSound();
            myDog.animalSound();
            myCat.animalSound();

        }
    }
}
