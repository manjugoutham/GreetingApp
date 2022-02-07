package com.greetingapp.greetingapp.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class User {

    private String firstname;
    private String lastname;

//    @Override
//    public String toString() {
//        String str = (firstname != null) ? firstname + " " : "";
//        str += (lastname != null) ? lastname : "";
//        return str.trim();
//    }
}
