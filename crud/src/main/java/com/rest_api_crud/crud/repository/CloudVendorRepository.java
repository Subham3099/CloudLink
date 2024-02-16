package com.rest_api_crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest_api_crud.crud.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>{
    
}
