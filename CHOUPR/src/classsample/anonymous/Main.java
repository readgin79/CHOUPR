package classsample.anonymous;

public class Main{
    public static void main(String[] arg){
        //�ΦW���O������
        System.out.println("�ΦW���O������:");
        Round rd = new Round(){
            double r;
            public Round setRadius(double r){
                this.r = r;
                return this;
            }
            public double area(){
                return Math.PI*r*r;
            }
            public void showResult(){
                System.out.println("��b�|�G"+r);
                System.out.println("�ꭱ�n�G"+area());
            }
        };
        rd.setRadius(19.8).showResult();
        
        //�ΦW���O���ΦW����.
        System.out.println("�ΦW���O���ΦW����:");
        new Round(){
            double r;
            public Round setRadius(double r){
                this.r = r;
                return this;
            }
            public double area(){
                return Math.PI*r*r;
            }
            public void showResult(){
                System.out.println("��b�|�G"+r);
                System.out.println("�ꭱ�n�G"+area());
            }
        }.setRadius(10).showResult();
    }
}

