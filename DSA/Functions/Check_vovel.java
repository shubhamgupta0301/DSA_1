import java.util.*;
public class Check_vovel {
    static boolean Vovel_Check(char c){
        boolean isVovel = false; 
        if(c=='a'|| c=='A' || c=='e' || c=='E' || c=='i'|| c=='I' || c=='o'|| c=='O' || c=='u'|| c=='U'){
            isVovel = true;
        }
        return isVovel; // return the value of the variable
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c= sc.next().charAt(0); // To take char 
        System.out.println(Vovel_Check(c)? "Is Vovel": "Not a Vovel");
        sc.close();
    }
}
