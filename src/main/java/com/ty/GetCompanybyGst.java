package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetCompanybyGst {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		GST gst = entityManager.find(GST.class, 1);
		System.out.println("GST info");
		System.out.println("Gst id is"+gst.getId());
		System.out.println("Gst number is"+gst.getNumber());
		System.out.println("Gst status is"+gst.getStatus());
		
		System.out.println("_______________________");

		Company company = gst.getCompany();
		if (company != null) {
			System.out.println(" company info");
			System.out.println("company id is" + company.getId())
			;
			System.out.println("company name is" + company.getName());
			System.out.println("company address is" + company.getAddress());
	}

	}

}
