import java.io.*;
import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
       Scanner sc= new Scanner(System.in);
        /////s=start fahrent heat value
    ///e=end fah value
        /// w=stepsize
        int s,e,w;
        s=sc.nextInt();
          e=sc.nextInt();
          w=sc.nextInt();
        if(s>=0 && s<=80 && e>=s && e<=900 && w>=0 && w<=40 )
        {
            while(s<=e)
            {
                int f=(s-32)*5/9;
                System.out.println(s +"\t"+ f);
                s=s+w;
            }
        }
            
        
        
		
	}

}
