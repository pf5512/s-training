package com.csm.straining.dataaccess.entity.article;

import java.util.Date;

public class ArticleLike {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article_like.id
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article_like.articleID
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    private Long articleID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article_like.userID
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    private Long userID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article_like.createAt
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    private Date createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article_like.type
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article_like.status
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article_like.id
     *
     * @return the value of tb_article_like.id
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article_like.id
     *
     * @param id the value for tb_article_like.id
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article_like.articleID
     *
     * @return the value of tb_article_like.articleID
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public Long getArticleID() {
        return articleID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article_like.articleID
     *
     * @param articleID the value for tb_article_like.articleID
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public void setArticleID(Long articleID) {
        this.articleID = articleID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article_like.userID
     *
     * @return the value of tb_article_like.userID
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public Long getUserID() {
        return userID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article_like.userID
     *
     * @param userID the value for tb_article_like.userID
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public void setUserID(Long userID) {
        this.userID = userID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article_like.createAt
     *
     * @return the value of tb_article_like.createAt
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article_like.createAt
     *
     * @param createAt the value for tb_article_like.createAt
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article_like.type
     *
     * @return the value of tb_article_like.type
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article_like.type
     *
     * @param type the value for tb_article_like.type
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article_like.status
     *
     * @return the value of tb_article_like.status
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article_like.status
     *
     * @param status the value for tb_article_like.status
     *
     * @mbggenerated Mon Apr 18 00:41:41 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}