package com.it.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.pojo.Department;
import com.it.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments();

    /**
     * 添加部门
     * @param dep
     * @return
     */
    RespBean addDep(Department dep);

    RespBean deleteDep(Integer id);
}
