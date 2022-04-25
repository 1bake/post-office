package kz.dar.academy.java.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostModel {

    @NotNull
    private String postId;

    @NotNull
    private ClientModel client;

    @NotNull
    private ClientModel receiver;

    @NotNull
    private String postItem;

    @NotNull
    private String status;

}