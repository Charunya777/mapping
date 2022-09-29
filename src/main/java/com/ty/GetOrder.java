package com.ty;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class GetOrder {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		FoodOrder foodorder = entityManager.find(FoodOrder.class, 1);
		System.out.println("Food order");
		System.out.println("order id is " + foodorder.getId());
		System.out.println("ordered person is" + foodorder.getPerson());
		System.out.println("order status is" + foodorder.getStatus());
		System.out.println("_______________________");
		List<Item> items=foodorder.getItems();
		   for(Item it:items) {
			System.out.println("items info");
			System.out.println("item id is " + it.getId());
			System.out.println("item name is " +it.getName());
			System.out.println("item quantity is " + it.getQuantity());
			System.out.println("item cost is  "+ it.getCost());

		   }

	}
}
	
