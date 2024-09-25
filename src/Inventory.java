import java.util.*;
public class Inventory {
    int main;
    ArrayList<Product> pro;
    ArrayList<Order> orders;
    Inventory(){
        this.pro=new ArrayList<Product>();
        this.orders=new ArrayList<Order>();
    }
    void add_product(Product p){
        this.pro.add(p);
    }
    void add_order(Order o){
        this.orders.add(o);
    }

    int  get_price(int Pid){
        for(Product p:pro){
            if(p.P_id==Pid){
                return p.price;
            }
        }
        return -1;
    }
}
