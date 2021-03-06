package cn.xdl.ovls.course.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.xdl.ovls.course.entity.Subject;

public class SubjectSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String insertSelective(Subject record) {
        BEGIN();
        INSERT_INTO("subject");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDirectionId() != null) {
            VALUES("direction_id", "#{directionId,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String updateByPrimaryKeySelective(Subject record) {
        BEGIN();
        UPDATE("subject");
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDirectionId() != null) {
            SET("direction_id = #{directionId,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}