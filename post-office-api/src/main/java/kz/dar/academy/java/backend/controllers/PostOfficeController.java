package kz.dar.academy.java.backend.controllers;

import kz.dar.academy.java.backend.feign.ClientFeign;
import kz.dar.academy.java.backend.feign.PostOfficeFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/office")
public class PostOfficeController {

    @Autowired
    private PostOfficeFeign postOfficeFeign;

    @Autowired
    private ClientFeign clientFeign;

    @GetMapping("/check")
    public String check(){
        return "Post-office-api is working";
    }

    @GetMapping("/post/check")
    public String checkPostOfficeFeihnClient(){
        return postOfficeFeign.postCheck();
    }

    @GetMapping("/post/all")
    public String getAllPosts(){
        return postOfficeFeign.getAllPosts();
    }

    @GetMapping("/post/${postId}")
    public String getPostById(){
        return postOfficeFeign.getPostById();
    }

    @GetMapping("/client/check")
    public String checkClient(){
        return clientFeign.checkClient();
    }

    @GetMapping("/client/all")
    public String getAllClients(){
        return clientFeign.getAllClients();
    }

    @GetMapping("/client/${clientId}")
    public String getClientById(){
        return clientFeign.getClientById();
    }

}
