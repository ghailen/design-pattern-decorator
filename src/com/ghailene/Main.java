package com.ghailene;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Boisson espresso = new Expresso();
        System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.cout());


        /** ajouter les decorateurs **/ /* les ingrédients */
        espresso = new Lait(espresso);
        System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.cout());

        espresso = new Chocolat(espresso);
        System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.cout());

        espresso = new Caramel(espresso);
        System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.cout());


    }
}
