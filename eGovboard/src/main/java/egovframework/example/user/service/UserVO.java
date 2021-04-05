package egovframework.example.user.service;

public class UserVO {
	private String userId;
	private String loginId;
	private String userName;
	private String userNick;
	private String userEmail;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", loginId=" + loginId + ", userName=" + userName + ", userNick=" + userNick
				+ ", userEmail=" + userEmail + "]";
	}
	
}
