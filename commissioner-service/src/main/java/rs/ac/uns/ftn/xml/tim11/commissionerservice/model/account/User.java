package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.account;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private Account account;

    public String getEmail() { return account.getEmail(); }

    public static User withId(
            Long id,
            String firstName,
            String lastName,
            Account account
    ) {
        return new User(
                id,
                firstName,
                lastName,
                account
        );
    }

    public static User of(
            String firstName,
            String lastName,
            Account account
    ) {
        return withId(null, firstName, lastName, account);
    }
}
