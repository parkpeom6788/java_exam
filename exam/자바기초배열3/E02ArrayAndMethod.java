package 자바기초배열3;

public class E02ArrayAndMethod {
	
	public static void main(String[] args) {
		// 배열을 선언과 동시에 초기화 , 요소의 갯수의 의해 크기 결정됨
		int[] arr = {1 ,2 , 3 ,4 ,5 };
		// 배열 변수만 선언한 상태로 아직 참조하는 배열이 없음
		int[] ref; // 선언만 
		System.out.println("초기화 직후 출력");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  "); // 1, 2, 3, 4, 5
		}
		System.out.println();
		/*
			배열명은 매개변수로 전달하는 것은 배열의 참조값(주소값)을 전달하는
			것이다 . 정수의 경우는 해당값이 그대로 전달된다.
		 */
		ref = addAllArray(arr,7); // 주소값을 가지고 있는 참조변수를 넘김
												// ref도 같은곳을 참조하게됨
			
		/*
			addAllArray() 메소드에서 변환하는 값은 처음에 전달했던 배열의
			주소값이므로 결과적으로 ref도 동일한 배열을 참조하게 된다.
		 */
			
			// 동일한 참조값이 출력됨
		System.out.println("arr = " + arr);
		System.out.println("ref = " + ref);
		/*
			arr과 ref는 동일리한 참조값을 가지게 되었으므로 출력결과도 동일함
		 */
		System.out.println("메소드 호출 후 출력");
		for(int i = 0; i < ref.length; i++) {
			System.out.println(ref[i] + "  ");
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "  ");
		}
	}
	static int[]  addAllArray(int[] arr,int addVal) {
		for(int i = 0; i < arr.length; i++) {
	/*
		배열의 각 요소값에 7을 더한 후 결과값을 다시 저장함
		즉 7씩 증가시키는 연산이 수행된다.
	 */
			arr[i] += addVal;
		}
		return arr;
	}
	/*
	 *  배열(1)에서 변수 값은 heap 영역에 주소값을 가지고 있다고 했습니다.
	 *  만약 함수의 매개변수로 배열을 전달하게 된다면 주소값이 전달이 됩니다. 
	 *  이건 규칙입니다. 그냥 외우시면 됩니다. 주소값이 전달이 되므로
	 *   addAllArray의 매개변수로 arr의 주소값이 전달이 됩니다. 
	 *   그러므로 addAllArray 함수에서 배열을 
	 *   처리하면(배열의 값을 +1한 값) arr의 배열도 똑같이 바뀌게 됩니다. 
	 *   처음에 알고 굉장히 신기했습니다.
	 */
}
