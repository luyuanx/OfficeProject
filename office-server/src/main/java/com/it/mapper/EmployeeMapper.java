package com.it.mapper;

import com.it.pojo.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
