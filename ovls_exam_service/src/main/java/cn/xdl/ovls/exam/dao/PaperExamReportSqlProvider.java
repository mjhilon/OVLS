package cn.xdl.ovls.exam.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.xdl.ovls.exam.entity.PaperExamReport;

public class PaperExamReportSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_exam_report
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String insertSelective(PaperExamReport record) {
        BEGIN();
        INSERT_INTO("paper_exam_report");
        
        if (record.getReportId() != null) {
            VALUES("report_id", "#{reportId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getPaperId() != null) {
            VALUES("paper_id", "#{paperId,jdbcType=INTEGER}");
        }
        
        if (record.getErrorNum() != null) {
            VALUES("error_num", "#{errorNum,jdbcType=INTEGER}");
        }
        
        if (record.getRightNum() != null) {
            VALUES("right_num", "#{rightNum,jdbcType=INTEGER}");
        }
        
        if (record.getScore() != null) {
            VALUES("score", "#{score,jdbcType=DOUBLE}");
        }
        
        if (record.getSubmitTime() != null) {
            VALUES("submit_time", "#{submitTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContent() != null) {
            VALUES("content", "#{content,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_exam_report
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String updateByPrimaryKeySelective(PaperExamReport record) {
        BEGIN();
        UPDATE("paper_exam_report");
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getPaperId() != null) {
            SET("paper_id = #{paperId,jdbcType=INTEGER}");
        }
        
        if (record.getErrorNum() != null) {
            SET("error_num = #{errorNum,jdbcType=INTEGER}");
        }
        
        if (record.getRightNum() != null) {
            SET("right_num = #{rightNum,jdbcType=INTEGER}");
        }
        
        if (record.getScore() != null) {
            SET("score = #{score,jdbcType=DOUBLE}");
        }
        
        if (record.getSubmitTime() != null) {
            SET("submit_time = #{submitTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContent() != null) {
            SET("content = #{content,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("report_id = #{reportId,jdbcType=INTEGER}");
        
        return SQL();
    }
}