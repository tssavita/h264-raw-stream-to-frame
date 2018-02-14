import java.net.Socket;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class tcp_h264_decoding {
	String findpattern() {
		int index = -1;
		
		
		
		return index;
	}
	
	public static void main(String[] args) {
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		String host = args[0];
		int port = Integer.parseInt(args[1]);
		int k;
		try {
			byte[] resultBuff = new byte[0];
			byte[] buff = new byte[1024];
			Socket socket = new Socket(host, port);
		    while((k = socket.getInputStream().read(buff, 0, buff.length)) > -1) {
		        byte[] tbuff = new byte[resultBuff.length + k]; // temp buffer size = bytes already read + bytes last read
		        System.arraycopy(resultBuff, 0, tbuff, 0, resultBuff.length); // copy previous bytes
		        System.arraycopy(buff, 0, tbuff, resultBuff.length, k);  // copy current lot
		        resultBuff = tbuff; // call the temp buffer as your result buff
		    }
//			InputStream inputStream = socket.getInputStream();
//			System.out.println("Hello World!");
			System.exit(0);
			findpattern(resultBuff, "00 00 0");
		} catch(Exception e) {
			System.out.println("Exception occurred");
//			socket.close();
		}
	}
}
