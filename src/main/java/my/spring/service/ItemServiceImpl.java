package my.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.spring.dao.ItemDao;
import my.spring.model.AbstractItem;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDao itemDao;
	
	@Override
	public AbstractItem getItem(long id) {
		AbstractItem aItem = itemDao.getItemByID(id);
		return aItem;
	}

	@Override
	public List<AbstractItem> getAll() {
		
		return itemDao.getAll();
	}

	@Override
	public List<AbstractItem> getByCategory(String category) {
		
		return itemDao.getByCategory(category);
	}

	@Override
	public List<AbstractItem> getByKey(String key) {
		
		return itemDao.getItemsByKeyword(key);
	}
	

}
