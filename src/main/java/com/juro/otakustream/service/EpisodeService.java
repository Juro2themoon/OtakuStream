package com.juro.otakustream.service;

import com.juro.otakustream.entity.Episode;
import com.juro.otakustream.exception.EpisodeNotFoundException;
import com.juro.otakustream.repository.EpisodeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EpisodeService {

    private final EpisodeRepository episodeRepository;

    public EpisodeService(EpisodeRepository episodeRepository) {this.episodeRepository = episodeRepository;}

    public List<Episode> getAllEpisodes() {
        return episodeRepository.findAll();
    }

    public Episode getEpisode(Long id) {
        return episodeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Anime with Episode id" + id + "not found"));
    }

    public Episode createEpisode(Episode episode) {
        return episodeRepository.save(episode);
    }

    public Episode updateEpisode (Long id, Episode updatedEpisode) {
        Episode existingEpisode = episodeRepository.findById(id)
                .orElseThrow(() ->
        new RuntimeException("Episode not found with id: " + id));

        existingEpisode.setTitle(updatedEpisode.getTitle());
        existingEpisode.setEpisodeNumber(updatedEpisode.getEpisodeNumber());
        existingEpisode.setVideoUrl(updatedEpisode.getVideoUrl());
        existingEpisode.setAnime(updatedEpisode.getAnime());

        return episodeRepository.save(existingEpisode);
    }

    public void deleteEpisode (Long id) {
        Episode episode = episodeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Episode not found with id: " + id));

                        episodeRepository.delete(episode);
    }

}
