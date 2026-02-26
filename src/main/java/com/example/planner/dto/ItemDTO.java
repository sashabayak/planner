package com.example.planner.dto;

import java.time.Instant;
import lombok.Data;

@Data
public class ItemDTO {
  private Long id;
  private String name;
  private String description;
  private boolean completed;
  private Instant createdAt;
}