package com.it.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.pojo.Admin;
import com.it.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {



}
