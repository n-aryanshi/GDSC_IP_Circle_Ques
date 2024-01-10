//que from gfg
public static Node reverseDLL(Node  head)
{
    //Your code here
    
    Node curr=head;
    Node prv=null;
    Node nxt;
    
    while(curr!=null){
        nxt=curr.next;
        curr.next=prv;
        curr.prev=nxt;
        prv=curr;
        curr=nxt;
        
    }
    
    return prv;
}
