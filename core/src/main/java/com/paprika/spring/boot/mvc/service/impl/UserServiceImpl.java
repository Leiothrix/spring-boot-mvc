package com.paprika.spring.boot.mvc.service.impl;

import com.paprika.spring.boot.mvc.api.dto.vo.UserInfoVo;
import com.paprika.spring.boot.mvc.dao.UserInfoRepo;
import com.paprika.spring.boot.mvc.domain.UserInfo;
import com.paprika.spring.boot.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author adam
 * @date 2019/5/23
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
@Service
public class UserServiceImpl implements UserService {


    private UserInfoRepo userInfoRepo;

    @Autowired
    public UserServiceImpl(UserInfoRepo userInfoRepo){
        this.userInfoRepo = userInfoRepo;
    }

    @Override
    public UserInfoVo queryUserInfo(String name){
        UserInfoVo userInfovo = new UserInfoVo();
        UserInfo userInfo = userInfoRepo.findOneByUserName(name);
        userInfovo.setUserName(userInfo.getUserName());
        userInfovo.setUserGender(userInfo.getUserGender());
        userInfovo.setUserRole(userInfo.getUserRole());
        userInfovo.setUserComment(userInfo.getUserComment());
        return userInfovo;
    }

    @Transactional
    @Override
    public void saveUserInfo(UserInfo userInfo){
        userInfoRepo.save(userInfo);
    }
}
