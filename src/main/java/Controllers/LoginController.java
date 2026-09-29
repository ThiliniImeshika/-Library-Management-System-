package Controllers;

public class LoginController {
    public boolean checkUsernameandPassword(String userName, String password) {
        if(userName.equals("nimal")&& password.equals("1234"))
        {
            return true;
        }
        return false;
    }
//    public boolean checkUsernameandPassword(String userName, String password) {
//        if(userName.equals("nimal") && password.equals("1234")){
//            return true;
//        }
//        return false;
//    }
}
