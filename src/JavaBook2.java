
public class JavaBook2 {
	public static void main(String[] args) {
		//++ や -- は他の演算子と一緒に使わない！
		int a = 10;
		int b = 10;
		System.out.println(++a + 50);
		System.out.println(b++ + 50);
		
		//コード2-8
		double d = 8.5 / 2;
		long l = 5 + 2L;
		System.out.println(d);
		System.out.println(l);
		
		//コード2-9
		String msg = "私の年齢は" + 23;
		System.out.println(msg);
		
		//コード2-11
		String name = "すがわら";
		System.out.print("私の名前は");
		System.out.print(name);
		System.out.print("です");
		
		//コード2-12
		int aa = 5;
		int bb = 3;
		int m = Math.max(aa,  bb);
		System.out.println("比較実験：" + aa + "と" + bb + "とで大きい方は・・・" + m);
		
		//コード2-13
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
		
		//コード2-14
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		
		//コード2-15
		System.out.println("あなたの名前を入力してください");
		String name1 = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int age1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age1 + "歳の" + name1 + "さん");
	}

}
