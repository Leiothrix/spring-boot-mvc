package com.paprika.spring.boot.mvc.dao;

import com.paprika.spring.boot.mvc.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author adam
 * @date 2019/5/23
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
@Repository
public interface UserInfoRepo extends JpaSpecificationExecutor<UserInfo>,JpaRepository<UserInfo, Long>{
    @Query("select a from UserInfo a where a.userName = :userName")
    UserInfo findOneByUserName(@Param("userName") String userName);
}
