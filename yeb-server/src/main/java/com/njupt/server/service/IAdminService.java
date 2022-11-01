package com.njupt.server.service;

import com.njupt.server.pojo.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.njupt.server.pojo.RespBean;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wp
 * @since 2022-03-29
 */
public interface IAdminService extends IService<Admin> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */

    RespBean login(String username, String password, HttpServletRequest request);


    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);
}
