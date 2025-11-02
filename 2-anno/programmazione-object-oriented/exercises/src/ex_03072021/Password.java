package ex_03072021;

public class Password {
	public Password(String password) {
		this.password=password;
	}
	public boolean checkPass(String passwordLetta) {
		if(passwordLetta.length()<8) {
			return false;
		} else {
			for(int i=0;i<passwordLetta.length();i++) {
				if(!Character.isUpperCase(passwordLetta.charAt(0)) && !Character.isDigit(passwordLetta.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}
	
	private String password;
}
