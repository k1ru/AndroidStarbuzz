package com.hfad.starbuzz;

/**
 * Created by K1RU_NOTE on 03.08.2016.
 */
public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "Latte description", R.drawable.latte),
            new Drink("Cappuccino", "Cappuccino description", R.drawable.cappuccino),
            new Drink("Filter", "Filter description", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
