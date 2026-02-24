package com.example.planner.repository;

import com.example.planner.entity.Item;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class ItemRepository {

    private final Map<Long, Item> items = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(0);

    public ItemRepository() {
        save(new Item("Купить молоко", "Срочное"));
        save(new Item("Сходить в спортзал", "3 раза в неделю"));
        save(new Item("Закончить лабораторную", "до 25 февраля"));
    }

    public List<Item> findAll() {
        return new ArrayList<>(items.values());
    }

    public Optional<Item> findById(Long id) {
        return Optional.ofNullable(items.get(id));
    }

    public Item save(Item item) {
        if (item.getId() == null) {
            item.setId(idGenerator.incrementAndGet());
        }
        items.put(item.getId(), item);
        return item;
    }

    public List<Item> findByNameContainingIgnoreCase(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return findAll();
        }
        String lower = keyword.toLowerCase().trim();
        return items.values().stream()
                .filter(i -> i.getName() != null && i.getName().toLowerCase().contains(lower))
                .collect(Collectors.toList());
    }
}