package com.kwz.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Description
 * Date 2021/2/18 18:13
 * Created by kwz
 */
@Entity
@Table(name = "position")
public class Position implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "salary")
    private String salary;
    @Column(name = "city")
    private String city;
}
