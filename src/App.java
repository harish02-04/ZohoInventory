import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Inventory Zoho=new Inventory();
        Scanner sc=new Scanner(System.in);

        //Initial products in the inventory and its market price
        Zoho.add_product(new Product(1,"A",100,20));
        Zoho.add_product(new Product(2,"B",100,30));
        Zoho.add_product(new Product(3,"C",100,40));
        int ch=1;




        //Menu driven
        while(ch!=5){
            System.out.println("1.PurchaseOrder 2.SalesOrder 3.CurrentAvailability 4.InventoryValue 5.Exit");
            ch=sc.nextInt();
            if(ch==1){
                int op=1;
                System.out.println("Enter the OrderId:");
                int ord_id=sc.nextInt();
                Order ord=new Order(ord_id,"PO","Received");
                while(op==1){
                    System.out.println("Enter the items:");
                    op=sc.nextInt();
                    if(op==1){
                        System.out.println("Enter P_id");
                        int P_id=sc.nextInt();
                        System.out.println("Quantity");
                        int quant=sc.nextInt();
                        ord.add_product(new OEntry(P_id,quant,Zoho.get_price(P_id)));
                    }
                }
            }
            else if(ch==2){
                int op=1;
                System.out.println("Enter the OrderId:");
                int ord_id=sc.nextInt();
                Order ord=new Order(ord_id,"SO","Confirmed");
                while(op==1){
                System.out.println("Enter the items:");
                op=sc.nextInt();
                if(op==1){
                System.out.println("Enter P_id");
                int P_id=sc.nextInt();
                System.out.println("Quantity");
                int quant=sc.nextInt();
                ord.add_product(new OEntry(P_id,quant,Zoho.get_price(P_id)));}
            }
        }
        else if(ch==3){
            System.out.println("Enter P_id");
            int Pid=sc.nextInt();
            for(Product p:Zoho.pro){
                if(p.P_id==Pid){
                    System.out.println("Available:"+" "+p.quantity);
                }
            }
        }
        else if(ch==4){
            int val=0;
            for(Product p:Zoho.pro){
                val+=(p.quantity*p.price);
            }
            System.out.println("Inventory Value: "+val);
        }

        }
    }
}


