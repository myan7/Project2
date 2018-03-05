package my.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import my.spring.dao.UserDAO;
import my.spring.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	@Override
	@Transactional
	public boolean add(User user)
	{
		return userDAO.add(user);
	}
	
	@Override
	public User isValid(User user)
	{
		User u = userDAO.isValid(user);
		if ( u !=null)
			return u;
		else
			return null;
	}
	
	public List<User> getAll()
	{
		return userDAO.getAll();
	}
}
