package LottoNumber;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		System.out.println("\n ────────────────────────────");
		System.out.println(" │ ★Lotto☆ Number Generator │");
		System.out.println(" ────────────────────────────");
		
		
		// 선택번호
		int[] selectNumber = new int[6]; // 선택번호 6개가 저장될 배열 생성
		Random random = new Random(3); // 선택번호 얻기 위한 Random 객체 생성
		
		System.out.print(" 선택 번호 : ");
		
		// 선택번호 6개를 얻어 배열에 저장
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		
		//당첨번호
		int[] winningNumber = new int[6]; // 당청번호 6개가 저장될 배열 생성
		random = new Random(3); // 당첨번호를 얻기 위한 Random 객체 생성
		
		System.out.print(" 당첨 번호 : ");
		
		// 당청번호 6개를 얻어 배열에 저장
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println("\n");
		
		
		// 당첨 여부
		// 비교하기 전에 배열 항목을 정렬
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		// 배열 항목 비교
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println(" 당첨 여부 \n");
		if (result) {
			System.out.println(" *******************");
			System.out.println(" * 1등에 당첨되었습니다. *");
			System.out.println(" *******************");
		} else {
			System.out.println(" ──────────────────");
			System.out.println(" │ 당첨되지 않았습니다. │");
			System.out.println(" ──────────────────");
			
		}
	}
}
