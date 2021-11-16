package com.lin.prize.commons.db.mapper;

import com.lin.prize.commons.db.entity.TbProcLog;
import com.lin.prize.commons.db.entity.TbProcLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TbProcLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    long countByExample(TbProcLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    int deleteByExample(TbProcLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    @Delete({
        "delete from tb_proc_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    @Insert({
        "insert into tb_proc_log (proc_name, statu, ",
        "start_time, end_time, ",
        "cost_time, error_code, ",
        "error_msg, step)",
        "values (#{procName,jdbcType=VARCHAR}, #{statu,jdbcType=VARCHAR}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{costTime,jdbcType=INTEGER}, #{errorCode,jdbcType=VARCHAR}, ",
        "#{errorMsg,jdbcType=VARCHAR}, #{step,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(TbProcLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    int insertSelective(TbProcLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    List<TbProcLog> selectByExample(TbProcLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, proc_name, statu, start_time, end_time, cost_time, error_code, error_msg, ",
        "step",
        "from tb_proc_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.lin.prize.commons.db.mapper.TbProcLogMapper.BaseResultMap")
    TbProcLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbProcLog record, @Param("example") TbProcLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbProcLog record, @Param("example") TbProcLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbProcLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_proc_log
     *
     * @mbg.generated
     */
    @Update({
        "update tb_proc_log",
        "set proc_name = #{procName,jdbcType=VARCHAR},",
          "statu = #{statu,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "cost_time = #{costTime,jdbcType=INTEGER},",
          "error_code = #{errorCode,jdbcType=VARCHAR},",
          "error_msg = #{errorMsg,jdbcType=VARCHAR},",
          "step = #{step,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TbProcLog record);
}