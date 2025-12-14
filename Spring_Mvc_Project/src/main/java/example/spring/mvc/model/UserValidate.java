package example.spring.mvc.model;

public class UserValidate {

	public static boolean isValid(User obj) {
		boolean result=false;
		String uid=obj.getUserId();
		String pass=obj.getPassword();
		
		if(uid.equals("admin")&&pass.equals("asAdmin"))
			result=true;
		
		return result;
		
			
	}
}
