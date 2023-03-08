package com.moon.qtdapi.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moon.qtdapi.dtos.TopicItem;
import com.moon.qtdapi.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

	Collection<TopicItem> findAllProjectedBy();
}
