import java.util.Scanner;

public class Main {
    static float balance=0;
    static Scanner input=new Scanner(System.in);

    public static void insert_money(){
        System.out.println("CHOOSE MONEY TYPE");
        System.out.format("TYPE 1 FOR TL %nTYPE 2 FOR KURUS %n");
        int money_type=input.nextInt();
         if (money_type==1){
                System.out.println("INSERT MONEY AMOUNT");
                int tl=input.nextInt();
                if(tl==1||tl==5||tl==10){
                    balance+=tl;
                    System.out.format("Current Balance: %.2f TL%n",balance);
                    menu();
                }
                else{
                    System.out.println("insert valid money!");
                    insert_money();
                }}
            if(money_type==2){
                System.out.println("INSERT MONEY AMOUNT");
                int krs=input.nextInt();
                if(krs==50){
                    balance+=(krs*(0.01));
                    System.out.format("Current Balance: %.2f TL %n",balance);
                    menu();
                }
                else{
                    System.out.println("insert valid money!");
                    insert_money();
                }}
        }

    public static void purchase_item(){
        System.out.println("CHOOSE YOUR ITEM");
        System.out.format("TYPE 1 FOR COLA %nTYPE 2 FOR FANTA %nTYPE 3 FOR SODA %n");
        int item=input.nextInt();

            if(item==1){
                if(balance>=15){
                    System.out.println("HERE IS YOUR COLA");
                    balance=balance-15;
                    System.out.format("Current Balance: %.2f TL%n",balance);
                }
                else{
                    System.out.println("NOT ENOUGH MONEY!");
                    menu();
                }}
           if(item==2){
                if(balance>=20){
                    System.out.println("HERE IS YOUR FANTA");
                    balance=balance-20;
                    System.out.format("Current Balance: %.2f TL%n",balance);
                }
                else{
                    System.out.println("NOT ENOUGH MONEY!");
                    menu();
                }}
           if(item==3){
                if(balance>=30){
                    System.out.println("HERE IS YOUR SODA");
                    balance=balance-30;
                    System.out.format("Current Balance: %.2f TL %n",balance);
                }
                else{
                    System.out.println("NOT ENOUGH MONEY!");
                    menu();
                }}
            menu();


    }

    public static void menu(){
        System.out.format("TYPE 'add' TO INSERT MONEY %nTYPE 'go' TO PURCHASE ITEMS %nTYPE 'exit' TO EXIT %n");
        System.out.format("Current Balance: %.2f TL %n",balance);
        String command=input.next();
        if (command.equals("add")){
            insert_money();
        }
        else if(command.equals("go")){
            purchase_item();
        }
        else if(command.equals("exit")){
            System.out.println("PURCHASE CANCELLED. YOU MAY TAKE YOUR MONEY BACK");
            balance=0;
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE VENDING MACHINE!");
        menu();
    }
}
