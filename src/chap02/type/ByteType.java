package chap02.type;

public class ByteType {
	public static void main(String[] args) {
		//byte : 정수형(+,-,0)
		//크기 : 1byte (8bit)
		
		
		
		//-128 : 10000000 (미니멈 -128)
		// -3 : 11111101
		// -2 : 11111110
		// -1 : 11111111  
		// +1 
		// 0 : 00000000
		// 1 : 00000001
		// 2 : 00000010
		//   :
		//127 : 01111111 (맥시멈 127)
		
		//-128(127+1) : 10000000
		
		byte byteValue;
		
		byteValue = 0;
		System.out.println(byteValue);
		
		byteValue = 127;
		System.out.println(byteValue);
		
		//byteValue = 128;
		
		byteValue++;
		System.out.println(byteValue);
	}

}
