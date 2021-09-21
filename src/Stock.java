import java.util.ArrayList;

public class Stock {

    private String name;
    private String address;
    private ArrayList<Product> list;

    public Stock(String n, String ad) {
        this.name = n;
        this.address = ad;
        this.list = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public ArrayList<Product> getList(){
        return this.list;
    }

    public void addProduct(Product p) {
        if(!this.list.contains(p)) {
            list.add(p);
        }

    }

    public Product nameToProduct(String name){
        for(int i =0; i < list.size(); i++){
            if(name.equalsIgnoreCase(list.get(i).getName()) ){
                return list.get(i);
            }
        }
        return null;
    }

}