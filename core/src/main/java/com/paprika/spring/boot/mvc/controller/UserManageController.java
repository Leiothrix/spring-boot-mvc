package com.paprika.spring.boot.mvc.controller;

import com.paprika.spring.boot.mvc.api.SpringBootMvcAPI;
import com.paprika.spring.boot.mvc.api.dto.SaveUserInfoDto;
import com.paprika.spring.boot.mvc.api.dto.vo.UserInfoVo;
import com.paprika.spring.boot.mvc.domain.UserInfo;
import com.paprika.spring.boot.mvc.service.DesensitizationService;
import com.paprika.spring.boot.mvc.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author adam
 * @date 2019/5/23
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
@Slf4j
@Api(value = SpringBootMvcAPI.SPRING_BOOT_MVC_USER_MANAGE, description = "用户管理接口", tags = "UserManageController")
@RestController
public class UserManageController {

        private UserService uerService;

        private DesensitizationService desensitizationService;

        @Autowired
        public UserManageController(UserService uerService, DesensitizationService desensitizationService){
            this.uerService = uerService;
            this.desensitizationService = desensitizationService;
        }

        @ApiOperation(value="查询用户信息")
        @GetMapping(SpringBootMvcAPI.SPRING_BOOT_MVC_USER_MANAGE_QUERY_USERINFO)
        public UserInfoVo queryUserInfo(@RequestParam @ApiParam(name = "userName", value = "用户名") String userName) {
            return uerService.queryUserInfo(userName);
        }

        @ApiOperation(value="保存用户信息")
        @PostMapping(SpringBootMvcAPI.SPRING_BOOT_MVC_USER_MANAGE_SAVE_USERINFO)
        public void saveUserInfo(@RequestBody @ApiParam(name = "saveUserInfoDto", value = "用户信息") SaveUserInfoDto saveUserInfoDto) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserComment(saveUserInfoDto.getUserComment());
            userInfo.setUserName(saveUserInfoDto.getUserName());
            userInfo.setUserPassword(saveUserInfoDto.getPassword());
            userInfo.setUserRole(saveUserInfoDto.getUserRole());
            userInfo.setUserGender(saveUserInfoDto.getUserGender());
            uerService.saveUserInfo(userInfo);
        }
}
