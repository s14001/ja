class Ex4{

	public int [] ex4_1(int [] a){
 int temp=0;
 for(int rpt=0;rpt<a.length-1;rpt++){
  for(int i=0;i<a.length-1;i++){

    if(a[i]>a[i+1]){
      temp=a[i];
      a[i]=a[i+1];
      a[i+1]=temp;
     }
   }
  }
return a;
}


public int [] ex4_2(int [] a){
  int t=0;

  for(int d=0;d<(a.length-1);d++){
   for(int i=0;i<a.length-1;i++){
     int max=Math.max(a[i],a[i+1]);

     if(max==a[i+1]){
       t=a[i];
       a[i]=a[i+1];
       a[i+1]=t;
      }

    }
   }

     return a;
  }

	public String [] ex4_3(int [] a){

		String [] hantei = {"負","零","正"};
        String [] ireko=new String[a.length];
        for(int i=0;i<a.length;i++){
       if(a[i]>0){
        ireko[i] =hantei[2];
       }else if(a[i]<0){
        ireko[i] =hantei[0];
       }else{
         ireko[i]=hantei[1];
       }

   }

    return ireko;
 }

	public int ex4_4(int a){
	   int ten=1;
       int num=0;
       for(int rep=1;rep<ten*2+1;rep++){
         ten*=10;
         if(a/ten>0 && a/ten<10){
            num= rep+1;
         }else if(a<10){
               num =1;
         }
   }

     return num;
	}

	public int ex4_5(int a){
       int sum=0;
       for(int cal=1 ;cal<a+1;cal++){
           sum+=cal;
        }
        return sum;
  }
}

