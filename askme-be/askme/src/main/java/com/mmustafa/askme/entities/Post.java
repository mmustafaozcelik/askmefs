package com.mmustafa.askme.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "post")
@Data
@AllArgsConstructor
public class Post {
	
	@Id
	@GeneratedValue
	Long id;
	
	@Column(name = "user_id")
	Long userId;
	
	@Column(name = "post_title")
	String title;
	
	@Lob
	@Column(name = "post_text", columnDefinition = "text")
	String text;

}
