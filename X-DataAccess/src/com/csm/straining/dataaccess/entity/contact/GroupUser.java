package com.csm.straining.dataaccess.entity.contact;

import java.util.Date;

public class GroupUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_group_user.id
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_group_user.groupID
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    private Long groupID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_group_user.userID
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    private Long userID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_group_user.createAt
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    private Date createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_group_user.status
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_group_user.id
     *
     * @return the value of tb_group_user.id
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_group_user.id
     *
     * @param id the value for tb_group_user.id
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_group_user.groupID
     *
     * @return the value of tb_group_user.groupID
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    public Long getGroupID() {
        return groupID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_group_user.groupID
     *
     * @param groupID the value for tb_group_user.groupID
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_group_user.userID
     *
     * @return the value of tb_group_user.userID
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    public Long getUserID() {
        return userID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_group_user.userID
     *
     * @param userID the value for tb_group_user.userID
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    public void setUserID(Long userID) {
        this.userID = userID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_group_user.createAt
     *
     * @return the value of tb_group_user.createAt
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_group_user.createAt
     *
     * @param createAt the value for tb_group_user.createAt
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_group_user.status
     *
     * @return the value of tb_group_user.status
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_group_user.status
     *
     * @param status the value for tb_group_user.status
     *
     * @mbggenerated Wed Apr 20 02:20:26 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}