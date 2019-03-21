package chauncy.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("socket tcp客户端   准备启动。。。");
		Socket socket = new Socket("169.254.23.162",8080);
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("我是客户端。。。".getBytes());
		socket.close();
	}
}
