package com.csm.straining.dataaccess.entity.training;

public class TrainingScore {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_training_score.id
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_training_score.trainingID
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    private Long trainingID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_training_score.score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    private Integer score;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_training_score.id
     *
     * @return the value of tb_training_score.id
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_training_score.id
     *
     * @param id the value for tb_training_score.id
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_training_score.trainingID
     *
     * @return the value of tb_training_score.trainingID
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    public Long getTrainingID() {
        return trainingID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_training_score.trainingID
     *
     * @param trainingID the value for tb_training_score.trainingID
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    public void setTrainingID(Long trainingID) {
        this.trainingID = trainingID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_training_score.score
     *
     * @return the value of tb_training_score.score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_training_score.score
     *
     * @param score the value for tb_training_score.score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    public void setScore(Integer score) {
        this.score = score;
    }
}