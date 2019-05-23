package com.paprika.spring.boot.mvc.service;

import com.paprika.spring.boot.mvc.api.dto.vo.UserInfoVo;
import com.paprika.spring.boot.mvc.domain.UserInfo;

/**
 * @author adam
 * @date 2019/5/23
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public interface UserService {

    public UserInfoVo queryUserInfo(String userName);

    public void saveUserInfo(UserInfo userInfo);
}
