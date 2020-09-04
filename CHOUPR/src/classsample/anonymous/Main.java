package classsample.anonymous;

public class Main{
    public static void main(String[] arg){
        //匿名類別的物件
        System.out.println("匿名類別的物件:");
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
                System.out.println("圓半徑："+r);
                System.out.println("圓面積："+area());
            }
        };
        rd.setRadius(19.8).showResult();
        
        //匿名類別的匿名物件.
        System.out.println("匿名類別的匿名物件:");
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
                System.out.println("圓半徑："+r);
                System.out.println("圓面積："+area());
            }
        }.setRadius(10).showResult();
    }
}

