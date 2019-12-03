package com.training.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.beans.MyUser;
import com.training.dao.RegisterDao;
@Service
public class RegisterServiceImpl implements RegisterService {
@Autowired
RegisterDao registerDao;
	public int registerUser(MyUser u) {
		return registerDao.registerUser(u);

	}

}
