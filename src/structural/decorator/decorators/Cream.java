package structural.decorator.decorators;

import structural.decorator.components.Coffee;

public class Cream implements CoffeeDecorator{

    private Coffee coffee;

    public Cream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int extraCharge() {
        return 0;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + this.extraCharge();
    }
}
