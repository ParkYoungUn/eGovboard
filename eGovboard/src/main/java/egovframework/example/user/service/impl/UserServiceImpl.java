package egovframework.example.user.service.impl;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.example.user.service.UserService;
import egovframework.example.user.service.UserVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;

@Service("userService")
public class UserServiceImpl extends EgovAbstractServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	
	@Resource(name = "UserMapper")
	private UserMapper mapper;
	
//	/** ID Generation */
//	@Resource(name = "egovIdGnrService")
//	private EgovIdGnrService egovIdGnrService;
	
	/** 회원가입 */
	@Override
	public void register(UserVO vo) throws Exception {
		LOGGER.debug(vo.toString());
		mapper.register(vo);
	}

	
	

}
