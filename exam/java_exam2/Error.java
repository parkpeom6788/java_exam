package java_exam2;

public class Error {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		// byte c = a + b; 일 경우 a,b 모두 int 형으로 변환 되어 연산 되기 때문에 에러 발생
		byte c = (byte)(a + b); // 형변환을 통해 byte 데이터 타입으로 바꿔주고 계산해야 한다
		System.out.println(c);
	}
}
