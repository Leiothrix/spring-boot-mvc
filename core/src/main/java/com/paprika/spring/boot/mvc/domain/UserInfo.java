package com.paprika.spring.boot.mvc.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author adam
 * @date 2019/5/23
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
@Entity
@Data
@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", columnDefinition = "bigint")
    private Long userId;

    @Column(name = "user_name", unique = true , columnDefinition = "varchar(64) COMMENT '登录用户名'")
    private String userName;

    @Column(name = "user_password", columnDefinition = "varchar(64) COMMENT '密码'")
    private String userPassword;

    @Column(name = "user_gender", columnDefinition = "int(1) COMMENT '性别（0：男 1：女）'")
    private Integer userGender;

    @Column(name = "user_role", columnDefinition = "varchar(64) COMMENT '用户角色'")
    private String userRole;

    @Column(name = "user_comment", columnDefinition = "varchar(64) COMMENT '备注信息'")
    private String userComment;
}
