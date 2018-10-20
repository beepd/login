package com.beepd.login.entity;

import com.beepd.login.model.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Boolean enabled;

    @Column
    @Enumerated(EnumType.STRING)
    private Role role;

}
