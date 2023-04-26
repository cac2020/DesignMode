package mode.行为.中介.多态化聊天室;

import java.util.ArrayList;
import java.util.List;

public abstract class ChatRoom {
    protected String name;//聊天室命名
    protected List<User> users = new ArrayList<>();//加入聊天室的用户们

    public ChatRoom(String name) {
        this.name = name;//初始化必须命名聊天室
    }

    protected void register(User user) {
        this.users.add(user);//用户进入聊天室加入列表
    }

    protected void deregister(User user) {
        users.remove(user);//用户注销，从列表中删除用户
    }

    protected abstract void sendMsg(User from, User to, String msg);

    protected abstract String processMsg(User from, User to,String msg);
}
