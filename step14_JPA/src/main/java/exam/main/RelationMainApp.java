package exam.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import exam.domain.Member;
import exam.domain.Team;

public class RelationMainApp {

	public static void main(String[] args) {

		System.out.println("*******AJP Relation start ********");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");
		EntityManager em = emf.createEntityManager();
		EntityTransaction  et = em.getTransaction();
		et.begin();
		
		//팀 등록
		
		/*Team team1 = Team.builder().teamName("team01").build();
		Team team2 = Team.builder().teamName("team02").build();
		Team team3 = Team.builder().teamName("team03").build();
		
		em.persist(team1);
		em.persist(team2);
		em.persist(team3); */

		//Member 등록
		/*
		Member m1 = Member.builder().name("희정").age(20).team(team1).build();
		Member m2 = Member.builder().name("나영").age(21).team(team1).build();
		
		Member m3 = Member.builder().name("효리").age(22).team(team2).build();
		Member m4 = Member.builder().name("미희").age(31).team(team2).build();
		Member m5 = Member.builder().name("미미").age(25).team(team2).build();
		
		Member m6 = Member.builder().name("민정").age(22).team(team3).build();
		
		em.persist(m1);
		em.persist(m2);
		em.persist(m3);
		em.persist(m4);
		em.persist(m5);
		em.persist(m6);
		
		*/
		//회원검색//////////////////
		/* Member member = em.find(Member.class, 1L);
		System.out.println("member = "+member);//주소값
		
		System.out.println("-----Team 정보 확인 -----");
		
		Team team = member.getTeam();
		System.out.println("team = "+team);
		*/
		
		
		//팀 정보 검색//////
		Team team = em.find(Team.class, 1L);
		System.out.println("team = " +team);
		System.out.println("***소속된 회원정보 조회****");
		
		List<Member> list = team.getMemberList();
		for(Member m : list) {
			System.out.println(m);
		}
		
		
		
		et.commit();
		
		em.close();
		emf.close();
		System.out.println("*******AJP Relation end ********");
		
	}

}

















