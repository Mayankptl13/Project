import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char p1,p2;
        p1=sc.next().charAt(0);
        p2=sc.next().charAt(0);
        if(p1=='R' && p2=='P') System.out.println("p2 wins");
        else if(p1=='P' && p2=='R') System.out.println("p1 winS");
        else if(p1=='P' && p2=='S') System.out.println("p2 wins");
        else if(p1=='S' && p2=='P') System.out.println("p1 wins");
        else if(p1=='S' && p2=='R') System.out.println("p2 wins");
        else if(p1=='R' && p2=='S') System.out.println("p1 wins");
        else if(p1==p2) System.out.println("Tie");
        else System.out.println("Invalid Input");
    }
}
