package com.csm.straining.dataaccess.entity.moment;

import java.util.Date;

public class MomentReply {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_moment_reply.id
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_moment_reply.momentID
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    private Long momentID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_moment_reply.userID
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    private Long userID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_moment_reply.content
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_moment_reply.replyID
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    private Long replyID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_moment_reply.createAt
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    private Date createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_moment_reply.status
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_moment_reply.id
     *
     * @return the value of tb_moment_reply.id
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_moment_reply.id
     *
     * @param id the value for tb_moment_reply.id
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_moment_reply.momentID
     *
     * @return the value of tb_moment_reply.momentID
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public Long getMomentID() {
        return momentID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_moment_reply.momentID
     *
     * @param momentID the value for tb_moment_reply.momentID
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public void setMomentID(Long momentID) {
        this.momentID = momentID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_moment_reply.userID
     *
     * @return the value of tb_moment_reply.userID
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public Long getUserID() {
        return userID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_moment_reply.userID
     *
     * @param userID the value for tb_moment_reply.userID
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public void setUserID(Long userID) {
        this.userID = userID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_moment_reply.content
     *
     * @return the value of tb_moment_reply.content
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_moment_reply.content
     *
     * @param content the value for tb_moment_reply.content
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_moment_reply.replyID
     *
     * @return the value of tb_moment_reply.replyID
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public Long getReplyID() {
        return replyID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_moment_reply.replyID
     *
     * @param replyID the value for tb_moment_reply.replyID
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public void setReplyID(Long replyID) {
        this.replyID = replyID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_moment_reply.createAt
     *
     * @return the value of tb_moment_reply.createAt
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_moment_reply.createAt
     *
     * @param createAt the value for tb_moment_reply.createAt
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_moment_reply.status
     *
     * @return the value of tb_moment_reply.status
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_moment_reply.status
     *
     * @param status the value for tb_moment_reply.status
     *
     * @mbggenerated Fri Apr 22 23:06:16 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}