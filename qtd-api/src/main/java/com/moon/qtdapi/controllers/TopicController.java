package com.moon.qtdapi.controllers;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.moon.qtdapi.dtos.TopicCreate;
import com.moon.qtdapi.dtos.TopicForUpdate;
import com.moon.qtdapi.dtos.TopicItem;
import com.moon.qtdapi.dtos.TopicUpdate;
import com.moon.qtdapi.services.TopicService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/topics")
public class TopicController {
	private final TopicService service;

	public TopicController(TopicService service) {
		this.service = service;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void create(@RequestBody @Valid TopicCreate inputs) {
		service.create(inputs);
	}

	@GetMapping
	public Collection<TopicItem> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}/for-update")
	public TopicForUpdate forUpdate(@PathVariable("id") Long id) {
		return service.forUpdate(id);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@PathVariable("id") Long id, @RequestBody @Valid TopicUpdate inputs) {
		service.update(id, inputs);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
