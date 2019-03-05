package springboot.com.entor.dao.impl;

import org.springframework.stereotype.Repository;

import springboot.com.entor.dao.ClassesDao;
import springboot.com.entor.entity.Classes;
import springboot.com.entor.entity.Student;
@Repository("classesDao")
public class ClassesDaoimpl extends BaseDaoimpl<Classes> implements ClassesDao{

}
