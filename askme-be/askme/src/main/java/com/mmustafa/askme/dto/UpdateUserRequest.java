package com.mmustafa.askme.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateUserRequest {
	String userName;
	String eMail;
	String password;

}
