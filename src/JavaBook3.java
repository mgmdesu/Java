
public class JavaBook3 {
	public static void main(String[] args) {
		//コード3-1,3-3
		boolean tenki = true;
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		} else {
			System.out.println("DVDをみます");
		}
		
		//コード3-4
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4)+1;
		if(fortune == 1) {
			System.out.println("大吉");
		} else if (fortune == 2) {
			System.out.println("中吉");
		} else if (fortune == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}
		
		//コード3-5,3-6
		System.out.println("あなたの運勢を占います");
		int fortune1 = new java.util.Random().nextInt(5)+1;
		switch(fortune1) {
				case 1:
				case 2:
					System.out.println("いいね！");
					break;
				case 3:
					System.out.println("普通です");
					break;
				case 4:
				case 5:
					System.out.println("うーん・・・");
		}
		
	}

}
