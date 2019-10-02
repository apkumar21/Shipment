package com.shipment.service;

import com.shipment.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentService extends JpaRepository<Shipment,Integer> {
}
