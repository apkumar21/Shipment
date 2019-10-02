package com.shipment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipmentController {

    @RequestMapping("/shipment/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
