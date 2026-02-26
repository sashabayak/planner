package com.example.planner.service;

import com.example.planner.dto.ItemDTO;
import com.example.planner.mapper.ItemMapper;
import com.example.planner.repository.ItemRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ItemService {

  private final ItemRepository repository;

  public Optional<ItemDTO> getItemById(Long id) {
	return repository.findById(id)
		.map(ItemMapper::toDto);
  }

  public List<ItemDTO> searchItemsByName(String name) {
	return repository.findByNameContainingIgnoreCase(name)
		.stream()
		.map(ItemMapper::toDto)
		.toList();
  }
}