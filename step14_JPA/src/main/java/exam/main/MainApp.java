package exam.main;



import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import exam.domain.Customer;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("*************JPA 시작하기**************");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		
		et.begin(); //JPA(Java Persistence API)에서 트랜잭션(transaction)을 시작
		
		//저장
		/*
		em.persist(Customer.builder().userName("희정").age(20).birthDay(new Date()).build());
		em.persist(Customer.builder().userName("미영").age(20).birthDay(new Date()).build());
		em.persist(Customer.builder().userName("나영").age(20).birthDay(new Date()).build());
		em.persist(Customer.builder().userName("효리").age(20).birthDay(new Date()).build());
		*/
			
		//조회
		Customer cu =  em.find(Customer.class, 18L);
		System.out.println("cu = "+ cu);
		
		Customer cu2 = em.find(Customer.class, 18L);
		Customer cu3 = em.find(Customer.class, 18L);
		System.out.println("cu2 = "+ cu2);
		System.out.println("cu3 = "+ cu3);

		if(cu==cu2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	/*
		cu3.setAge(55);
		cu3.setUserName("얼짱6");
		em.remove(cu3);
		*/
		et.commit(); //실제 DB에 쿼리가 실행된다!!
		em.close();
		
		
		emf.close();
		System.out.println("*************JPA 끝********************");
		
	}
}
