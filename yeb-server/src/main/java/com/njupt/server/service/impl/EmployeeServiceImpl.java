package com.njupt.server.service.impl;

import com.njupt.server.pojo.Employee;
import com.njupt.server.mapper.EmployeeMapper;
import com.njupt.server.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
