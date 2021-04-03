package com.niit.vd.demoimage.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "path")
    String path;
}
