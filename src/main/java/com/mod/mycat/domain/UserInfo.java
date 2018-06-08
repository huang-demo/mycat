package com.mod.mycat.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Mr.p
 */
@Entity
@Getter
@Setter
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String address;

    private String name;

    private Double score;




}