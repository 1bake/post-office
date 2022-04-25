package kz.dar.academy.java.backend.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "post-core-api")
public interface PostOfficeFeign {

    @GetMapping("/post/check")
    String postCheck();

    @GetMapping("/post/all")
    String getAllPosts();

    @GetMapping("/post/${postId}")
    String getPostById();

}