package com.alura.foro.exceptions;

public class TopicNotFoundException extends RuntimeException {
    public TopicNotFoundException(Long id) {
        super("No se encontró el tema con ID " + id);
    }
}