package com.it.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.pojo.Department;
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
public interface DepartmentMapper extends BaseMapper<Department> {
    /**
     * 获取所有部门
     *
     * @param parentId
     * @return
     */
    List<Department> getAllDepartmentsByParentId(Integer parentId);

    /**
     * 添加部门
     *
     * @param dep
     */
    void addDep(Department dep);

    /**
     * 删除部门
     *
     * @param dep
     */
    void deleteDep(Department dep);

}
