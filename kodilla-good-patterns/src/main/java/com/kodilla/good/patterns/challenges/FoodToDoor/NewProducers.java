package com.kodilla.good.patterns.challenges.FoodToDoor;

public class NewProducers {

    public static void main(String[] args) {

        GmoFreeShop gmoFreeShop = new GmoFreeShop();
        gmoFreeShop.process();
        NoAntibioticsMeat noAntibioticsMeat = new NoAntibioticsMeat();
        noAntibioticsMeat.process();
    }

}
