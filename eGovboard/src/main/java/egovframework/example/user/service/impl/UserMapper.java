package egovframework.example.user.service.impl;

import egovframework.example.user.service.UserVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("userMapper")
public interface UserMapper {

	/*** 회원가입 */
	void register(UserVO vo) throws Exception;
	
}
