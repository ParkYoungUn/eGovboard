package egovframework.example.user.service.impl;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.user.service.UserVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;


//@Repository
@Repository("UserMapper")
public class UserMapper extends EgovAbstractMapper {
	
	@Resource(name = "sqlSession")
	public void setSqlSessionFactory(SqlSessionFactory sqlSession) {
		super.setSqlSessionFactory(sqlSession);
	}
	
	/** 회원가입 */
	public int register(UserVO vo) throws Exception {
		return insert("register",vo);
	}


}
