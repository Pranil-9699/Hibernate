package com.Pranil9699.OneToOnemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapQue_Ans {

	public static void main(String[] args) {
		try{
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
			Question que1 = new Question();
			que1.setQuestion_type("Java");
			que1.setQuestion("What Is The Java ?");
			Answer ans1 = new Answer();
			ans1.setAnswer("Simple Programming Language ?");
			que1.setAns(ans1);
			
			Question que2 = new Question();
			que2.setQuestion_type("C++");
			que2.setQuestion("What Is The C++ ?");
			Answer ans2 = new Answer();
			ans2.setAnswer("Complex Programming Language ?");
			que2.setAns(ans2);
			
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(que1);
		session.save(ans1);
		session.save(que2);
		session.save(ans2);
		tr.commit();
		
		Question que = (Question) session.get(Question.class,1);
		System.out.println(que.getQuestion_id()+" , "+que.getQuestion_type()+" , "+que.getQuestion()+" , "+que.getAns().getAnswer()+","+que.getAns().getAnswer_id());
		
		Question quetow = (Question) session.get(Question.class,3);
		System.out.println(quetow.getQuestion_id()+" , "+quetow.getQuestion_type()+" , "+quetow.getQuestion()+" , "+quetow.getAns().getAnswer()+","+quetow.getAns().getAnswer_id());
		
		session.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
