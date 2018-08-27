package com.latecoere.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.latecoere.app.models.Box;


@Transactional
@Repository
public interface BoxRepository extends CrudRepository<Box, String>{
}
