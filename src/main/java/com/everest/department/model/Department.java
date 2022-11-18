package com.everest.department.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentid")
    private Long departmentId;

    @Column(name = "departmentname")
    private String departmentName;

    @Column(name = "departmentaddress")
    private String departmentAddress;

    @Column(name = "departmentcode")
    private String departmentCode;
}
