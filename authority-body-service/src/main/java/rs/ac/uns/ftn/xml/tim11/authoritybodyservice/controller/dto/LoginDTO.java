package rs.ac.uns.ftn.xml.tim11.authoritybodyservice.controller.dto;

import lombok.*;
import rs.ac.uns.ftn.xml.tim11.authoritybodyservice.model.user.Authority;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.stream.Collectors;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {
    @XmlElement(name = "token")
    String token;

    @XmlElement(name = "role")
    List<String> role;

    @XmlElement(name = "expiresIn")
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
