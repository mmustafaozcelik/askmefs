package com.mmustafa.askme.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.mmustafa.askme.dto.UpdateUserRequest;
import com.mmustafa.askme.dto.UserDto;
import com.mmustafa.askme.dto.converter.UserDtoConverter;
import com.mmustafa.askme.entities.User;
import com.mmustafa.askme.repository.UserRepository;
import lombok.AllArgsConstructor;
import com.mmustafa.askme.exception.UserNotFoundException;

@Service
@AllArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	private final UserDtoConverter userDtoConverter;
	
	public List<UserDto> getAllUsers() {
		
		return userRepository.findAll().stream()
				.map(userDtoConverter::convert)
				.collect(Collectors.toList());
		
	}

	public UserDto createUser(UserDto userDto) {
		User user = new User(
				null,
				userDto.getUserName(),
				userDto.getEMail(),
				userDto.getPassword());
		return userDtoConverter.convert(userRepository.save(user));
	}

	public UserDto getUserById(Long id) {
		User user = userRepository.findById(id)
				.orElseThrow(()-> new  UserNotFoundException( " Kullanıcı Bulunamadı: " +id));
		
		return userDtoConverter.convert(user);
	}

	public UserDto updateUser(Long id, UpdateUserRequest userDto) {
		User user = findById(id);
		User updateUser = new User(
				user.getId(),
				userDto.getEMail(),
				userDto.getUserName(),
				userDto.getPassword());
		return userDtoConverter.convert(userRepository.save(updateUser));
	}
	
	private User findById(Long id) {
		return userRepository.findById(id)
				.orElseThrow(()-> new UserNotFoundException("Kullanıcı Bulunamadı: " +id));
		
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		
	}

}
