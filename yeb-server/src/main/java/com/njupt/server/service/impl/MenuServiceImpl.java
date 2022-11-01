package com.njupt.server.service.impl;

import com.njupt.server.pojo.Menu;
import com.njupt.server.mapper.MenuMapper;
import com.njupt.server.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wp
 * @since 2022-03-29
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
