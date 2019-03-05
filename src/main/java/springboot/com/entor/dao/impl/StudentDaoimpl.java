package springboot.com.entor.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import springboot.com.entor.dao.StudentDao;
import springboot.com.entor.entity.Student;
@Repository("studentDao")
public class StudentDaoimpl  extends BaseDaoimpl<Student> implements StudentDao{

	
}
