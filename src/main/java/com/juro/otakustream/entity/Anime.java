package com.juro.otakustream.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Getter
    @Setter
    private String title;

    @NotBlank
    @Setter
    @Getter
    @Column(length = 2000)
    private String description;

    @Min(1)
    @Getter
    @Setter
    private Integer episodes;

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

