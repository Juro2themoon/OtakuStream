package com.juro.otakustream.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "episode")
@Getter
@Setter
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer episodeNumber;

    private String videoUrl;

    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;

    public Episode() {}

}
