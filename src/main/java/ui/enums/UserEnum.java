package ui.enums;

import lombok.Getter;

public enum UserEnum {

    janylaUserName("Janyla"),
    janylaLastName("Ibraeva"),
    janylaPassword("19970505Jan"),
    janylaEmail("ourselves-state@ogbrgo2c.mailosaur.net"),

    janylaNullResult( " ");





    @Getter
    String credentials;

    UserEnum(String credentials) {
        this.credentials = credentials;
    }
}

