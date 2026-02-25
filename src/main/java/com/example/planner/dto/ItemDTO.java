package com.example.planner.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class ItemDTO {
  private Long id;
  private String name;
  private String description;
  private boolean completed;
  private Instant createdAt;
}