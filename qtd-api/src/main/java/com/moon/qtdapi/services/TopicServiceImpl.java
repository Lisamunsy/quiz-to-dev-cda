package com.moon.qtdapi.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.moon.qtdapi.dtos.TopicCreateDto;
import com.moon.qtdapi.dtos.TopicItem;
import com.moon.qtdapi.entities.Topic;
import com.moon.qtdapi.repositories.TopicRepository;

@Service
public class TopicServiceImpl implements TopicService {
	private final TopicRepository topics;

	public TopicServiceImpl(TopicRepository topics) {
		this.topics = topics;
	}

	@Override
	public void create(TopicCreateDto inputs) {
		Topic entity = new Topic();
		entity.setName(inputs.getName());
		Topic parentTopic = topics.getReferenceById(inputs.getParentTopicId());
		entity.setParentTopic(parentTopic);
		topics.save(entity);

	}

	@Override
	public Collection<TopicItem> getAll() {
		return topics.findAllProjectedBy();
	}

}
