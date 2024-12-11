package com.alura.foro.service;

import com.alura.foro.model.Topic;
import com.alura.foro.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TopicService {

    private final TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic saveTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public Optional<Topic> getTopicById(Long id) {
        return topicRepository.findById(id);
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}
