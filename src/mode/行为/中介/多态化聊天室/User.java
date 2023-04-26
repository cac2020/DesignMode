package mode.行为.中介.多态化聊天室;

import java.util.Objects;

public class User {
    protected ChatRoom chatRoom;//聊天室引用
    private String name;//名字
    protected User(String name) {
        this.name = name;//初始化必须起名字
    }

    public String getName() {
        return this.name;
    }

    protected void login(ChatRoom chatRoom) {//用户登录
        chatRoom.register(this);//调用聊天室连接注册方法
        this.chatRoom = chatRoom;//注入聊天室引用
    }

    protected void logout() {//用户注销
        chatRoom.deregister(this);//调用聊天室注销方法
        this.chatRoom = null;//置空当前聊天室引用
    }

    protected void talk(User to, String msg) {//用户发言
        if (Objects.isNull(chatRoom)) {
            System.out.println("【" + name + "的对话框】" + "您还没有登录");
            return;
        }
        chatRoom.sendMsg(this, to, msg);//给聊天室发送消息
    }

    public void listen(User from, User to, String msg) {//聆听方法
        System.out.print("【" + this.getName() + "的对话框】");
        System.out.println(chatRoom.processMsg(from, to,msg));//调用聊天室加工消息方法
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

}
