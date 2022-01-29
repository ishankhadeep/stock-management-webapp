package com.ty.stock.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.stock.dto.User;

public class UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("project");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction;

	public void saveUser(User u) {

		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(u);
		entityTransaction.commit();
	}

	public User validateUser(String email, String password) {
		String hql = "select u from User u where email=?1 and password=?2";
		Query query = entityManager.createQuery(hql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User> lists = query.getResultList();
		if (lists != null && lists.size() != 0) {
			return lists.get(0);
		} else {
			return null;
		}

	}
	
}
