package com.it.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 通过用户Id查询用户列表
     * @return
     */
    List<Menu> getMenuByAdminId();

    /**
     * 通过角色获取菜单列表
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
