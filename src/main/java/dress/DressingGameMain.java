package dress;

import java.util.Scanner;

public class DressingGameMain {

//	-- 전체적인 로직은 다음과 같습니다.
//	1. 유저로부터 성별을 입력받는다.
//	2. 입력받은 성별에 따라 캐릭터 아스키 아트를 출력한다.
//	3. 유저로부터 의류 이름을 입력받는다. (신발-하의-상의-모자 순)
//	4. 의류 아스키 아트와 캐릭터 아스키 아트가 합쳐진 아트가 출력된다. 
//	5. 저장하기 클릭 시 이미지 파일로 저장된다. 
//	6. 다시하기 클릭 시 게임 시작으로 돌아간다. 

	static Scanner sc = new Scanner(System.in);

	public AsciiCharacter asciiCharacter;
	public DressType dressType;
	public static MenuType menuType;

	public DressingGameMain(AsciiCharacter asciiCharacter, DressType dressType) {
		super();
		this.asciiCharacter = asciiCharacter;
		this.dressType = dressType;
	}

	public static void main(String[] args) {

		System.out.println("====================================================================================");
		System.out.println("                                옷 입히기 게임 !                                        ");
		System.out.println("====================================================================================");
		String gamestart = "   _____          __  __ ______    _____ _______       _____ _______ \r\n"
				+ "  / ____|   /\\   |  \\/  |  ____|  / ____|__   __|/\\   |  __ \\__   __|\r\n"
				+ " | |  __   /  \\  | \\  / | |__    | (___    | |  /  \\  | |__) | | |   \r\n"
				+ " | | |_ | / /\\ \\ | |\\/| |  __|    \\___ \\   | | / /\\ \\ |  _  /  | |   \r\n"
				+ " | |__| |/ ____ \\| |  | | |____   ____) |  | |/ ____ \\| | \\ \\  | |   \r\n"
				+ "  \\_____/_/    \\_\\_|  |_|______| |_____/   |_/_/    \\_\\_|  \\_\\ |_|   \r\n"
				+ "                                                                     \r\n"
				+ "                                                                     ";
		System.out.println(gamestart);

		System.out.println("====================================================================================");
		System.out.println("성별을 입력해주세요.");
		System.out.println("여자 : F, 남자 : M");
		String gender = sc.nextLine();

		// f,F이면 여자 캐릭터 / m, M이면 남자 캐릭터가 선택됩니다.
		if (gender.equals("f") || gender.equals("F")) {
			System.out.println("여자 캐릭터를 선택하셨습니다!");
			// 캐릭터 객체 생성
			AsciiCharacter asciiCharacter = new AsciiCharacter();
			// 캐릭터 아스키 아트 보여주기
			asciiCharacter.printFemaleAsciiArt(gender);

		} else if (gender.equals("m") || gender.equals("M")) {
			System.out.println("남자 캐릭터를 선택하셨습니다!");
			// 캐릭터 객체 생성
			AsciiCharacter asciiCharacter = new AsciiCharacter();
			// 캐릭터 아스키 아트 보여주기
			asciiCharacter.printMaleAsciiArt(gender);

		} else {
			System.out.println("다시 입력해주세요.");
		}

		System.out.println("게임을 종료합니다.");
//		menuType.quit();
	}

}
