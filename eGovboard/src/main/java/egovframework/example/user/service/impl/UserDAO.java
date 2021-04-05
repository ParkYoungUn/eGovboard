package egovframework.example.user.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.SampleVO;
import egovframework.example.user.service.UserVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("UserDAO")
public class UserDAO extends EgovAbstractMapper {
	
	private String uName ="egovframework.example.service.impl.UserMapper";
	
	/** 회원가입 */
	public int register(UserVO vo) throws Exception {
		return (Integer) insert(uName+".register", vo);
	}

}
