import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n>0)
        {
            int a=scan.nextInt();
            Set<Integer> set1=new HashSet<>();
            for(int i=0;i<a;i++)
            {
                set1.add(scan.nextInt());
            }
            int pos=0;
            int neg=0;
            for(int x:set1)
            {
                if(x>0)
                {
                    pos=pos+x;
                }
                else
                {
                    neg=neg+x;
                }
            }
            System.out.println(pos+" "+neg);
            n--;
        }
    }
}
