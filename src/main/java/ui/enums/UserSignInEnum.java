package ui.enums;

import lombok.Getter;

public enum UserSignInEnum {
    janylaSignInPassword("19970505Jan"),
    janylaSignInEmail("janyla_i@mail.ru");

    @Getter
    String credentials;

    UserSignInEnum(String credentials) {
        this.credentials = credentials;
    }
}
