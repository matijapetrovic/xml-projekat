package rs.ac.uns.ftn.xml.tim11.commissionerservice.model.account;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class Authority {
    private Long id;
    private String name;

    public static Authority withId(
            Long id,
            String name) {
        return new Authority(id, name);
    }

    public static Authority of(
            String name) {
        return withId(null, name);
    }
}
