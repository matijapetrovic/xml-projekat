package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.account;

import lombok.*;

import java.util.Set;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class Account {
    private Long id;
    private String email;
    private String password;
    private Set<Authority> authorities;

    public boolean hasRole(String role) {
        return authorities
                .stream()
                .anyMatch(authority -> role.equals(authority.getName()));
    }

    public static Account withId(
            Long id,
            String email,
            String password,
            Set<Authority> authorities
    ) {
        return new Account(
                id,
                email,
                password,
                authorities
        );
    }

    public static Account of(
            String email,
            String password,
            Set<Authority> authorities
    ) {
        return withId(null, email, password, authorities);
    }
}
