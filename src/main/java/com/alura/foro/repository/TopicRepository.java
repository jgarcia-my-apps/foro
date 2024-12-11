package com.alura.foro.repository;

import com.alura.foro.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    // Métodos de consulta personalizados, si es necesario, se pueden agregar aquí.
}
