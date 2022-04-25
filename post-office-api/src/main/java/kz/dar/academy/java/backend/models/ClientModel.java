package kz.dar.academy.java.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientModel {

    @NotNull
    private String name;
    @NotNull
    private String surname;
    @Email
    private String email;



}