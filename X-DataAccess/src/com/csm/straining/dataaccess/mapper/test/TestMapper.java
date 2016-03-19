package com.csm.straining.dataaccess.mapper.test;

import com.csm.straining.dataaccess.entity.test.Test;
import com.csm.straining.dataaccess.entity.test.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    int countByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    int deleteByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    int insert(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    int insertSelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    List<Test> selectByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    Test selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_test
     *
     * @mbggenerated Sat Mar 19 16:18:33 CST 2016
     */
    int updateByPrimaryKey(Test record);
}