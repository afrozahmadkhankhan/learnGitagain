import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(scan.nextInt());
        }
        int q=scan.nextInt();
        for(int i=0;i<q;i++)
        {
            String query=scan.next();
            if(query.equals("Insert"))
            {
               int x=scan.nextInt();
               int y = scan.nextInt();
               list.add(x,y); 
            }
            else{
                int x=scan.nextInt();
                list.remove(x);
            }
        }
        Iterator itr =list.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}
