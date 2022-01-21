import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
	public static void main(String[]args) {
		try {
			ServerSocket server = new ServerSocket(5555); //서버소켓 객체 생성
			System.out.println("사용자 접속 대기"); //접속 대기
			Socket socket = server.accept(); //사용자 접속 후 소켓 객체 생성
			
			//통신 스트림 생성
			InputStream input = socket.getInputStream();
			DataInputStream dis = new DataInputStream(input); // 데이터 받음
			
			OutputStream output = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(output); // 데이터 전달
			
			//pass 데이터 = 일치해야함
			dos.writeInt(100);
			dos.writeDouble(11.11);
			dos.writeUTF("서버가 보낸 문자열");
			
			int data1 = dis.readInt();
			double data2 = dis.readDouble();
			String data3 = dis.readUTF();
			
			socket.close();
			server.close();
			
			System.out.printf("data1 : %d\n", data1);
			System.out.printf("data1 : %f\n", data2);
			System.out.printf("data1 : %s\n", data3);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
