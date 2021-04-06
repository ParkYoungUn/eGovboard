package egovframework.example.user.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.user.service.UserService;
import egovframework.example.user.service.UserVO;

@Controller
public class UserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	/** EgovSampleService */
//	@Resource(name = "userService")
//	private UserService service;
	
	@Inject
	UserService service;
	
	/** 회원가입 GET */
	@RequestMapping(value="/register.do", method= RequestMethod.GET)
	public String getRegister() throws Exception {
		LOGGER.info("get register");
		return "user/register";
	}
	
	/** 회원가입 POST */
	@RequestMapping(value="/register.do", method= RequestMethod.POST)
	public String postRegister(UserVO vo) throws Exception {
		LOGGER.info("post register");
		
		service.register(vo);
		
		return "/:redirect";
	}


}
