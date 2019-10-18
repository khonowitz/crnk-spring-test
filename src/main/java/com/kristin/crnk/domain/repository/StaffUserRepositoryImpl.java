package com.kristin.crnk.domain.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.kristin.crnk.domain.model.Organization;
import com.kristin.crnk.domain.model.StaffUser;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;

@Component
public class StaffUserRepositoryImpl extends ResourceRepositoryBase<StaffUser, Long> {

  private Map<Long, StaffUser> staffUsers = new HashMap<>();

  public StaffUserRepositoryImpl() {
    super(StaffUser.class);

    Organization organization = new Organization(1, "My organization", "role");
    staffUsers.put(1L, new StaffUser(1L, "email@test.com", "jane", organization));
  }

  @Override
  public synchronized ResourceList<StaffUser> findAll(QuerySpec querySpec) {
    return querySpec.apply(staffUsers.values());
  }
  
  public StaffUser findById(String id) {
      return new StaffUser();
  }
}