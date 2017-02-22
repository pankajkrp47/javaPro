  class Link{
	     private int data;
		 public Link next;
		public Link(int data) 
		{
			this.data=data;
		}
		public int Data()
		{
			return data;
		}
  }
class Linkedlist{
            private Link head;
			public Linkedlist()
			 {
				 head=null;
			 }
			 public boolean isEmpty()
			 {
				 return head==null;
			 }
			 public void insert(int data)
			 {
				 Link newLink=new Link(data);
				 newLink.next=head;
				 head=newLink;
			 }
			 public boolean delete()
			 {
				 if(head==null)
					 return false;
					   head=head.next;
					   return true;
			 }
			 public void print()
			 {
				 Link current=head;
				 while(current!=null)
				 {
					 System.out.println(current.Data());
					 current=current.next;
				      
				 }
				 
			 }
			 public static void main(String args[])
			 {
				 Linkedlist ob=new Linkedlist();
				            ob.insert(10);
							ob.insert(20);
						    ob.print();
							ob.delete();
							ob.print();
			 }
			 
}