import java.util.*;
public class Order {
    int ord_id;
    String ord_type;
    String status;
    ArrayList<OEntry> olist;
    Order(int ord_id,String ord_type,String status){
        this.ord_id=ord_id;
        this.ord_type=ord_type;
        this.status=status;
        this.olist=new ArrayList<OEntry>();
    }
    void add_product(OEntry oe){
        this.olist.add(oe);
    }
    void update_status(String val){
        this.status=val;
    }
}

