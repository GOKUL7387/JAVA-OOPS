import java.util.*;
public class program{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++)
        {
            String s = sc.next();
            if(s.equals("Insert"))
            {
                int index = sc.nextInt();
                int num = sc.nextInt();
                list.add(index,num);
            }
            else if(s.equals("Delete"))
            {
                int num = sc.nextInt();
                list.remove(num);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
