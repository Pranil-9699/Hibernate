package com.Pranil9699.ManyToOnemapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapQue_Ans1 {

	private static final Class Question1 = null;

	public static void main(String[] args) {
		try{
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
//			Question1 que1 = new Question1();
//			que1.setQuestion_type("Java");
//			que1.setQuestion("What Is The Java ?");
//			Answer1 ans1 = new Answer1();
//			ans1.setAnswer("Simple Programming Language.");
//			ans1.setQuestion1(que1);
//			Answer1 ans2 = new Answer1();
//			ans2.setAnswer("There Are Different Of FrameWork Are Avilable.");
//			ans2.setQuestion1(que1);
//			Answer1 ans3 = new Answer1();
//			ans3.setAnswer("It Is Secure Programming Language.");
//			ans3.setQuestion1(que1);
//			Answer1 ans4 = new Answer1();
//			ans4.setAnswer("Spring Boot is The Popular Framework IN Market (2022).");
//			ans4.setQuestion1(que1);
//			
//			List<Answer1> Obj = new ArrayList<Answer1>();
//			Obj.add(ans1);
//			Obj.add(ans2);
//			Obj.add(ans3);
//			Obj.add(ans4);
//			que1.setAns(Obj);
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
//		session.save(que1);
//		session.save(ans1);
//		session.save(ans2);
//		session.save(ans3);
//		session.save(ans4);
		Question1 que1 = (Question1)session.get(Question1.class,1);
		System.out.println(que1.getQuestion()+" , "+ que1.getQuestion_type());
		for (Answer1 answer :que1.getAns()) {
        System.out.println(answer.getAnswer_id()+" , "+answer.getAnswer());			
		}
		tr.commit();
		
//		Question1 que = (Question1) session.get(Question1.class,1);
//		System.out.println(que.getQuestion_id()+" , "+que.getQuestion_type()+" , "+que.getQuestion()+" , "+que.getAns().getAnswer()+","+que.getAns().getAnswer_id());
//		
//		Question1 quetow = (Question1) session.get(Question1.class,3);
//		System.out.println(quetow.getQuestion_id()+" , "+quetow.getQuestion_type()+" , "+quetow.getQuestion()+" , "+quetow.getAns().getAnswer()+","+quetow.getAns().getAnswer_id());
//		
		session.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
