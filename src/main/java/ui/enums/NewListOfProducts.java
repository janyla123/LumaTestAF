package ui.enums;

import lombok.Getter;

public enum NewListOfProducts {
    newListOfProducts("What's New"),
    newListOfProductsForWomen("Women"),
    newListOfProductsForMen("Men"),
    newListOfProductsForGear("Gear"),

    newListOfProductsForTraining("Training"),
    newListOfSaleProducts("Sale"),
    searchTems("Popular Search Terms"),
    hoodiesName("Circe Hooded Ice Fleece"),
    menTopsName("Argus All-Weather Tank"),
    womenBottomsName("Sybil Running Short"),
    womenTopsName("Breathe-Easy Tank"),

   shopNewYoga("New Luma Yoga Collection") ,
    takeItFromErin("Erin Recommends");
    @Getter
    String credentials;

    NewListOfProducts(String credentials) {
        this.credentials = credentials;
    }
}


