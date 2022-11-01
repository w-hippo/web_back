package fdev.web_back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fdev.web_back.entity.User;
import fdev.web_back.repository.UserRepository;

/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
	/**
	 * ユーザー情報 Repository
	 */
	@Autowired
	UserRepository userRepository;

	public List<User> searchAll() {
		// ユーザーTBLの内容を全検索
		return userRepository.findAll();
	}
}