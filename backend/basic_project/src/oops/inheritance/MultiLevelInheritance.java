package oops.inheritance;

public class MultiLevelInheritance {
	 public static void main(String[] args) {
		System.out.println("----first release-----");
		WeChat chat = new WeChat();
		chat.call();
		 System.out.println("----second release-----");
//		 Non primitive Typecasting -- implict 
		 
		chat=new WechatVersion2();
		chat.call();
		 System.out.println("----third release-----");

		chat=new WeChatVersion3();
		chat.call();
	}

}







class WeChat{ //parent class/ base class/super classs
	 public void call() {
		 System.out.println("calling is enabled in version1....");
	 }
}
class WechatVersion2 extends WeChat{ //child of Wechat and parent of WechatVersion3
	@Override
	public void call() {
		super.call();
		System.out.println("video call is added in version2 ....");
	}
}
class WeChatVersion3 extends WechatVersion2{//child
	@Override
	public void call() {
		super.call();
		System.out.println("video call with add people is enabled in version3.... ");
	}
}

