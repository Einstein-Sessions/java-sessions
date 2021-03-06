package com.newmethods;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Person {

    private String name;
    private String lastName;
    public static final Person DEFAULT_PERSON = new Person("Artemas", "Muzanenhamo");

}
