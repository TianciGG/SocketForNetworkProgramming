package chauncy.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**   
 * @classDesc: 功能描述(TCP服务器端)  
 * @author: ChauncyWang
 * @createTime: 2019年3月21日 下午12:58:21   
 * @version: 1.0  
 */  
public class TcpServer {
	public static void main(String[] args) throws IOException {
		System.out.println("socket tcp服务端   启动。。。");
		ServerSocket serverSocket = new ServerSocket(8080);
		//等待客户端连接，阻塞状态
		Socket accept = serverSocket.accept();
		InputStream inputStream = accept.getInputStream();
		//把IO流转换成string类型
		byte[] byteArr=new byte[1024];
		int len = inputStream.read(byteArr);
		String str = new String(byteArr,0,len);
		System.out.println("str:"+str);
		serverSocket.close();
	}
}
