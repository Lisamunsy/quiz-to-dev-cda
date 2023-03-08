package com.moon.qtdapi.services;

import java.util.Collection;

import com.moon.qtdapi.dtos.TopicCreateDto;
import com.moon.qtdapi.dtos.TopicItem;

public interface TopicService {

	void create(TopicCreateDto inputs);

	Collection<TopicItem> getAll();
}
