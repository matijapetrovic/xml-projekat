package rs.ac.uns.ftn.xml.tim11.commissionerservice.controller.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.user.Authority;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class LoginDTO {
    String token;
    List<String> role;
    long expiresIn;

    public static LoginDTO of(String token, List<Authority> authorities, long expiresIn) {
        return new LoginDTO(token, mapRoles(authorities), expiresIn);
    }

    private static List<String> mapRoles(List<Authority> authorities) {
        return authorities
                .stream()
                .map(Authority::getName)
                .collect(Collectors.toList());
    }
}
