package rw.ntarelabs.split.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String email;
    private String role;
    private String gender;

    public User(String name, String email, String role, String gender) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.gender = gender;
    }

}
