package java8.lambda.practice;

public class Human  {


	public static void main(String[] args) {
		//Lambda表示
		YellInterface y = (int a) -> {
			System.out.println("lambda寫法==>"+a);
			System.out.println();
		};
		y.yell(123);
		
		//傳統匿名內部類別寫法：
		YellInterface yell = new YellInterface() {

			@Override
			public void yell(int a) {
				// TODO Auto-generated method stub
				System.out.println("傳統寫法==>"+a);
			}
			
		};
		yell.yell(456);
	}


}
