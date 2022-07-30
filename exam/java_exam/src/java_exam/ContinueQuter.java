package java_exam;

//기타 제어문 : break , continue 
// 제어문은 중첩해서 사용할수 있다.
// 제어문이 중첩되면 수행 후 바깥쪽을 수행한다
// 반복문의 경우 라벨을 정해주어 break 와 continue 사용
// break : switch 문이나 반복문을 탈출하는 제어문
// continue : 반복문에서 이하 문장을 실행하지 않고 다음 반복으로 건너뛰는 제어문
public class ContinueQuter {
	
	public static void main(String[] args) {
		
		outLoop : for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				// j 가 2가되면 한번찍고
				System.out.println("i : " + i + " - j : " + j);
				if(j == 2) {   // j 가 2이니까 탈출함 
					continue outLoop;
				}
			}
		}
	}
}
