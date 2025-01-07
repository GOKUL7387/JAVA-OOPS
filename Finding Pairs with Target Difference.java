import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            List<Integer> list = new ArrayList<>();
            int size = sc.nextInt();
            int target = sc.nextInt();
            for(int j=0;j<size;j++)
            {
                list.add(sc.nextInt());
            }
            int count = 0;
            Set<Integer> set = new HashSet<>();
            for(int u: list)
            {
                if(set.contains(u-target) || set.contains(u+target))
                {
                    System.out.println("true");
                    count++;
                    break;
                }
                set.add(u);
            }
            if(count == 0)
            {
                System.out.println(false);
            }
        }
        sc.close();
    }
}
