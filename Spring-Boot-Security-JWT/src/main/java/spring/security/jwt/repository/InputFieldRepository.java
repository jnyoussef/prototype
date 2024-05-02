package spring.security.jwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import spring.security.jwt.models.InputField;

public interface InputFieldRepository extends MongoRepository<InputField, String>{
    
}
