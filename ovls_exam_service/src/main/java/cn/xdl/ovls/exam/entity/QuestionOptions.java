package cn.xdl.ovls.exam.entity;

public class QuestionOptions {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_options.option_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer optionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_options.question_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer questionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_options.option_name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private String optionName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_options.option_id
     *
     * @return the value of question_options.option_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getOptionId() {
        return optionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_options.option_id
     *
     * @param optionId the value for question_options.option_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_options.question_id
     *
     * @return the value of question_options.question_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_options.question_id
     *
     * @param questionId the value for question_options.question_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_options.option_name
     *
     * @return the value of question_options.option_name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_options.option_name
     *
     * @param optionName the value for question_options.option_name
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }
}