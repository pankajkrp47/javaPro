class LinkDuble{
	 private int data;
	 public LinkDuble next;
	 public LinkDuble prev;
	 
	 public LinkDuble(int data)
	 {
		 prev=null;
		 this.data=data;
		 next=null;
	 }
   public LinkDuble(LinkDuble prev, int data,LinkDuble next)
   {
	   this.prev=prev;
	   this.data=data;
	   this.next=next;
   }
   public int Data()
   {
	   return data;
   }
}
class DoubleLinkList{
	 
	    private LinkDuble head;
		private int size;
		 public DoubleLinkList()
		 {
			 head=null;
			 size=0;
		 }
		public void addFornt(int data)
		{
			if(head==null)
			{
				head=new LinkDuble(null, data, null);
			}
			else
			{
				LinkDuble newData=new LinkDuble(null,data,head);
				          newData.prev=head;
						  head=newData;
			}
			size++;
		}
		public void removeFont()
		{
			if(head==null) return;
			head=head.next;
			head.prev=null;
			size--;
		}
		public void removeRear()
		{  
			if(head==null)return ;
			  if(head.next==null)
			  {
				  head=null;
			  size--;
			  return;
			  }
			  LinkDuble current=head;
			  while(current.next.next!=null)
			  {
				  current=current.next;
			  }
			       current.next=null;
				   size--;
			   
		}
		public void addrear(int data)
		{
			if(head==null)
				head=new LinkDuble(null,data,null);
			else
			{
				 LinkDuble currents=head;
				 while(currents.next!=null)
				 {
					 currents=currents.next;
				 }
				 LinkDuble newLink=new LinkDuble(currents,data,null);
				            currents.next=newLink;	
			}
		}
		public void insrtAt(int data,int index)
		{
			if(head==null)return;
			if(index<1||index>size)return;
			 LinkDuble current=head;
			      int i=1;
				  while(i<index)
				  {
					  current=current.next;
					  i++;
				  }
				  if(current.prev==null)
				  {
					  LinkDuble newLink=new LinkDuble(null,data,current);
					            current.prev=newLink;
								head=newLink;
								///////////// some problam
				  }
				  else
				  {
					  LinkDuble newLink=new LinkDuble(current.prev,data,current);
					            current.prev.next=newLink;
								current.prev=newLink;
				  }
			  size++;
		}
		public int size()
		{
			return size;
		}
		public void print()
		{    
			
			LinkDuble current=head;
			while(current!=null)
			{
				System.out.println(current.Data());
				current=current.next;
			}
			
		}
		public boolean isEmpty()
		{   return head==null;
		}
		public static void main(String args[])
		{
			DoubleLinkList ob=new DoubleLinkList();
			               ob.addFornt(10);
						   ob.addFornt(11);
						   ob.addFornt(12);
						   ob.addFornt(14);
						    ob.addFornt(11);
						   ob.addFornt(12);
						   ob.addFornt(14);
						   ob.print();
						   System.out.println("---------------");
						   ob.addrear(90);
						   ob.print();
						   System.out.println(ob.isEmpty());
						 
						   //ob.removeFont();
						  // ob.removeRear();
						  ob.insrtAt(34,1);
						   ob.print();
						  
		}
}