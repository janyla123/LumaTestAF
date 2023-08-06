package ui.enums;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public enum ErrorMessageLoginIn {

    loginValidationError("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
    @Getter
    String errorMessage;

    ErrorMessageLoginIn(String errorMessage){
        this.errorMessage=errorMessage;
    }

}
