
import java.util.Scanner;
import java.util.Random;
class truthordare{
    public static void main(String[]args){
        System.out.println("Game: Truth or Dare");
        Scanner sc=new Scanner(System.in);
        // System.out.print("Category(kids/adults):");
        // String Category=sc.nextLine();
        System.out.print("Number of players:");
        int numberOfPlayers=sc.nextInt();
        sc.nextLine();
        String[] playerNames=new String[numberOfPlayers];
        for(int i=0;i<numberOfPlayers;i++){
            System.out.print("Name of player "+(i+1)+" : ");
            playerNames[i]=sc.nextLine(); 
        }
        while(true){

            Random r = new Random();
            int index = r.nextInt(arr.length);
            System.out.println(playerNames[index]+"'s Trun");
            System.out.println("Choose Truth or Dare : ");
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("truth")){
                
            }
            else if(choice.equalsIgnoreCase("dare"){

            }
            else{
                System.out.println("you can only choose between truth or dare");
            }
            

        }
        // if(Category.equalsIgnoreCase(kids)){
            
        // }
        
    }
}