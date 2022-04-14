package com.mmustafa.askme.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "post_like")
@Data
@AllArgsConstructor
public class Like {

	@Id
	@GeneratedValue
	Long id;
	
	@Column(name = "postId")
	Long postId;
	
	@Column(name = "userId")
	Long userId;
	
}
