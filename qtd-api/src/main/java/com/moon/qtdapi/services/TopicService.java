package com.moon.qtdapi.services;

import java.util.Collection;

import com.moon.qtdapi.dtos.TopicCreate;
import com.moon.qtdapi.dtos.TopicForUpdate;
import com.moon.qtdapi.dtos.TopicItem;
import com.moon.qtdapi.dtos.TopicUpdate;

public interface TopicService {

	void create(TopicCreate inputs);

	TopicForUpdate forUpdate(Long id);

	void update(Long id, TopicUpdate inputs);

	void delete(Long id);

	Collection<TopicItem> getAll();
}
