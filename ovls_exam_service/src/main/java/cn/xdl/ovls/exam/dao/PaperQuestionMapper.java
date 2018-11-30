package cn.xdl.ovls.exam.dao;

import cn.xdl.ovls.exam.entity.PaperQuestion;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PaperQuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @Delete({
        "delete from paper_question",
        "where paper_id = #{paperId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer paperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @Insert({
        "insert into paper_question (paper_id, question_id, ",
        "question_score)",
        "values (#{paperId,jdbcType=INTEGER}, #{questionId,jdbcType=INTEGER}, ",
        "#{questionScore,jdbcType=INTEGER})"
    })
    int insert(PaperQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @InsertProvider(type=PaperQuestionSqlProvider.class, method="insertSelective")
    int insertSelective(PaperQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @Select({
        "select",
        "paper_id, question_id, question_score",
        "from paper_question",
        "where paper_id = #{paperId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="paper_id", property="paperId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="question_id", property="questionId", jdbcType=JdbcType.INTEGER),
        @Result(column="question_score", property="questionScore", jdbcType=JdbcType.INTEGER)
    })
    PaperQuestion selectByPrimaryKey(Integer paperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @UpdateProvider(type=PaperQuestionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PaperQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    @Update({
        "update paper_question",
        "set question_id = #{questionId,jdbcType=INTEGER},",
          "question_score = #{questionScore,jdbcType=INTEGER}",
        "where paper_id = #{paperId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PaperQuestion record);
}