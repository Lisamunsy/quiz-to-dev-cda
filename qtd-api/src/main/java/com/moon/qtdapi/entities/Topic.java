package com.moon.qtdapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "topics")
public class Topic extends AbstractEntity {

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "parent_topic_id")
	private Topic parentTopic;

	public Topic() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Topic getParentTopic() {
		return parentTopic;
	}

	public void setParentTopic(Topic parentTopic) {
		this.parentTopic = parentTopic;
	}

	@Override
	public String toString() {
		return "Topic [name=" + name + ", parentTopic=" + parentTopic + "]";
	}

}
