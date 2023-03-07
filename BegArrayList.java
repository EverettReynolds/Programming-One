// Everett Reynolds
// 11-14-2019


import java.util.ArrayList;
public class BegArrayList
{
        public static void main(String[] args)
        {
                ArrayList<Integer> a = new ArrayList<Integer> ();


                for (int k = 0;  k < 10;  k++)
                        a.add (new Integer (k * k));


                a.set( 2 + 4 / 3 , -1);
// A - [0,1,4,-1,16]
// B - five more values are added into the Array List
// C - You get an out of bounds error because you can only add onto an array list the position after the one that exists
                System.out.println(a);
                


        }
}
