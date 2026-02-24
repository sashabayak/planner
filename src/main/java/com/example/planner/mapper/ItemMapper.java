package com.example.planner.mapper;

import com.example.planner.dto.ItemDTO;
import com.example.planner.entity.Item;

public class ItemMapper {

    public static ItemDTO toDto(Item item) {
        if (item == null) {
            return null;
        }
        ItemDTO dto = new ItemDTO();
        dto.setId(item.getId());
        dto.setName(item.getName());
        dto.setDescription(item.getDescription());
        dto.setCompleted(item.isCompleted());
        dto.setCreatedAt(item.getCreatedAt());
        return dto;
    }
}