package com.alura.foro.controllers;

import com.alura.foro.model.Topic;
import com.alura.foro.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topics")
public class TopicController {

    private final TopicService topicService;

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Topic createTopic(@RequestBody Topic topic) {
        return topicService.saveTopic(topic);
    }

    @GetMapping
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/{id}")
    public Topic getTopicById(@PathVariable Long id) {
        return topicService.getTopicById(id).orElseThrow(() -> new RuntimeException("Topic not found"));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTopic(@PathVariable Long id) {
        topicService.deleteTopic(id);
    }
}
