package mode.行为.中介;
/**
 * 一切关联都被间 接地交给中介聊天室去处理，用户与用户彻底解耦
 */
public class User {
    private String name;//名字

    private ChatRoom chatRoom;//聊天室引用

    public User(String name) {
        this.name = name;//初始化必须起名字
    }

    public String getName() {
        return this.name;
    }

    public void login(ChatRoom chatRoom) {//用户登录
        this.chatRoom = chatRoom;//注入聊天室引用
        this.chatRoom.register(this);//调用聊天室连接注册方法
    }
    public void talk(String msg) {//用户发言
        chatRoom.sendMsg(this, msg);//给聊天室发送消息
    }

    public void listen(User fromWhom, String msg) {//用户聆听
        System.out.print("【"+this.name+"的对话框】");
        System.out.println(fromWhom.getName() + " 说： " + msg);
    }

}
