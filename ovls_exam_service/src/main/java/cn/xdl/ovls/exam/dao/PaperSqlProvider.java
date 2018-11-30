package cn.xdl.ovls.exam.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.xdl.ovls.exam.entity.Paper;

public class PaperSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String insertSelective(Paper record) {
        BEGIN();
        INSERT_INTO("paper");
        
        if (record.getPaperId() != null) {
            VALUES("paper_id", "#{paperId,jdbcType=INTEGER}");
        }
        
        if (record.getTypeId() != null) {
            VALUES("type_id", "#{typeId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSubjectId() != null) {
            VALUES("subject_id", "#{subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getScore() != null) {
            VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getLimitTime() != null) {
            VALUES("limit_time", "#{limitTime,jdbcType=INTEGER}");
        }
        
        if (record.getCreatetime() != null) {
            VALUES("createtime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBegintime() != null) {
            VALUES("begintime", "#{begintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndtime() != null) {
            VALUES("endtime", "#{endtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionTotal() != null) {
            VALUES("question_total", "#{questionTotal,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String updateByPrimaryKeySelective(Paper record) {
        BEGIN();
        UPDATE("paper");
        
        if (record.getTypeId() != null) {
            SET("type_id = #{typeId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSubjectId() != null) {
            SET("subject_id = #{subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getScore() != null) {
            SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getLimitTime() != null) {
            SET("limit_time = #{limitTime,jdbcType=INTEGER}");
        }
        
        if (record.getCreatetime() != null) {
            SET("createtime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBegintime() != null) {
            SET("begintime = #{begintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndtime() != null) {
            SET("endtime = #{endtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionTotal() != null) {
            SET("question_total = #{questionTotal,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        WHERE("paper_id = #{paperId,jdbcType=INTEGER}");
        
        return SQL();
    }
}