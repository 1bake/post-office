package kz.dar.academy.java.backend.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-core-api")
public interface ClientFeign {

    @GetMapping("/client/check")
    String checkClient();

    @GetMapping("/client/all")
    String getAllClients();

    @GetMapping("/cleint/${clientId}")
    String getClientById();
}
