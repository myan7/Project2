package my.spring.dao;

import java.util.List;

import my.spring.model.User;

public interface UserDAO {

	boolean add(User user);

	User isValid(User user);
	
	public void update(User user);
	
	public void delete(User user);
	
	public User getUserById(int id);
	
	public List<User> getAll();

}