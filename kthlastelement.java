 public void klastElement(int k)
    {
      Link firstpointer=first;
      Link secondpointer=first;
      for(int i=0;i<k;i++)
      {
        if(firstpointer==null)
            return;
        firstpointer=firstpointer.next;                        //First pointer is k nodes ahead from the head
      }
    
      
             while(firstpointer!=null)
             {
                 firstpointer=firstpointer.next;
                 secondpointer=secondpointer.next;
             }
      System.out.println(k+" last element is "+secondpointer.value);
    }
