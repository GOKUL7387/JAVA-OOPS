import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> mat =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while(t!=0)
        {
            int n =sc.nextInt();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                temp.add(sc.nextInt());
            }
            mat.add(new ArrayList<> (temp));
            t--;
        }
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                if((x-1)<mat.size() && (y-1)<mat.get(x-1).size())
                {
                    List<Integer> temp = new ArrayList<>(mat.get(x-1));
                    System.out.println(temp.get(y-1));
                }
                else
                {
                    System.out.println("ERROR!");
                }
            }
    
    }

    
}
