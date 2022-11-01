package com.njupt.server.service.impl;

import com.njupt.server.pojo.Nation;
import com.njupt.server.mapper.NationMapper;
import com.njupt.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
