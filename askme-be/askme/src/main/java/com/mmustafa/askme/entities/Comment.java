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
@Table(name = "comment")
@Data
@AllArgsConstructor
public class Comment {
	
	@Id
	@GeneratedValue
	Long id;
	
	@Column(name = "postId")
	Long postId;
	
	@Column(name = "userId")
	Long userId;
	
	@Lob
	@Column(name = "comment" , columnDefinition = "text")
	String comment;

}
