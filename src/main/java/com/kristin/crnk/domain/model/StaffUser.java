package com.kristin.crnk.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.SerializeType;

@JsonApiResource(type = "staff_user")
public class StaffUser {

  @JsonApiId
  private long id;

  @JsonProperty
  private String email;
  
  @JsonProperty
  private String firstName;
  
  @JsonApiRelation(serialize = SerializeType.EAGER)
  private Organization organization;

  public StaffUser() {
    super();
  }

  public StaffUser(long id, String email, String firstName, Organization organization) {
    this.id = id;
    this.email = email;
    this.firstName = firstName;
    this.organization = organization;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getFirstName() {
      return firstName;
  }
  
  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  public Organization getOrganization() {
    return organization;
  }
  
  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  @Override
  public String toString() {
    return "staffUser[id=" + id + ", email=" + email + ", firstName=\" + firstName + \"]";
  }
}