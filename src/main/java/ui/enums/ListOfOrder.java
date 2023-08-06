package ui.enums;

import lombok.Getter;

public enum ListOfOrder {

    listOfOrder("Shipping Address");
    @Getter
    String listOfOrderForCustomer;

    ListOfOrder(String listOfOrderForCustomer){
        this.listOfOrderForCustomer=listOfOrderForCustomer;
    }
}
