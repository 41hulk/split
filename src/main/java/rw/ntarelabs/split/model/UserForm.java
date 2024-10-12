package rw.ntarelabs.split.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm {
    private String name;
    private String email;
    private String password;
    private String gender;
    private boolean married;
    private String profession;

    public UserForm(String name, String email, String password, String gender, boolean married, String profession) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.married = married;
        this.profession = profession;

    }

    public UserForm() {
    }
}


