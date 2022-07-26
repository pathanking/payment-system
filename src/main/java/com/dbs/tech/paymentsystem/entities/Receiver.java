package com.dbs.tech.paymentsystem.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "receiver_tbl")
public class Receiver {

    @Id
    private Integer receiverId;
    private String name;
    private Double balance;
}
