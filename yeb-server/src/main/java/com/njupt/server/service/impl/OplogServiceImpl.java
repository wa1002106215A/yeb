package com.njupt.server.service.impl;

import com.njupt.server.pojo.Oplog;
import com.njupt.server.mapper.OplogMapper;
import com.njupt.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
