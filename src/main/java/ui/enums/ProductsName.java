package ui.enums;

import lombok.Getter;

public enum ProductsName {


    womenAndManTops("Tops"),
    womenAndMenBottoms("Bottoms"),
    womenHoodies("Hoodies & Sweatshirts");

    @Getter
    String credentials;

    ProductsName(String credentials) {
        this.credentials = credentials;
    }

}
