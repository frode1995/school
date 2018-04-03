package com.frode.school.repository.impl.mapper;

import com.frode.school.repository.impl.mapper.handle.LocalDateTimeHandler;
import com.frode.school.repository.impl.po.TeacherPO;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.sql.Timestamp;

@Mapper
public interface TeacherMapper {
    @Results(id = "Teacher", value = {
            //@Result 修饰返回的结果集，关联实体类属性和数据库字段一一对应，如果实体类属性和数据库属性名保持一致，就不需要这个属性来修饰。
            @Result(property = "tecId", column = "tec_id", javaType = Integer.class, jdbcType = JdbcType.INTEGER, id = true),//主键
            @Result(property = "tecName", column = "tec_name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "tecPassword", column = "tec_password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "tecProject", column = "tec_project", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "tecPatent", column = "tec_patent", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "tecPrize", column = "tec_prize", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "tecPosition", column = "tec_position", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "createdAt", column = "created_at", javaType = Timestamp.class,
                    jdbcType = JdbcType.TIMESTAMP, typeHandler = LocalDateTimeHandler.class),
            @Result(property = "updatedAt", column = "updated_at", javaType = Timestamp.class,
                    jdbcType = JdbcType.TIMESTAMP, typeHandler = LocalDateTimeHandler.class),//暂时删除时间处理类
                    //jdbcType = JdbcType.TIMESTAMP, typeHandler = LocalDateTimeHandler.class),
    })//@Select 是查询类的注解，所有的查询均使用这个
    @Select("select * from teacher where tecId = #{tecId}")//从教师表中查询tecId
    TeacherPO getTeacherPOById(@Param("tecId") Integer tecId);
    //@Param("参数名"),表示给参数命名,名称就是括号中的内容

//    @Insert 插入数据库使用，直接传入实体类会自动解析属性到对应的值

    @Insert("INSERT INTO teacher(tec_id,tec_password,tec_project) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(TeacherPO teacherPO);



    //@Update 负责修改，也可以直接传入对象
    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(TeacherPO teacherPO);



    //@delete 负责删除
    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);







}
