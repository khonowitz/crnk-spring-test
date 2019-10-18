package com.kristin.crnk.domain.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.kristin.crnk.domain.model.Organization;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;

@Component
public class OrganizationRepositoryImpl extends ResourceRepositoryBase<Organization, Long> {

  private Map<Long, Organization> organizations = new HashMap<>();

  public OrganizationRepositoryImpl() {
    super(Organization.class);

    Organization organization = new Organization(1, "My Organization", "role");
    organizations.put(1L, organization);
  }

  @Override
  public synchronized ResourceList<Organization> findAll(QuerySpec querySpec) {
    return querySpec.apply(organizations.values());
  }
  
  public Organization findById(String id) {
      return new Organization();
  }
}