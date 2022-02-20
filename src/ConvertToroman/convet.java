package ConvertToroman;

 class convet {
      private static int value[]={1000,500,100,50,10,5,1};
     private static String simbole[]={"M","D","C","L","X","V","I"};
    public static String ConvertTorom(int n){
        String roman="";
        int times;
        for (int x=0; n>0; x++){
            times=n/value[x];
            roman +=simbole[x].repeat(times);
            n %=value[x];
        }
        return roman;
    }

    public static void main(String[] args) {
        System.out.println("201 :"+ ConvertTorom(201));
        System.out.println("10 :" + ConvertTorom(10));
        System.out.println("1994:" + ConvertTorom(199));
    }
}
