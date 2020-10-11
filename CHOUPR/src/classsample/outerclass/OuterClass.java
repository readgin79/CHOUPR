package classsample.outerclass;

public class OuterClass {
	
	private int a = 100;
	private static int sx = 200;
	public void showmessage() {
		System.out.println("this is a outer class.");
	}
	
	//�D�R�A���O
	class InnerClass {
		int a = 20;
		public void showmessage() {
			int a = 30;
			System.out.println("this is a inner class.");
			System.out.println("�ϰ��ܼ�a: " + a);
			System.out.println("�����ݩ��ܼ�a: " + this.a);
			System.out.println("�~���ݩ��ܼ�a: " + OuterClass.this.a);
			System.out.println("�����ܼ�sx: " + OuterClass.sx);
		}
	}
	
	//�R�A�������O
	static class InnerClass2{
		static int x = 100;
		int a = 20;
		public void showmessage() {
			int a = 30;
            System.out.println("���� showmessage()");
            System.out.println("�ϰ��ܼ� a : " + a);
            System.out.println("�����ݩ��ܼ� a : " + this.a);
            //�ܼƦW�٨S�����ƥi�H�����ϥ�sx�C
            System.out.println("�����ܼ� sx : " + OuterClass.sx);
            //�ܼƦW�٨S�����ƥi�H�����ϥ�x�C
            System.out.println("�����R�A�ݩ��ܼ� x : " + OuterClass.InnerClass2.x);
		}
		
        static public void showmessage2(){
            int a = 40;
            System.out.println("�����R�A showmessage2()");
            System.out.println("�ϰ��ܼ� a : " + a);
            //�ܼƦW�٨S�����ƥi�H�����ϥ�sx�C
            System.out.println("�����ܼ� sx : " + OuterClass.sx);
            //�ܼƦW�٨S�����ƥi�H�����ϥ�x�C
            System.out.println("�����R�A�ݩ��ܼ� x : " + OuterClass.InnerClass2.x);
        }
	}
	
	public void showmessageInner() {
		//�sĶ�ɷ|�[�Wfinal
		int a =20;
		System.out.println("this is a outer class.");
		System.out.println("�ϰ줺�����O");
		
		class InnerClass{
			//�Y�[�W�H�U�o��A�h�|�L�X200�A�]�����O������k�|���̪񪺦P�W�ܼƨӨϥ�
			//int a =200;
			public void showmessage() {
				System.out.println("this is a inner class.");
				System.out.println("a= " + a);
				//�H�U�o��|���~�A�]��������k�Ҧs�����ܼƥ��M�Ofinal�A�G�L�k�ק�A
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
		System.out.println("-------�~�����O��ҤƤ������O---------------");
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.showmessage();
		System.out.println("--------�ΦW���O--------------");
		OuterClass.InnerClass oic = new OuterClass().new InnerClass();
		oic.showmessage();
		System.out.println("--------�u�ϥΤ@��------------");
		new OuterClass().new InnerClass().showmessage();
		
		
		// �ϥΫD�R�A��k�ɡA�����إߪ����Ҥ~�i�H�ϥ�
        OuterClass.InnerClass2 oic2 = new OuterClass.InnerClass2();
        oic2.showmessage();;
        System.out.println();
        
        // �ΦW����
        new OuterClass.InnerClass2().showmessage();;
        System.out.println();
        
        // �ŧi���R�A�����{�����i�H�ϥΡA�u�n�s���v�����ϥ� private�C
        System.out.println("�����R�A�ݩ��ܼ� x : " + OuterClass.InnerClass2.x);
        System.out.println();
        
        OuterClass.InnerClass2.showmessage2();
        System.out.println();
        //�ϰ줺�����O
        oc.showmessageInner();
	}

}
