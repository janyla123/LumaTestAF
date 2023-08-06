package ui.config;


import com.github.javafaker.Faker;

import java.util.Arrays;


public class FakerDataProvider {

    Faker faker = new Faker();

    public String generateFirstName() {
        return faker.name().firstName();
    }

    public String generateLastName() {
        return faker.name().lastName();
    }

    public String generateEmail() {

        return faker.internet().emailAddress();

    }

    public String generatePassword() {
        return faker.internet().password();
    }

    public String generateCompany() {
        return faker.company().name();
    }

    public String generateStreetAddress() {
        return faker.address().streetAddress();
    }

    public String generateCity() {
        return faker.address().city();
    }

    public String generateState() {
        return faker.address().state();
    }

    public String generateCountry() {
        return faker.address().country();
    }
    public String generatePhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

    public String generatePostalCode() {
        return faker.regexify("\\d{5}-\\d{4}");
    }

}