package ex06array;

/*
	foreach문
 	: 배열의 일부가 아니라 전체를 참조해야할 때 주로 사용하는 개선된 for문이다
 	  배열의 요소를 참조의 형태로 가져와서 사용한다
 	  그러므로 (참조의 목적)으로만 사용해야 하고 , ★ (값의 변경은 기본적으로 허용하지 않는다) ★
 	  형식]
 	  	for(자료형 참조변수 : 배열의 이름)
 	  		실행문장;
 	  		참조변수를 통해 배열의 요소값 출력 가능;
 */
public class E07ForEachBasic {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("기본 for문을 이용한 합계 : " + sum);
		/*
			배열 arr의 요소를 하나씩 참조하여 출력하고 , 더이상 참조할 요소가 없을때
			for문이 자동으로 종료된다.
		 */
		sum = 0;
		for(int e : arr) {
			System.out.print(e + " ");
			sum += e;
		}
		System.out.println("\nforeach문을 이용한 합계 : " + sum);
		/*
		 	참조 형태로 각 요소를 가져와서 변수 b에 할당하는 형식이므로
		  	아래 증가연산자를 통해 증가하는것은 실제 배열에 적용되지 않는다
		  	해당 foreach문 내에서만 증가하게 된다.
		 */
		System.out.println("배열arr의 요소값 1 증가시키기");
		for(int b : arr) {
			b++;
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("배열 arr의 요소 재출력하기");
		for(int c : arr) {
			System.out.print(c + " "); 
			/*
			 * +1증가된 부분이 기존 배열에 적용되지 않으므로 기존의 값이 그대로 출력된다.
			 */
		}
		System.out.println();
		/*
			2차원 배열은 1차원배열 여러개를 쌓아놓은 형태이므로 출력시에는
			우선 하나의 행(1차원배열)을 가져와서 각 요소를 하나씩 참조하여 출력
		 */
		System.out.println("2차원 배열을 foreach문으로 출력하기");
		int[][] twoDim = {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300,400}
		};
		// 2차원 배열의 foreach문 
		for(int[] a : twoDim) {
			for(int b : a) {
				System.out.println(b + " ");
			}
			System.out.println();
		}
		/*
		for-each이 처음에 봤을 때는 익숙하지 않아서 어려울 수 있습니다.
		하지만 앞에서 이해했던 자료구조 형식으로 이해하면 이해가 좀 더 쉽습니다. 
		for(int e : arr) 같은 경우를 봅시다 arr변수에는 주소값이 들어있다는 것은 앞에 배열부분에서 공부했습니다. 
		arr변수에 주소값으로 첫번째 값을 참조하고 그 값을 e에 복사하는 원리입니다. 
		그렇게 이해하게 되면 왜 for-each문 안에서는 가공이 되지만
		그 지역 밖으로 나오면 가공된 값이 배열에 저장되지 않는지도 자연스럽게 이해가 되실 겁니다.
		*/
	}
}
