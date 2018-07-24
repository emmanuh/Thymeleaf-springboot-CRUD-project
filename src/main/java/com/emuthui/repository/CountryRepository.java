package com.emuthui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emuthui.entity.County;

public interface CountryRepository extends JpaRepository<County, Integer> {

}
