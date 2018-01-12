/**
 * Created by matthew on 5/7/2016.
 */
public class tester {
    int x;

    public tester(){
        x = 50;

    }

    public static void main(String []args){


        tester a = new tester();

        tester b = new tester();
        System.out.println("before" + b.x);
        a.hurt(b);
        System.out.println("after" + b.x);





    }


    public void hurt(tester t ){
        t.x+=5;



    }
}
