import java.util.Scanner;
class FoodItem {
    int itemId;
    String itemName;
    float price;
    int quantity;
    public FoodItem(int itemId,String itemName,float price,int quantity){
         this.itemId=itemId;
         this.itemName=itemName;
         this.price=price;
         this.quantity=quantity;
    }

    public void display() {
        System.out.printf("ID: %d | Name: %s | Price: %.2f | Quantity: %d%n",
                          itemId, itemName, price, quantity);
    }
}

class prgm5{
static final int  max=100;
static int count=0;
static FoodItem[] items=new FoodItem[max];
static Scanner sc=new Scanner(System.in);
static int itemid;
static String name;
static int price;
static int quantity;
    public static void main(String args[]){
        
        while(true){
            System.out.println("enter your choice");
            System.out.println("1->additem\n2->search for food item\n3->update quantity of food item\n4->Display all food items");
            int choice=sc.nextInt();
            switch(choice){
                case 1->additem(itemid,name,price,quantity);
                case 2->search(101);
                case 3->updateQuantity();
                case 4-> display();
                default-> System.out.println("enter vakid option");
            }

        
        }   

}
static void additem(int itemid,String name,int price,int quantity){
    System.out.print("enter the id of the fooditem : ");
    itemid=sc.nextInt();
    System.out.print("enter the name of the fooditem : ");
    name=sc.next();
    System.out.print("enter the price of the fooditem : ");
    price=sc.nextInt();
    System.out.print("enter the quantity of the fooditem : ");
    quantity=sc.nextInt();
    items[count++]=new FoodItem(itemid,name,price,quantity);
}
static void display(){
    for(int i=0;i<count;i++){
      items[i].display();
    }
}
static void search(int id){
    boolean found=false;
for(int i=0;i<count;i++){
    if(items[i].itemId==id){
        System.out.println("element found");
        items[i].display();
        found=true;
        break;
    }
    
}
if(!found)
System.out.println("element is not found");
}
static void updateQuantity() {
        System.out.print("Enter Item ID to update quantity: ");
        int id = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (items[i].itemId == id) {
                System.out.print("Enter new quantity: ");
                int newQty = sc.nextInt();
                items[i].quantity = newQty;
                System.out.println("Quantity updated.");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("item is not updated becuse list is full");
        }

    }

}
