package com.mmustafa.askme.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	Long id;
	
	@Column(name = "userName")
	String userName;
	
	@Column(name = "email")
	String eMail;
	
	@Column(name = "pasword")
	String password;
	

}
