package com.lin.prize.commons.db.mapper;

import com.lin.prize.commons.db.entity.CardUserGame;
import com.lin.prize.commons.db.entity.CardUserGameExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface CardUserGameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    long countByExample(CardUserGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    int deleteByExample(CardUserGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    @Delete({
        "delete from card_user_game",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    @Insert({
        "insert into card_user_game (userid, gameid, ",
        "createtime)",
        "values (#{userid,jdbcType=INTEGER}, #{gameid,jdbcType=INTEGER}, ",
        "#{createtime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(CardUserGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    int insertSelective(CardUserGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    List<CardUserGame> selectByExample(CardUserGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, userid, gameid, createtime",
        "from card_user_game",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.lin.prize.commons.db.mapper.CardUserGameMapper.BaseResultMap")
    CardUserGame selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CardUserGame record, @Param("example") CardUserGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CardUserGame record, @Param("example") CardUserGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CardUserGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_user_game
     *
     * @mbg.generated
     */
    @Update({
        "update card_user_game",
        "set userid = #{userid,jdbcType=INTEGER},",
          "gameid = #{gameid,jdbcType=INTEGER},",
          "createtime = #{createtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CardUserGame record);
}