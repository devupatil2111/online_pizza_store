package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ItemRepo;
import com.example.demo.module.Item;
import com.example.demo.service.ItemService;
@Service
public class ItemServicesImp implements ItemService{
@Autowired
ItemRepo itemrepo;
	@Override
	public List<Item> listAllItem() {
		// TODO Auto-generated method stub
		return itemrepo.findAll();
	}

	@Override
	public void addItem(Item food) {
		// TODO Auto-generated method stub
		itemrepo.save(food);
	}

	@Override
	public Item findItemByName(String name) {
		// TODO Auto-generated method stub
		return itemrepo.findByItemName(name);
	}

	@Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		itemrepo.save(item);
	}

	@Override
	public void deleteItembyid(int id) {
		// TODO Auto-generated method stub
		itemrepo.deleteById(id);
	}

}
