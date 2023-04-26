package mode.行为.中介.多态化聊天室;

public class AdminUser extends User {
    protected AdminUser(String name) {
        super(name);
    }

    public void kick(User user) {//踢出其他用户
        user.logout();//调用被踢用户的注销方法
    }

}