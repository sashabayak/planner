package com.example.planner.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
public class Item {

  private Long id;

  private String name;

  private String description;

  private boolean completed;

  private Instant createdAt;

  public Item(String name, String description) {
	this.name = name;
	this.description = description;
	this.completed = false;
	this.createdAt = Instant.now();
  }
}