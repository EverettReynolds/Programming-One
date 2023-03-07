// Everett Reynolds
// 11-14-2019



import java.util.ArrayList;


public class CrazyArrayList
{
        public static void main(String[] args)
        {


                ArrayList<Integer> a = new ArrayList<Integer> ();
                
                a.add(0, new Integer (3)); // 3
               
                a.add(0, new Integer (72)); // 72 3
               
                a.add(1, new Integer (0)); // 72 0 3
               
                a.add(1, new Integer (41)); // 72 41 0 3
                
                a.add(2, new Integer (-23)); // 72 41 -23 0 3
               
                a.add(0, new Integer (64)); // 64 72 41 -23 0 3
                
                System.out.println (a); // 64 72 41 -23 0 3


                a.set (4, a.get(2) + a.get( a.get(a.size() - 1) ));  // 64 72 41 -23 18 3
                System.out.println (a);
   }
}
