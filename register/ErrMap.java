package register;

import java.util.HashMap;

public class ErrMap {
    public static HashMap<String,ErrEntity> errMap = new HashMap<>();

    static {
        ErrEntity userName = new ErrEntity("Please enter your username","username can only have 20 character","Cannot have special character","username already exist");
        ErrEntity password = new ErrEntity("Please Enter your password","your password must have more than 6 character","","");
        ErrEntity email = new ErrEntity("Please enter your email","","Enter valid email address: abs...@xyz.com","");
        errMap.put("userName",userName);
        errMap.put("password",password);
        errMap.put("email",email);
    }
}
