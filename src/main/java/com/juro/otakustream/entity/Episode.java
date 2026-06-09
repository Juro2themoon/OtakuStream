package com.juro.otakustream.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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

    @NotBlank(message = "Episode Title is required")
    private String title;

    @Min(value = 1, message = "Episode number must at least be 1")
    private Integer episodeNumber;

    @NotBlank(message = "Video URL is required")
    private String videoUrl;

    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;

    public Episode() {}

}
