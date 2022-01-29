package com.ty.stock.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.stock.dto.Item;

public class ItemDao {
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("project");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction;
	
	public void saveItem(Item item) {
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
	}
	public boolean deleteItem(int id) {
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Item item=entityManager.find(Item.class,id);
		if(item!=null) {
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		}
		else
			return false;
		
	}
	public List getAllItem() {
		Query query =entityManager.createQuery("SELECT i FROM Item i");
		return query.getResultList();
		
	
	}
	public Item getItem(int id) {
		return entityManager.find(Item.class, id);
	}
	public void updateItem(Item item) {
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(item);
		entityTransaction.commit();
	}
	public List<Item> serchItemByName(String name){
		String hql="SELECT i FROM Item i WHERE i.name LIKE '%"+name+"%' ";
		
		Query query = entityManager.createQuery(hql);
//		query.setParameter(1,name);
		return query.getResultList();	
	}
	public List<Item> displayItemByItemBrand(String brand){
		String hql="SELECT i FROM Item i Where i.brand=?1";
		Query query = entityManager.createQuery(hql);
		query.setParameter(1,brand);
		return query.getResultList();	
	}
	public List<Item> displayItemByItemBrandItemName(String name,String brand){
		String hql="SELECT i FROM Item i WHERE i.name LIKE '%"+name+"%' and i.brand=?1";
		Query query = entityManager.createQuery(hql);
		query.setParameter(1,brand);
		return query.getResultList();	
	}
}
