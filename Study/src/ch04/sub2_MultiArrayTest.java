package ch04;

/*
 * 날짜 : 2021/1/04
 * 이름 : 양대석
 * 내용 : 자바 다차원 배열 실습하기 교재 p118
 */

public class sub2_MultiArrayTest {
	
	public static void main(String[] args) {
		
		// 1차원 배열
		int arr1d[] = {10, 20, 30, 40, 50};
		
		int total = 0;
		
		for(int n : arr1d) {
			total += n;
		}
		
		System.out.println("total : "+total);
		
		// 2차원 배열
		int arr2d[][] = {{1,  2,  3,  4}, 
				         {5,  6,  7,  8}, 
				         {9, 10, 11, 12}};
		
		System.out.println("arr2d[0][0] : "+arr2d[0][0]);
		System.out.println("arr2d[0][2] : "+arr2d[0][2]);
		System.out.println("arr2d[1][2] : "+arr2d[1][2]);
		System.out.println("arr2d[2][1] : "+arr2d[2][1]);
		
		// 3차원 배열
		int arr3d[][][] = {{{1, 2, 3}, 
							{4, 5, 6}, 
							{7, 8, 9}}, 
						   {{10,11,12}, 
							{13,14,15}, 
							{16,17,18}}, 
						   {{19,20,21}, 
					        {22,23,24}, 
					        {25,26,27}}};
		
		System.out.println("arr3d[0][0][2] : "+arr3d[0][0][2] );
		System.out.println("arr3d[0][1][1] : "+arr3d[0][1][1] );
		System.out.println("arr3d[1][0][1] : "+arr3d[1][0][1] );
		System.out.println("arr3d[1][2][1] : "+arr3d[1][2][1] );
		System.out.println("arr3d[2][0][2] : "+arr3d[2][0][2] );
		System.out.println("arr3d[2][2][0] : "+arr3d[2][2][0] );
		
		
	}

}
