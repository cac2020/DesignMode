package mode.行为.中介;

import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室
 */
public class ChatRoom {
    private String name;//聊天室命名

    public ChatRoom(String name) {
        this.name = name;//初始化必须命名聊天室
    }
    List<User> users = new ArrayList<>();//加入聊天室的用户们

    public void register(User user) {
        this.users.add(user);//用户进入聊天室加入列表
        System.out.print("系统消息：欢迎【");
        System.out.print(user.getName());
        System.out.println("】加入聊天室【" + this.name + "】");
    }

    public void sendMsg(User fromWhom, String msg) {
        // 循环users列表，将消息发送给所有用户
        users.stream().forEach(toWhom -> toWhom.listen(fromWhom,msg));
    }
}
