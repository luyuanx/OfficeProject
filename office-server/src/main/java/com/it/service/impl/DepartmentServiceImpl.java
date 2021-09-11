package com.it.service.impl;

import com.it.mapper.DepartmentMapper;
import com.it.pojo.Department;
import com.it.pojo.RespBean;
import com.it.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartmentsByParentId(-1);
    }

    @Override
    public RespBean addDep(Department dep) {
        dep.setEnabled(true);
        departmentMapper.addDep(dep);
        if (1==dep.getResult()){
            return RespBean.success("添加成功!",dep);
        }
        return RespBean.error("添加失败!");
    }

    @Override
    public RespBean deleteDep(Integer id) {
        Department dep = new Department();
        dep.setId(id);
        departmentMapper.deleteDep(dep);
        if (dep.getResult()==-2){
            return RespBean.error("该部门下有子部门，删除失败！");
        }
        if (dep.getResult()==-1){
            return RespBean.error("该部门下有员工，删除失败！");
        }
        if (dep.getResult()==1){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }


}
