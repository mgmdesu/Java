
public class Chapter08 {
	public static void main(String[] args) {
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++; //これを記述しないと永遠と"1"と表示される（無限ループ）
		}
		
		int[] array = {1, 2, 3, 4};
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(int val : array) {
			if(val % 2 == 0) { //2で割り切れたら偶数
				continue;
			}
			System.out.println(val);
		}
	}
}
