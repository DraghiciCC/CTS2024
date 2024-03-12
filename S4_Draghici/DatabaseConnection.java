import javax.xml.crypto.Data;

class DatabaseConnection {
 private static volatile DatabaseConnection instance;

 private DatabaseConnection(){

 }

 public static DatabaseConnection getInstance(){
     if (instance==null){
         synchronized (DatabaseConnection.class){
             if(instance==null){
                 instance=new DatabaseConnection();
             }
         }
     }
     return instance;
 }

 public void connect(){
     System.out.println("Connect to db");
 }

 public void disconnect(){
     System.out.println("Discconected from db");
 }

 public static  void main(String[] args){
     DatabaseConnection db1= DatabaseConnection.getInstance();
     DatabaseConnection db2= DatabaseConnection.getInstance();
     System.out.println(db1==db2);
 }
}
