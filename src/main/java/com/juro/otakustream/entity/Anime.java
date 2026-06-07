package com.juro.otakustream.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter
    @Setter
    private String title;

    @Setter
    @Getter
    @Column(length = 2000)
    private String description;

    @Setter
    @Getter
    private String coverImage;

    public Anime() {}

    public Long getID() {
        return id;
    }
    public void setID(Long id) {
        this.id = id;
    }

}

