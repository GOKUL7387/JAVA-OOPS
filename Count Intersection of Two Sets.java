import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n!=0)
        {
            int a=scan.nextInt();
            int b=scan.nextInt();
            Set<Integer> set1=new HashSet<>();
            Set<Integer> set2=new HashSet<>();
            for(int i=0;i<a;i++)
            {
                set1.add(scan.nextInt());
            }
            for(int i=0;i<b;i++)
            {
                set2.add(scan.nextInt());
            }
            set1.retainAll(set2);
            System.out.println(set1.size());
            n--;
        }
    }
}
