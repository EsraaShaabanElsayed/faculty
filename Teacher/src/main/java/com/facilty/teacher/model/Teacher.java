package com.facilty.teacher.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@RequiredArgsConstructor

@Document(collection = "teacher")
public class Teacher {
    @Id
    private String id;
    @NotEmpty
    private String name;
    @Email
    private String email;
    private String password;

//    public Teacher(String id,String name, String email, String password) {
//        this.id = id;
//        this.name = name;
//        this.email=email;
//        this.password=password;
//    }

//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

//    public void setId(String id) {
//        this.id = id;

//    }
}
