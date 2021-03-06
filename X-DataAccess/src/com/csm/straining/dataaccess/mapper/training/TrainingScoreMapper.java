package com.csm.straining.dataaccess.mapper.training;

import com.csm.straining.dataaccess.entity.training.TrainingScore;
import com.csm.straining.dataaccess.entity.training.TrainingScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    int countByExample(TrainingScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    int deleteByExample(TrainingScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    int insert(TrainingScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    int insertSelective(TrainingScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    List<TrainingScore> selectByExample(TrainingScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    TrainingScore selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    int updateByExampleSelective(@Param("record") TrainingScore record, @Param("example") TrainingScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    int updateByExample(@Param("record") TrainingScore record, @Param("example") TrainingScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    int updateByPrimaryKeySelective(TrainingScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_training_score
     *
     * @mbggenerated Sun Apr 24 01:38:45 CST 2016
     */
    int updateByPrimaryKey(TrainingScore record);
}