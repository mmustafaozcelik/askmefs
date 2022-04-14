package com.mmustafa.askme.dto.converter;

import org.springframework.stereotype.Component;

import com.mmustafa.askme.dto.UserDto;
import com.mmustafa.askme.entities.User;

@Component
public class UserDtoConverter {

	public UserDto convert(User from) {
		
		return new UserDto(
				from.getUserName(),
				from.getEMail(),
				from.getPassword());
		
	}
}
