package com.it.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.pojo.Admin;
import com.it.pojo.RespBean;
import com.it.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录验证并返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    public RespBean login(String username,String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     */
    Admin getAdminByUserName(String username);

    /**
     * 根据用户id或者权限列表
     *
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);

    /**
     * 获取所有管理员
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(String keywords);

    /**
     * 更新管理员角色
     * @param adminId
     * @param rids
     * @return
     */
    RespBean updateAdminRole(Integer adminId, Integer[] rids);
}
