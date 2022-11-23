package com.Pranil9699.ManyToOnemapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="QuestionTable")
public class Question1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="q_id")
	private int question_id;
	@Column(name="Que_Type")
	private String question_type;
	@Column(name="Que")
	private String question;

	@OneToMany(mappedBy = "question1")
	private List<Answer1> ans;
	
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
	public List<Answer1> getAns() {
		return ans;
	}
	public void setAns(List<Answer1> ans) {
		this.ans = ans;
	}

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
    public Question1(int question_id, String question_type, String question, List<Answer1> ans) {
	super();
	this.question_id = question_id;
	this.question_type = question_type;
	this.question = question;
	this.ans = ans;
}

	
	
	
}
