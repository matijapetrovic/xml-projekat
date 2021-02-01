package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.account.Authority;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class LoginDTO {
    String token;
    List<String> role;
    long expiresIn;

    public static LoginDTO of(String token, Set<Authority> authorities, long expiresIn) {
        return new LoginDTO(token, mapRoles(authorities), expiresIn);
    }

    private static List<String> mapRoles(Set<Authority> authorities) {
        return authorities
                .stream()
                .map(Authority::getName)
                .collect(Collectors.toList());
    }
}
