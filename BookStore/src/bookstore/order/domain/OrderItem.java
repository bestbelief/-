package bookstore.order.domain;

public class OrderItem {
    private String iid;
    private String count;
    private String subtotal;
    private String oid;
    private String bid;

    public OrderItem() {

    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "iid='" + iid + '\'' +
                ", count='" + count + '\'' +
                ", subtotal='" + subtotal + '\'' +
                ", oid='" + oid + '\'' +
                ", bid='" + bid + '\'' +
                '}';

    }
}
