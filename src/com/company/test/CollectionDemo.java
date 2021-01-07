package com.company.test;

import java.util.*;

public class CollectionDemo {

    public  void runCollection (){
        System.out.println("初始化Collection");
        //使用 Java Util 类的 Arrays.asList(name) 方法将数组转换为集合
        this.arrayAlist();
        //将字符串转换为集合并使用 Collection 类的 Collection.min() 和 Collection.max() 来比较集合中的元素
        this.compare();
        // 使用 Collection 类的 iterator() 方法来遍历集合：
        this.traversal();
        //使用 Collections 类 的collection.add() 来添加数据并使用 collection.size()来计算集合的长度：
        this.conllectionLength();
        //集合打乱顺序
        this.shuffle();
        //反转集合元素
        this.reverse();
        //删除集合指定元素
        this.specifyTheDelete();
        //只读属性
        this.readOnly();
        //treeMap的各种基本操作
        this.treeMapOut();
        //集合转数组
        this.listToArray();
        //循环移动元素
        this.rotate();
        //查询最大最小值
        this.selectMaxMin();
        //遍历hash表数据
        this.traverse();
    }

    public void arrayAlist(){
        int n = 5;         // 5 个元素
        String[] name = new String[n];
        for(int i = 0; i < n; i++){
            name[i] = String.valueOf(i);
        }
        List<String> list = Arrays.asList(name);
        System.out.println();
        for(String li: list){
            String str = li;
            System.out.print(str + "\n");
        }
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }

    public void compare(){
        String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
        Set<String> set = new TreeSet<String>();
        for (int i = 0; i < coins.length; i++) {
            set.add(coins[i]);
        }
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
        System.out.println("");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }

    public void traversal (){
        HashMap< String, String> hMap =
                new HashMap< String, String>();
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");
        java.util.Collection cl = hMap.values();
        Iterator itr = cl.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }

    public void conllectionLength(){
        System.out.println( "集合实例!\n" );
        int size;
        HashSet collection = new HashSet ();
        String str1 = "Yellow", str2 = "White", str3 =
                "Green", str4 = "Blue";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.print("集合数据: ");
        iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        size = collection.size();
        if (collection.isEmpty()){
            System.out.println("集合是空的");
        }
        else{
            System.out.println( "集合长度: " + size);
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }

    public  void  shuffle(){
        List<Integer> lists = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            lists.add(new Integer(i));
        System.out.println("打乱前:");
        System.out.println(lists);

        for (int i = 1; i < 6; i++) {
            System.out.println("第" + i + "次打乱：");
            Collections.shuffle(lists);
            System.out.println(lists);
        }
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }

    public void reverse(){
        String[] coins = {"A","B","C","D","E"};
        List l = new ArrayList();
        for (int i = 0; i < coins.length;i++){
            l.add(coins[i]);
        }
        ListIterator liter = l.listIterator();
        while (liter.hasNext()){
            System.out.println(liter.next());
        }
        Collections.reverse(l);
        liter = l.listIterator();
        while (liter.hasNext()){
            System.out.println(liter.next());
        }
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }

    public void  specifyTheDelete(){
        int size;
        String str1 = "Y",str2 = "W",str3 = "G",str4 = "B";
        HashSet collection = new HashSet();
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        collection.remove(str4);
        Iterator iter = collection.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next() +  " ");
        }
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }

    public void readOnly(){
        List stuff = Arrays.asList(new String[] {"a","b"});
        List list = new ArrayList(stuff);
        list = Collections.unmodifiableList(list);
        try{
            list.set(0,"c");
            System.out.println(list);
        }catch (Exception e){
        }
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }

    public  void  treeMapOut (){
        TreeMap treeMap = new TreeMap();
        treeMap.put(1,"one");
        treeMap.put(2,"two");
        treeMap.put(3,"three");
        System.out.println("tMapKey:" + treeMap.keySet());
        System.out.println("tMapValue:" + treeMap.values());
        System.out.println("tMapKeys:" + treeMap.firstKey() + treeMap.get(3) + treeMap.lastKey());
        System.out.println("tMapKeyRemove:" + treeMap.remove(treeMap.firstKey()));
        System.out.println("tMapKey:" + treeMap.keySet());
        System.out.println("tMapKeyError:" + treeMap.get(5));
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }

    public  void  listToArray (){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("java");
        String [] str = list.toArray(new String[0]);
        for (int i = 0; i < str.length; i ++){
            System.out.println(str[i]);
        }
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }
    public  void rotate (){
        List list = Arrays.asList("one Two three Four five six".split(" "));
        System.out.println("List :"+list);
        Collections.rotate(list, 3);
        System.out.println("rotate: " + list);
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }

    public  void  selectMaxMin(){
        List list = Arrays.asList("2 one 3 54 123".split(" "));
        System.out.println("list:" + list);
        System.out.println("max:" + Collections.max(list));
        System.out.println("min:" + Collections.min(list));
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }
    public  void  traverse(){
        Hashtable htb = new Hashtable();
        htb.put(1,"one");
        htb.put(2,"two");
        htb.put(3,"three");
        Enumeration e = htb.keys();
        Collection c = htb.values();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        Iterator liter = c.iterator();
        while (liter.hasNext()){
            System.out.println(liter.next());
        }
        for (int i = 0; i <= 10; i++) {
            if (i==10){System.out.print("-\n");}else{System.out.print("-");};
        }
    }
}