package com.kristin.crnk.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "organization")
public class Organization {

  @JsonApiId
  private long id;

  @JsonProperty
  private String name;
  
  @JsonProperty
  private String role;

  public Organization() {
    super();
  }

  public Organization(long id, String name, String role) {
    this.id = id;
    this.name = name;
    this.role = role;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
      return name;
  }
  
  public void setName(String name) {
      this.name = name;
  }
  
  public String getRole() {
      return role;
  }
  
  public void setRole(String role) {
      this.role = role;
  }

  @Override
  public String toString() {
    return "organization[id=" + id + ", name=" + name + ", role=\" + role + \"]";
  }
}