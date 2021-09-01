package com.it.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.pojo.Menu;
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
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 通过用户id查询用户所拥有的菜单
     * @param adminId
     * @return
     */
    List<Menu> getMenuByAdminId(Integer adminId);

    /**
     * 查询角色所对应的菜单列表
     * @return
     */
    List<Menu> getAllMenusWithRole();

    /**
     * 获取所有菜单
     *
     * @return
     */
    List<Menu> getAllMenus();



}
