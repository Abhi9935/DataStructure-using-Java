class TestLinkedList{
  public static void main(String[] args){
      System.out.println("------------------------");
      System.out.println("add method:");
      LinkedList l1 = new LinkedList();
		  l1.add(140);
		  l1.add(1270);
		  l1.add(5);
		  l1.add(350);
		  l1.add(405);
		  l1.printAllNodes(); 
		  System.out.println("removeEl Element  : call l1.removeEl(35) ");
		  l1.removeEl(350);		
		  l1.printAllNodes();
		  System.out.println("removeEl Element  : call l1.removeEl(14) ");
		  l1.removeEl(140);		
		  l1.printAllNodes();
		  System.out.println("removeEl Element  : call l1.removeEl(127) ");
      l1.removeEl(1270);		
		  l1.printAllNodes();
		  System.out.println("------------------------"); 
		
		  System.out.println("add method:");
      LinkedList l4 = new LinkedList();
		  l4.add("abcd");
		  l4.add("xyz");
		  l4.add("klm");
		  l4.add("abc");
		  l4.printAllNodes(); 
		  System.out.println("removeEl Element  : call removeEl(klm) ");
		  l4.removeEl("klm");		
		  l4.printAllNodes();
		  System.out.println("removeEl Element : call removeEl(\"abcd\")");
		  l4.removeEl("abcd");		
		  l4.printAllNodes();
		  System.out.println("------------------------");
		
		  System.out.println("add First:");
        LinkedList l2 = new LinkedList();
        l2.addFirst("Hello");
        l2.addFirst("Baba");
        l2.addFirst("albus");
		l2.printAllNodes(); 
		System.out.println("removeEl Element  : call l2.removeEl(\"Baba\") ");
		l2.removeEl("Baba");
		System.out.println("removeEl Element  : call l2.removeEl(\"abc\") ");
		l2.removeEl("abc");
        l2.printAllNodes();
        System.out.println("------------------------");

        System.out.println("add Last:");
        LinkedList l3 = new LinkedList();
        l3.addLast("Hello");
        l3.addLast("baba");
        l3.addLast("albus");
        l3.printAllNodes();			 
		System.out.println("removeEl Element  : call l3.removeEl(\"abc\") ");
		l3.removeEl("abc");
		l3.printAllNodes();	
		System.out.println("------------------------");
	
    }
}
