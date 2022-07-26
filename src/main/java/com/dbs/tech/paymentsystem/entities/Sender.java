package com.dbs.tech.paymentsystem.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "sender_tbl")
public class Sender {
    @Id
    private Integer senderId;
    private String name;
    private Double balance;
}
