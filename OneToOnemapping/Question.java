package com.Pranil9699.OneToOnemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="QuestionTable")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="q_id")
	private int question_id;
	@Column(name="Que_Type")
	private String question_type;
	@Column(name="Que")
	private String question;
	@OneToOne
	private Answer ans;
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion_type() {
		return question_type;
	}
	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int question_id, String question_type, String question, Answer ans) {
		super();
		this.question_id = question_id;
		this.question_type = question_type;
		this.question = question;
		this.ans = ans;
	}
	
	
}
