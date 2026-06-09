package com.juro.otakustream.exception;

public class EpisodeNotFoundException extends RuntimeException {
    public EpisodeNotFoundException(String message) {
        super(message);
    }
}
