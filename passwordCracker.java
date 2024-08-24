import java.util.*;
public class passwordCracker{
    static String password;
    public static void main(String[] args){
        password = "1cd23abc";
        starter();
        

    }
    static String [] keysCombination(){
        String keys [] = {"1","2","3","4","5","a","b","c","d"};
        return keys;
    }
    static void cracking(String A){
        Random rand = new Random();
        boolean stoper = true;
        while (stoper) {
            String cracked = "";
            for(int i = 0;i < password.length();i++){
               cracked += keysCombination()[rand.nextInt(keysCombination().length)]; 
            }
            println("Trying: " + cracked);
            if(password.equals(cracked)){
                println("");
                println("Password cracked:" + cracked);
                stoper = false;
            }
        }

    }
    static void println(String A){
        System.out.println(A);
    }
    static void print(String A){
        System.out.print(A);
    }
    static void starter(){
        print("Start cracking? (Yes,No): ");
        Scanner scan = new Scanner(System.in);
        String confirm = scan.nextLine();
        if(confirm.equalsIgnoreCase("Yes")){
            cracking(password);
        }
        else if(confirm.equalsIgnoreCase("No")){
            println("Ok then have a great day!!");
        }
        else{
            println("I guess you are not ready =/");
        }
        scan.close();
    }
}