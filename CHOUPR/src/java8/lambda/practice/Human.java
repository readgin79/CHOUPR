package java8.lambda.practice;

public class Human  {


	public static void main(String[] args) {
		//Lambda���
		YellInterface y = (int a) -> {
			System.out.println("lambda�g�k==>"+a);
			System.out.println();
		};
		y.yell(123);
		
		//�ǲΰΦW�������O�g�k�G
		YellInterface yell = new YellInterface() {

			@Override
			public void yell(int a) {
				// TODO Auto-generated method stub
				System.out.println("�ǲμg�k==>"+a);
			}
			
		};
		yell.yell(456);
	}


}
