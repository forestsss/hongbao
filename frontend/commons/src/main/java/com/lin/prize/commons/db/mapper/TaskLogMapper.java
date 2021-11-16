package com.lin.prize.commons.db.mapper;

import com.lin.prize.commons.db.entity.TaskLog;
import com.lin.prize.commons.db.entity.TaskLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TaskLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    long countByExample(TaskLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    int deleteByExample(TaskLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    @Delete({
        "delete from task_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    @Insert({
        "insert into task_log (task_id, result, ",
        "start_time, end_time, ",
        "cost_time, remark)",
        "values (#{taskId,jdbcType=INTEGER}, #{result,jdbcType=VARCHAR}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{costTime,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(TaskLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    int insertSelective(TaskLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    List<TaskLog> selectByExample(TaskLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, task_id, result, start_time, end_time, cost_time, remark",
        "from task_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.lin.prize.commons.db.mapper.TaskLogMapper.BaseResultMap")
    TaskLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TaskLog record, @Param("example") TaskLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TaskLog record, @Param("example") TaskLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TaskLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_log
     *
     * @mbg.generated
     */
    @Update({
        "update task_log",
        "set task_id = #{taskId,jdbcType=INTEGER},",
          "result = #{result,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "cost_time = #{costTime,jdbcType=INTEGER},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TaskLog record);
}