package com.Pranil9699.ManyToOnemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AnswerTable")
public class Answer1 {
	@Id
	@Column(name="a_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int answer_id;
	private String answer;
	
	@ManyToOne
	private Question1 question1;
	
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question1 getQuestion1() {
		return question1;
	}
	public void setQuestion1(Question1 question1) {
		this.question1 = question1;
	}
	public Answer1(int answer_id, String answer, Question1 question1) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.question1 = question1;
	}
	
	
   
}
