package com.paprika.spring.boot.mvc.api.dto.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author adam
 * @date 2019/5/23
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
@Data
@ApiModel("用户信息")
public class UserInfoVo {

    @ApiModelProperty(name = "userName", value = "用户名")
    private String userName;

    @ApiModelProperty(name = "userGender", value = "用户性别（0：女 1：男）")
    private Integer userGender;

    @ApiModelProperty(name = "userRole", value = "用户角色")
    private String userRole;

    @ApiModelProperty(name = "userComment", value = "备注信息")
    private String userComment;

}
