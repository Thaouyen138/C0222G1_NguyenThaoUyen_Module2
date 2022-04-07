package _07_abstract_and_interface.practice.abstract_animal_interface_edible.animal;

import _07_abstract_and_interface.practice.abstract_animal_interface_edible.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
