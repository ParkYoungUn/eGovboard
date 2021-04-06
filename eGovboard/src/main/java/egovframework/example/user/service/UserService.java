package egovframework.example.user.service;

public interface UserService {

	/**  
	 * UserService
	 * 회원가입 */
	public void register(UserVO vo) throws Exception;
	
	/**  
	 * UserService
	 * 로그인 체크 */
	//public boolean loginCheck(UserVO vo, HttpSession session);
	
	/**  
	 * UserService
	 * 로그인 정보*/
	//public UserVO viewUser(UserVO vo) throws Exception;
	
	/**  
	 * UserService
	 * 로그인 정보*/
	//public void logout(HttpSession session);
}
