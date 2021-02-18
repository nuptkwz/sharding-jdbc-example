package com.kwz.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Description
 * Date 2021/2/18 23:43
 * Created by kwz
 */
@Data
@Table(name = "position_detail")
public class PositionDetail implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "pid")
    private long pId;
    @Column(name = "description")
    private String description;
}
