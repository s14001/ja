import java.util.Scanner;
import java.util.Random;

abstract class Ex {
    abstract void execute();
}

class Ex2_0 extends Ex{
    void execute(){
        int x;
        int y;

        x = 63;
        y = 18;

        System.out.println("xの値は" + x + "です。");
        System.out.println("yの値は" + y + "です。");
        System.out.println("合計は" + (x + y) + "です。");
        System.out.println("平均は" + (x + y) / 2 + "です。");
    }
}

class Ex2_1 extends Ex{
    void execute(){
        double x;
        double y;

        x = 63;
        y = 18;

        System.out.println("xの値は" + x + "です。");
        System.out.println("yの値は" + y + "です。");
        System.out.println("合計は" + (x + y) + "です。");
        System.out.println("平均は" + (x + y) / 2 + "です。");
    }
}

class Ex2_2 extends Ex{
    void execute(){
        int x;
        int y;
        int z;
        x = 63;
        y = 18;
        z = 9;
        System.out.println("xの値は" + x + "です。");
        System.out.println("yの値は" + y + "です。");
        System.out.println("zの値は" + z + "です。");
        System.out.println("合計は" + (x + y + z) + "です。");
        System.out.println("平均は" + (x + y + z) / 3 + "です。");
    }
}
class Ex2_3 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("入力した値をそのまま表示します。");

		System.out.print("入力値:"); //xの値の入力を促す
		int x = stdIn.nextInt();
		System.out.println("入力値 は " + (x )); // x + yの値を表示
	}
}
class Ex2_4 extends Ex{
    void execute(){
    	Scanner stdIn = new Scanner(System.in);

		System.out.println("入力した値から10を加減します。");

		System.out.print("入力値：");		// xの値の入力を促す
		int x = stdIn.nextInt();


		System.out.println("x + x = " + (x + 10)); // x + yの値を表示
		System.out.println("x - x = " + (x - 10)); // x - yの値を表示

    }
}

class Ex2_5 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyをの平均をだします。");

		System.out.print("xの値：");		// xの値の入力を促す
        double x = stdIn.nextDouble();

		System.out.print("yの値：");		// yの値の入力を促す
		double y = stdIn.nextDouble();

		System.out.println("x + y の平均は " + ((x + y)/2)); // x + yの値を表示
	}
}
class Ex2_6 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("三角形の面積を出します");

		System.out.print("底辺：");		// xの値の入力を促す
        double x = stdIn.nextDouble();

		System.out.print("高さ：");		// yの値の入力を促す
		double y = stdIn.nextDouble();

		System.out.println("面積は  " + ((x*y)/2)); // x + yの値を表示
	}
}
public class Ex2 {
    public static void main(String[] args){
        Ex a;
        a = new Ex2_0();
        a.execute();
        a = new Ex2_1();
        a.execute();
        a = new Ex2_2();
        a.execute();
        a = new Ex2_3();
        a.execute();
        a = new Ex2_4();
        a.execute();
        a = new Ex2_5();
        a.execute();
        a = new Ex2_6();
        a.execute();
        a = new Ex2_00();
        a.execute();
        a = new Ex2_7();
        a.execute();
        a = new Ex2_8();
        a.execute();
        a = new Ex2_9();
        a.execute();
       a = new Ex2_10();
        a.execute();

    }}
class Ex2_00 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加減乗除します。");

		System.out.print("xの値：");		// xの値の入力を促す
		int x = stdIn.nextInt();

		System.out.print("yの値：");		// yの値の入力を促す
		int y = stdIn.nextInt();

		System.out.println("x + x = " + (x + y)); // x + yの値を表示
		System.out.println("x - x = " + (x - y)); // x - yの値を表示
		System.out.println("x * x = " + (x * y)); // x * yの値を表示
		System.out.println("x / x = " + (x / y)); // x / yの値を表示 (商)
		System.out.println("x % x = " + (x % y)); // x % yの値を表示 (剰余)
	}
}

class Ex2_000 extends Ex{
	void execute(){
		Random rand = new Random();

		int luchy = rand.nextInt(8)+1;		// 0～9の乱数

		System.out.println("今日のラッキーナンバーは" + luchy + "です。");
	}
}

class Ex2_7 extends Ex{
	void execute(){
		Random rand = new Random();

		int luchy = rand.nextInt(9)+1;		// 0～9の乱数
         int ln = rand.nextInt(9)-9 ;		// 0～9の乱数
        int  luc= rand.nextInt(90)+10;		// 0～9の乱数
		System.out.println("ナンバーは" + luchy + "です。");
        System.out.println("ナンバーは"+ln+"です。");
        System.out.println("ナンバーは" + luc + "です。");

    }

}

class Ex2_8 extends Ex{
	void execute(){
        Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("数値：");		// xの値の入力を促す
        int x = stdIn.nextInt();
        int  lucy=rand.nextInt(11)-5;
         int result=lucy+x;
         System.out.println("数値の±５の乱数は" + result + "です。");



	}
}



class Ex2_9 extends Ex{
	void execute(){
		Random rand = new Random();

   double luchy = rand.nextDouble();		// 0～9の乱数
   double b     =rand.nextDouble()*10;
   double c     =rand.nextDouble()*2-1;
   System.out.println("実数値は" + luchy + "です。");
 System.out.println("実数値は" + b + "です。");
 System.out.println("実数値は" + c + "です。");

    }
}

class Ex2_10 extends Ex{
	void execute(){
        Scanner stdIn =new Scanner(System.in);
        System.out.print("姓:");
        String s1=stdIn.next();
        System.out.print("名:");
        String s2=stdIn.next();
 System.out.println("こんにちは" + s1 +s2+ "さん。");


    }
}


