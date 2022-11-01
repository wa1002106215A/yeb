package com.njupt.server.service.impl;

import com.njupt.server.pojo.MailLog;
import com.njupt.server.mapper.MailLogMapper;
import com.njupt.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
