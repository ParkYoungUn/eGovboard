package egovframework.example.user.service.impl;

import javax.annotation.Resource;
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
	
//	@Inject SqlSession sql;
	
	@Resource(name = "UserDAO")
	private UserDAO userDAO;
	
	/** ID Generation */
	@Resource(name = "egovIdGnrService")
	private EgovIdGnrService egovIdGnrService;
	
	
	@Override
	public void register(UserVO vo) throws Exception {
		LOGGER.debug(vo.toString());
//		sql.insert(statement, parameter)
		
		/** ID Generation Service */
		String id = egovIdGnrService.getNextStringId();
		vo.setLoginId(id);
		LOGGER.debug(vo.toString());

		userDAO.register(vo);

	}

}
