package egovframework.example.user.web;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.example.sample.service.EgovSampleService;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.example.user.service.UserService;
import egovframework.example.user.service.UserVO;

@Controller
public class UserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	/** EgovSampleService */
	@Resource(name = "userService")
	private UserService service;
	
//	@Inject
//	UserService service;
	
	/* 회원가입 get */
	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public String getRegister(Model model) throws Exception {
		model.addAttribute("userVO", new UserVO());
		LOGGER.info("get register");
		return  "user/register";
	}
	
	/* 회원가입 post */
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String postRegister(UserVO userVO, Model model, BindingResult bindingResult, SessionStatus status) throws Exception {
		LOGGER.info("post register");
		service.register(userVO);
		
		if (bindingResult.hasErrors()) {
			LOGGER.info("if post register");
			model.addAttribute("userVO", userVO);
			return "user/register";
		}

		service.register(userVO);
		status.setComplete();
		return "forward:/register.do";
		
	}	

}
