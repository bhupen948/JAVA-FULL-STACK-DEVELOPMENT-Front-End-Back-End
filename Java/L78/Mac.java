class Mac {
    public static void main(String[] args) {
        int sum =0;
        int x[] []= {{10,20,30,40,50,51},{60,70,80,90,100,101},{11,12,13,14,15,16}};

        for (int r=0; r<=2;r++) {
            for (int c=0;c<=5;c++){
                System.out.print(" "+x[r][c]);
                sum = sum+x[r][c];
            }
            System.out.println("\n");
        }
        System.out.println("----------------------");
       System.out.println("sum is: "+ sum);
    }

    
}