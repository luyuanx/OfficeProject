package com.it.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.pojo.MenuRole;
import com.it.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);

}
