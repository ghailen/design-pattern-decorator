package com.ghailene;

public class Chocolat extends BoissonDecorateur {


    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 3.3 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }
}
