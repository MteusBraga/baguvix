package com.baguvix.baguvix.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor

public class HomelessPerson {
    private String username;
    private String password;
    private String user;
    private Date createdAt;
}
