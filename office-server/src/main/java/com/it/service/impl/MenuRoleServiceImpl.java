package com.it.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.mapper.MenuRoleMapper;
import com.it.pojo.MenuRole;
import com.it.pojo.RespBean;
import com.it.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid",rid));
        if (null==mids||0==mids.length){
            return RespBean.success("更新成功！");
        }
        Integer result = menuRoleMapper.insertRecord(rid,mids);
        if (mids.length==result){
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
