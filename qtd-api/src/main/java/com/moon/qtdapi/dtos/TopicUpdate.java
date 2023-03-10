package com.moon.qtdapi.dtos;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class TopicUpdate {

	@NotBlank
	@Size(max = 150)
	private String name;

	@Nullable
	private Long parentTopicId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentTopicId() {
		return parentTopicId;
	}

	public void setParentTopicId(Long parentTopicId) {
		this.parentTopicId = parentTopicId;
	}

	@Override
	public String toString() {
		return "TopicUpdate [name=" + name + ", parentTopicId=" + parentTopicId + "]";
	}
}
