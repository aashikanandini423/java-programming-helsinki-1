
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList<>();
        
        
        while(true){
            System.out.println("Identifier?(empty will stop)");
            String id = scanner.nextLine();
            if(id.isEmpty()){
                break;
            }
            
            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            Item input = new Item(id,name);
            if(archive.contains(input)){
                System.out.println("The item already exist");
            }else{
                archive.add(input);
            }
        }
        
        System.out.println("==Items==");
        for(int i = 0; i < archive.size(); i++){
            System.out.println(archive.get(i));
        } 
        


    }
}
