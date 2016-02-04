package com.baobaotao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.User;

@Repository(value="userMapper")
public interface UserMapper {
	
	int deleteById(String id);

    int insert(User record);

    int insertSelective(User record);

    int updateByIdSelective(User record);

    int updateById(User record);
    
    /**
     * Retrieves the List of user
     * @return user list
     */
    // SQL query using xml "UserMapper.xml"
    List<User> getAll();
    
    /**
     * Retrieves the List of user
     * @return person list
     */
    // SQL query using annotation
    @Select("SELECT * FROM t_user")
    List<User> getAll2();
    
    /**
     * Retrieve a user
     * @param id user id
     * @return user
     */
    // SQL query using annotation
    @Select("SELECT * FROM t_user WHERE user_id = #{id}")
    User findById(@Param("id") String id);
}
