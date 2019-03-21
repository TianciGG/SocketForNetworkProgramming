package chauncy.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class UdpClient {
	public static void main(String[] args) throws IOException {
		System.out.println("udp 客户端发送数据。。。");
		DatagramSocket ds = new DatagramSocket();
		String str="客户端发送数据。。。";
		byte[] strByte=str.getBytes();
		DatagramPacket dp = new DatagramPacket(strByte,strByte.length,InetAddress.getByName("192.168.0.111"),8080);
		ds.send(dp);
		ds.close();
	}
}
