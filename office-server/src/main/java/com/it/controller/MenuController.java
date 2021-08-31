package com.it.controller;


import com.it.pojo.Menu;
import com.it.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author XuYiwen
 * @since 2021-08-22
 */
@RestController
@RequestMapping("/system/config")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @GetMapping("/menu")
    @ApiOperation(value = "通过用户Id查询该用户菜单列表")
    public List<Menu> getMenuByAdminId(){
        return menuService.getMenuByAdminId();
    }
}
