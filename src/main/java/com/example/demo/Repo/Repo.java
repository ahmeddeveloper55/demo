package com.example.demo.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repo extends MongoRepository<Data,String> {
}
