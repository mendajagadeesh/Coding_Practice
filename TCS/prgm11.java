import java.util.ArrayList;

class Trains{
    int trainId;
    String trainName;
    int capacity;

    Trains(int trainId,String trainName,int capacity){
        this.trainId=trainId;
        this.trainName=trainName;
        this.capacity=capacity;
    }
     
   static void add(ArrayList<Trains> T,int trainId,String trainName,int capacity){
            T.add(new Trains(trainId, trainName, capacity));

    }
    void display(){
        System.out.println("______________________________________________________");
        System.out.println("Train id: "+trainId+"\n"+"Train name: "+trainName+"\n"+"Train capacity :"+capacity);
        System.out.println("______________________________________________________");
    }

    void update(String trainName,int capacity){
               this.trainName=trainName;
               this.capacity=capacity;
    }
}



public class prgm11 {
    public static void main(String args[]){
        ArrayList<Trains> trains=new ArrayList<>();
        Trains.add(trains,101,"AP_Express",1000);
        Trains.add(trains,102,"AP_Express",1000);
        Trains.add(trains,103,"Visakha_Express",1000);
        Trains.add(trains,104,"Godavari_Express",1000);
        for(Trains t:trains){
        t.display();
        }
       
         for(Trains t:trains){
            if(t.trainId==101){
              t.update("vandebharath", 5000);
         }
        }
        
        System.out.println("After Updation");
         for(Trains t:trains){
        t.display();
        }
    }
}
