package cn.xdl.ovls.exam.entity;

import java.util.Date;

public class Answer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.context
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private String context;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.publish_time
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Date publishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.issue_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer issueId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.user_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.id
     *
     * @return the value of answer.id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.id
     *
     * @param id the value for answer.id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.context
     *
     * @return the value of answer.context
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.context
     *
     * @param context the value for answer.context
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.publish_time
     *
     * @return the value of answer.publish_time
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.publish_time
     *
     * @param publishTime the value for answer.publish_time
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.issue_id
     *
     * @return the value of answer.issue_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getIssueId() {
        return issueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.issue_id
     *
     * @param issueId the value for answer.issue_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.user_id
     *
     * @return the value of answer.user_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.user_id
     *
     * @param userId the value for answer.user_id
     *
     * @mbggenerated Tue Mar 27 08:40:00 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}