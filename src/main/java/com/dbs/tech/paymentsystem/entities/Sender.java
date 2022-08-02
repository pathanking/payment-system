package com.dbs.tech.paymentsystem.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "sender_tbl")
public class Sender {
    @Id
    private Integer senderId;

    @NotBlank(message = "Sender Name Can't Be Blank")
    private String name;

    private Double balance;
}
