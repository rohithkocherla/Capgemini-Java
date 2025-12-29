public class loanPayableAmountCalculation {
    public static double loan(double principal){
        
        return principal + (principal * 8 / 100);


    }
    public static double loan(double principal,int years){
         return principal * Math.pow(1.10, years);

    }
    public static double loan(double principal,int years,String loanType){
        double rate = 0;

        if (loanType.equalsIgnoreCase("HOME")) {
            rate = 0.07;
            System.out.println("HOME loan compound rate = 7%");
        } 
        else if (loanType.equalsIgnoreCase("AUTO")) {
            rate = 0.09;
            System.out.println("AUTO loan compound rate = 9%");
        } 
        else if (loanType.equalsIgnoreCase("PERSONAL")) {
            rate = 0.12;
            System.out.println("PERSONAL loan compound rate = 12%");
        }

        return principal * Math.pow(1 + rate, years);
    }

         public static void main(String[] args) {
        int principal=200000;
        int years=5;
        String loanType="HOME";
        

        double amount=loan(principal ,years ,loanType);
        System.out.println(amount);


    }

}