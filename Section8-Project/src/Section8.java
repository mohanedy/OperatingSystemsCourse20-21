import java.util.ArrayList;

public class Section8 {
    public static void main(String[] args) {
        ArrayList<Medicine> myList = new ArrayList<>();
        Medicine myMedicine = new Medicine("Panadol",20);
        myList.add(myMedicine);
        Medicine myMedicine2 = new Medicine("Congestal",15);
        myList.add(myMedicine2);
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i).getName()+" - "+myList.get(i).getPrice());
        }

    }
}

class Medicine{
    private   String name;
    private double price;

    public Medicine(String name, double price){
        setName(name);
        setPrice(price);

    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        if(!newName.isEmpty()){
            name = newName;
        }else {
            System.out.println("Wrong name");
        }
    }

    public double getPrice(){
        return  price;
    }

    public void  setPrice(double price){
        if(price >0){
            this.price = price;
        }else {
            System.out.println("Wrong price");
        }
    }

}