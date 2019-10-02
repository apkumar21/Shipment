package com.shipment;

import com.shipment.model.Shipment;
import com.shipment.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")

public class ShipmentController {

    @Autowired
    ShipmentService shipmentService;

    @GetMapping("/hello")
    public String hello() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/shipment/{id}")
    public ResponseEntity<Shipment> getShipmet(@PathVariable(value = "id") Integer shipment_id) {

        Optional<Shipment> shipments =  shipmentService.findById(shipment_id);


        if(shipments.isPresent()){
            return ResponseEntity.ok().body(shipments.get());
        }else{
            return ResponseEntity.notFound().build();
        }

    }
}
