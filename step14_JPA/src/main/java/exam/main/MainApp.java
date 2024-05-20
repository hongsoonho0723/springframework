package exam.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import exam.domain.Customer;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("*************JPA 시작하기**************");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");
		// persistence.xml 파일에 <persistence-unit name="JPAProject"> JPAProject값

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin(); // JPA(Java Persistence API)에서 트랜잭션(transaction)을 시작

		// 저장
		/*
		 * em.persist(Customer.builder().userName("희정").age(20).birthDay(new
		 * Date()).build());
		 * em.persist(Customer.builder().userName("미영").age(20).birthDay(new
		 * Date()).build());
		 * em.persist(Customer.builder().userName("나영").age(20).birthDay(new
		 * Date()).build());
		 * em.persist(Customer.builder().userName("효리").age(20).birthDay(new
		 * Date()).build());
		 * 
		 * em.persist(Emp.builder().ename("미미").job("관리자").build());
		 * em.persist(Emp.builder().ename("호호").job("사원").build());
		 */

		// 조회
		/*
		 * Customer cu = em.find(Customer.class, 2L); System.out.println("cu = " + cu);
		 * 
		 * Customer cu2 = em.find(Customer.class, 2L); Customer cu3 =
		 * em.find(Customer.class, 3L); System.out.println("cu2 = " + cu2);
		 * System.out.println("cu3 = " + cu3);
		 * 
		 * if (cu == cu2) { System.out.println("같다"); } else {
		 * System.out.println("다르다"); }
		 */
		// Customer cu3 = em.find(Customer.class, 2L);
		// cu3.setAge(20);
		// cu3.setUserName("나영");

		// 삭제
		// em.remove(cu3);

		// 다양한 조건에 해당하는 쿼리를 실행하고 싶다면?? ///////////////////////////////////
		// 개발자가 쿼리를 직접 생성을 하더라도 객체중심으로 작성할수 있도록 하는 JPQL문법을 제공한다

		//em.persist(Customer.builder().userName("호영").age(20).birthDay(new Date()).build());
		
		
		// 나이가 22살 이상인 member정보를 조회하고 싶다
		// String sql = "select cu from Customer cu where cu.age >=22"; //cu.id 아디만
		// 가지고오기
		/*String sql = "select cu from Customer cu where cu.userName like '%영%'"; // cu.id 아이디만 가지고오기
		List<Customer> list = em.createQuery(sql, Customer.class).getResultList(); //flush() 호출되어 db와 동기화

		for (Customer c : list) {
			System.out.println(c);
		}
		 */
		
		///paameter로 정보전달 ///////////////
		/*String sql = "select cu from Customer cu where cu.userName like ?1 ";
		List<Customer> list =
				em.createQuery(sql, Customer.class)
				.setParameter(1, "%영%")
				.getResultList();*/
		
		
		/*String sql = "select cu from Customer cu where cu.userName like ?1 or cu.age >?2 ";
		List<Customer> list =
				em.createQuery(sql, Customer.class)
				.setParameter(1, "%영%")
				.setParameter(2, 22 )
				.getResultList();
		*/
		
		
		String sql = "select cu from Customer cu where cu.userName like :name1 or cu.age > :age ";
		String name="%영%";
		int age =22;
		List<Customer> list =
				em.createQuery(sql, Customer.class)
				.setParameter("age", age )
				.setParameter("name1", name)
				.getResultList();
		
		
		for (Customer c : list) {
			System.out.println(c);
		}
		
		
		et.commit();

		em.close();
		emf.close();
		System.out.println("*************JPA 끝********************");

	}
}
