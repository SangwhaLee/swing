package com.swing.user.model.service;

import com.swing.user.model.dto.UserDto;
import com.swing.user.model.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UserService {

	UserDto getUserInfo(String userId);
	boolean deleteUser(String userId);
	String upload (MultipartFile image) throws IOException;
	User getSentencyCnt(String userId);
	void setSentencyCnt(String userId, int sentencyCnt);
	int getFiveCnt(String userId);
	void setFiveCnt(String userId, int sentencyCnt);
	void setCouponCnt(String userId, int couponCnt);
}
