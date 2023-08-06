package ui.models;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode // @Data- vse est'
@NoArgsConstructor
@Builder
public class User {

    private String userFirstName;

    private String userLastName;

    private String userEmail;

    private String userPassword;

    private String userConfirmPassword;



}
