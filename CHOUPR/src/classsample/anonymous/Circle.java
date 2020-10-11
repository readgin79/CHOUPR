package classsample.anonymous;
//�ΦW�������O������
public class Circle {
	double r;
    public void setRadius(double r){
        this.r=r;
    }
    public double area(){
        return Math.PI*r*r;
    }
    
    public static void main(String[] arg){
        Circle basketBall = new Circle(){
            public double area(){
                return 4.0/3.0*super.area();
            }
        };
        basketBall.setRadius(19.8);
        System.out.println("�y�b�|�G" + basketBall.r);
        System.out.println("�y��n�G" + basketBall.area());
    }
}
