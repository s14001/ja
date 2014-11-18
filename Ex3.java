import java.util.Scanner;
class Ex3{
   public String ex3_0(int n){


    if(n>0){
	return "その値は正です";
}else{ return "その値は０か負です";
    }


	}

	public int ex3_1(int n){

		return Math.abs(n);

	}

	public String ex3_2(int a, int b){
   if((a%b)==0){return "4は12の約数です";
}else{
		return "5は12の約数ではありません";
}
	}

	public String ex3_3(int a, int b){
     if(a>b){
     return "8の方が大きいです";
      }else if(a==b){return "同じ値です";
       }else{
          return "9の方が大きいです";
   }
}

public String ex3_4(int a){
     if(a%5==0&&a>0){
     return "その値は5で割り切れます";
      }else if((a%5>0)){
          return "その値は5で割り切れません";
   }else{
   return "正でない整数値です";
   }

}


public String ex3_5(int a){
    if(a%10==0){
        return "その値は10の倍数です";
    }else if(a%10>0){
       return "その値は10の倍数ではありません";
    }
    else{
      return "正でない整数値です";}
}

public String ex3_6(int a){
if(a%3==0){
        return "その値は3で割り切れます";
    }else if(a%3==1){
        return "その値を3で割った余りは1です";
    }
    else if(a%3==2){
      return"その値を3で割った余りは2です";
    }
    else{
      return"正でない整数値です";
    }
}

public String ex3_7(int a){
if(a>79&&a<101){
        return "優";
    }else if(a>69&&a<80){
        return "良";
    }else if(a>59&&a<70){
      return"可";
    }else if(a>=0&&a<60){
      return"不可";
    }else if(a>100){
      return "範囲(0～100)外の値です";
    }
    else{
      return "範囲(0～100)外の値です";
    }
    }


	public double ex3_8(double a, double b){
		 if(a>b){
        return a;}else{
        return b;
        }
    }

	public int ex3_9(int a, int b){
		return Math.abs(a-b);
	}

	public String ex3_10(int a, int b){
		if(Math.abs(a-b)<10+1){
        return "それらの差は10以下です";
            }else{
        return "それらの差は11以上です";
        }
	}

	public int ex3_11(int a, int b, int c){
		return 1000;
	}

	public int ex3_12(int a, int b, int c){
		return 1000;
	}

	public String ex3_13(int a){
		return "dummy";
	}
}

