package com.Pranil9699.OneToOnemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AnswerTable")
public class Answer {
	@Id
	@Column(name="a_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int answer_id;
	@Column(name="Ans")
	private String answer;
	public Answer() {
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
	public Answer(int answer_id, String answer) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
	}
	
   
}
