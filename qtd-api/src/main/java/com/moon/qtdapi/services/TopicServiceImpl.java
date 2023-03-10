package com.moon.qtdapi.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.moon.qtdapi.dtos.TopicCreate;
import com.moon.qtdapi.dtos.TopicForUpdate;
import com.moon.qtdapi.dtos.TopicItem;
import com.moon.qtdapi.dtos.TopicUpdate;
import com.moon.qtdapi.entities.Topic;
import com.moon.qtdapi.repositories.TopicRepository;

@Service
public class TopicServiceImpl implements TopicService {
	private final TopicRepository topics;

	public TopicServiceImpl(TopicRepository topics) {
		this.topics = topics;
	}

	@Override
	public void create(TopicCreate inputs) {
		Topic entity = new Topic();
		entity.setName(inputs.getName());
		Topic parentTopic = topics.getReferenceById(inputs.getParentTopicId());
		entity.setParentTopic(parentTopic);
		topics.save(entity);

	}

	@Override
	public Collection<TopicItem> getAll() {
		return topics.findAllProjectedByOrderById();
	}

	@Override
	public TopicForUpdate forUpdate(Long id) {
		return topics.findProjectedForUpdateById(id);
	}

	@Override
	public void update(Long id, TopicUpdate inputs) {
		Topic entity = topics.findById(id).get();
		entity.setName(inputs.getName());
		Topic parentTopic = topics.getReferenceById(inputs.getParentTopicId());
		entity.setParentTopic(parentTopic);
		topics.save(entity);

	}

	@Override
	public void delete(Long id) {
		topics.deleteById(id);

	}

}
