package com.example.planner.controller;

import com.example.planner.dto.ItemDTO;
import com.example.planner.service.ItemService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class ItemController {

  private final ItemService service;

  @GetMapping
  public List<ItemDTO> getTasks(
	  @RequestParam(required = false, name = "name") String name) {
	return service.searchItemsByName(name);
  }

  @GetMapping("/{id}")
  public ResponseEntity<ItemDTO> getTaskById(@PathVariable Long id) {
	return service.getItemById(id)
		.map(ResponseEntity::ok)
		.orElseGet(() -> ResponseEntity.notFound().build());
  }
}