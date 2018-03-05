package my.spring.service;

import org.springframework.transaction.annotation.Transactional;

import my.spring.model.User;

public interface UserService {

	boolean add(User user);

	User isValid(User user);

}