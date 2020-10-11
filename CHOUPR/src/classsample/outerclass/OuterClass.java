package classsample.outerclass;

public class OuterClass {
	
	private int a = 100;
	private static int sx = 200;
	public void showmessage() {
		System.out.println("this is a outer class.");
	}
	
	//非靜態類別
	class InnerClass {
		int a = 20;
		public void showmessage() {
			int a = 30;
			System.out.println("this is a inner class.");
			System.out.println("區域變數a: " + a);
			System.out.println("內部屬性變數a: " + this.a);
			System.out.println("外部屬性變數a: " + OuterClass.this.a);
			System.out.println("全域變數sx: " + OuterClass.sx);
		}
	}
	
	//靜態內部類別
	static class InnerClass2{
		static int x = 100;
		int a = 20;
		public void showmessage() {
			int a = 30;
            System.out.println("內部 showmessage()");
            System.out.println("區域變數 a : " + a);
            System.out.println("內部屬性變數 a : " + this.a);
            //變數名稱沒有重複可以直接使用sx。
            System.out.println("全域變數 sx : " + OuterClass.sx);
            //變數名稱沒有重複可以直接使用x。
            System.out.println("內部靜態屬性變數 x : " + OuterClass.InnerClass2.x);
		}
		
        static public void showmessage2(){
            int a = 40;
            System.out.println("內部靜態 showmessage2()");
            System.out.println("區域變數 a : " + a);
            //變數名稱沒有重複可以直接使用sx。
            System.out.println("全域變數 sx : " + OuterClass.sx);
            //變數名稱沒有重複可以直接使用x。
            System.out.println("內部靜態屬性變數 x : " + OuterClass.InnerClass2.x);
        }
	}
	
	public void showmessageInner() {
		//編譯時會加上final
		int a =20;
		System.out.println("this is a outer class.");
		System.out.println("區域內部類別");
		
		class InnerClass{
			//若加上以下這行，則會印出200，因為類別內的方法會找到最近的同名變數來使用
			//int a =200;
			public void showmessage() {
				System.out.println("this is a inner class.");
				System.out.println("a= " + a);
				//以下這行會錯誤，因為內部方法所存取的變數必然是final，故無法修改，
				//System.out.println("a= " + (a++));
			}
		}
		
		InnerClass ic = new InnerClass();
		ic.showmessage();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc = new OuterClass();
		oc.showmessage();
		System.out.println("-------外部類別實例化內部類別---------------");
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.showmessage();
		System.out.println("--------匿名類別--------------");
		OuterClass.InnerClass oic = new OuterClass().new InnerClass();
		oic.showmessage();
		System.out.println("--------只使用一次------------");
		new OuterClass().new InnerClass().showmessage();
		
		
		// 使用非靜態方法時，必須建立物件實例才可以使用
        OuterClass.InnerClass2 oic2 = new OuterClass.InnerClass2();
        oic2.showmessage();;
        System.out.println();
        
        // 匿名物件
        new OuterClass.InnerClass2().showmessage();;
        System.out.println();
        
        // 宣告為靜態全部程式都可以使用，只要存取權限不使用 private。
        System.out.println("內部靜態屬性變數 x : " + OuterClass.InnerClass2.x);
        System.out.println();
        
        OuterClass.InnerClass2.showmessage2();
        System.out.println();
        //區域內部類別
        oc.showmessageInner();
	}

}
