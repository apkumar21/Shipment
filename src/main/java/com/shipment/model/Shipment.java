package com.shipment.model;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="SHIPMENT")
@NoArgsConstructor
@Generated
@Getter @Setter
public class Shipment {

    @Id()
    @Column(name="shipment_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int shipment_id;

    @Column(name="pieces")
    private int pieces;

    @Column(name="value")
    private int value;

    @Column(name="weight")
    private int weight;

    @Column(name="volume")
    private int volume;

    @Column(name="shipper_name")
    private String shipper_name;

    @Column(name="consignee_name")
    private String consignee_name;

    @Column(name="shipped_date")
    private Date shipped_date;

    @Column(name="status")
    private String  status;



}
