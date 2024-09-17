import java.util.*;

public class java_stl{

    
    
    public static void main(String[] args)
    {
         Scanner sc =  new Scanner(System.in);
         int t  = sc.nextInt();

// ****************** LLLLLLLLLIIIIIIISSSSSSSSSSTTTTTTTTTTTT*************************
        
       // ***************************** ArrayList ************************
         ArrayList <Integer> array = new ArrayList<>(); 
         for(int i=0;i<t;++i)
         {
           int x = sc.nextInt();
           array.add(x);
         }
         array.set(3,9990);
        array.get(3);
        array.remove(3); ith index remove
         Collections.sort(array);
         Collections.reverse(array);
         System.out.print(array);

        //************   Linked list **************
        
        List<Integer> ls = new LinkedList<>();
        for(int i=0;i<t;i++)
        {
            ls.add(sc.nextInt());
        }
        ls.set(2,45);
        ls.get(3);
        System.out.println(ls);
        ls.remove(3);
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);
        Collections.reverse(ls);
        System.out.println(ls);
        
        // ********** Stack ***********//
        
        // 1st approach 

        List<Integer> st = new Stack<>();
        for(int i=0;i<t;i++)
        {
           st.add(sc.nextInt());
        }
        // int x = st.get(3);
        // System.out.println(x);
        while(st.size()>0)
        {   int n = st.size();
            int ele = st.get(n-1);
            st.remove(n-1);
            System.out.println(ele+" ");
        }

    // 2nd approach 
       Stack<Integer> st = new Stack<>();
        for(int i=0;i<t;i++)
        {
           st.push(sc.nextInt());
        }
        int x = st.get(3);
        System.out.println(x);
        System.out.println(st.peek());
        while(st.size()>0)
        {   
            int ele = st.pop();
            System.out.println(ele+" ");
        }
        System.out.println(st.isEmpty());

    //   ********************* string **********************
        boolean t[] = new boolean[5];
        String s=new String("abc");
        String td=new String("abc");
        String s = "abc"; String b = "abc";
        System.out.println(s==b);  compare by refernce 
        System.out.println(s.equals(td));  compare by value
        boolean a = false ; boolean b = false;
        System.out.println(a==b);
        
    // *****************QQQQQQQUUUUEEEUUUUEEEEEEEEEE ********************** //

        // *********** Normal queue ********//
        Queue<Integer> qs = new LinkedList<>();
        for(int i=0;i<t;i++) qs.offer(sc.nextInt());
        // System.out.println(qs.peek());
        while(!qs.isEmpty())
        {
            System.out.println(qs.poll());
        }

        // ********* ArrayDequeue ***************** // 

        ArrayDeque<Integer> qs = new ArrayDeque<>();
        for(int i=0;i<t;i++) qs.push(sc.nextInt());
        System.out.println(qs);
        System.out.println(qs.poll());
        System.out.println(qs.poll());
        while(qs.size()>=2)
        {
            int x = qs.removeFirst();
            int y = qs.removeLast();
            System.out.println(x+" "+y);
        }

        // **************** Priority Queue ***************** //
         
        Queue <Integer> qs = new PriorityQueue<>();
        for(int i=0;i<t;i++) qs.add(sc.nextInt());
        System.out.println(qs);
        while(qs.size()>0)
        {
            System.out.println(qs.pop());
        }
        qs.addAll(array);
        while(qs.size()>0)
        {
            System.out.println(qs.poll());
        }

// ************************* SSSSSSSSSEEEEEEEETTTTTTTTT *****************
      
    //    ******************** SET ******************

    HashSet <Integer> hs = new HashSet<>();
    for(int i=0;i<t;i++)
    {
       hs.add(sc.nextInt());
    }
    System.out.println(hs.contains(4));
    for(int x:hs) System.out.print(x+" ");
    hs.remove(4);

    // ***************  ORDERED_SET *******************//

    Set <Integer> hs = new TreeSet<>();
    for(int i=0;i<t;i++)
    {
       hs.add(sc.nextInt());
    }
    System.out.println(hs.contains(4));
    for(int x:hs) System.out.print(x+" ");
    hs.remove(4);
    
// *************************************  MMMMMMAAAAAAAPPPPPPPPP*******************//
    
    // *********** MAP ****** //
    HashMap <Integer,Integer> map = new HashMap<>();
    for(int i=0;i<t;i++){
        int x = sc.nextInt();
        int y = sc.nextInt();
        map.put(x,y);
    }
    for(int val: map.keySet())
    {
        System.out.println("key :"+val +" "+ "values:"+map.get(val));
    }
    System.out.println(map.containsKey(3));
    if(map.containsKey(3))
    {
        map.remove(3);
    }

    // ********************* ORDERED_MAP ******************//

    Map <Integer,Integer> map = new TreeMap<>();
    for(int i=0;i<t;i++){
        int x = sc.nextInt();
        int y = sc.nextInt();
        map.put(x,y);
    }
    for(int val: map.keySet())
    {
        System.out.println("key :"+val +" "+ "values:"+map.get(val));
    }
    System.out.println(map.containsKey(3));
    
    }
}
