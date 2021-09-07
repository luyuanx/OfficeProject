package com.it.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.pojo.Employee;
import com.it.pojo.RespBean;
import com.it.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
public interface IEmployeeService extends IService<Employee> {

    /**
     * 获取所有员工(分页)
     *
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope 时间范围
     * @return
     */
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    /**
     * 获取工号
     * @return
     */
    RespBean maxWorkId();

    /**
     * 添加员工
     * @param employee
     * @return
     */
    RespBean insertEmployee(Employee employee);

    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);

}
