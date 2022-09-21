package com.lwt.service.impl;

import com.lwt.domain.Student;
import com.lwt.dao.StudentDao;
import com.lwt.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 涛
 * @since 2022-09-21
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements IStudentService {

}
