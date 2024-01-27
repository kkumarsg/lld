package designpatterns.Decorator.addons;

import designpatterns.Decorator.Beverage;

public class Mocha implements Beverage {
    Beverage cb;
    public Mocha(Beverage b){
        this.cb = b;
    }
    @Override
    public int getCost() {
        return 20 + cb.getCost();
    }


}
