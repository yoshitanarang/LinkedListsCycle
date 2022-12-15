/**
 * An epic Java Program which takes as an input a linked list & 
 * determines if the linked list contains a cycle. Rather than 
 * implementing the standard Floyd's cycle-finding algorithm, 
 * we use a HashSet to practice skills acquired in Professor 
 * Ricks' CS 2336! 
 **/

/* Import Hashset */
import java.util.HashSet;

/* Main Method */
public class Main {
    public static void main(String[] args){
        
    }
    
    /* Our method, hasCycle, takes as input a Linked List, 
    & carefully DETECTS if the Linked List contains a cycle
    using a HashSet with a boolean */
    public static <T> boolean hasCycle(ListNode<T> head){
        /* Create a HashSet for all nodes */
        ListNode<T> set = head;
        HashSet<ListNode<T>> hs = new HashSet<ListNode<T>>();

        /* Using a while loop, iterate through the Linked List */
        while( set != null){
            /* Check if HashSet CONTAINS our node already & if it does, 
            then return our boolean type as TRUE */
            if(hs.contains(set)) { 
                return true;
            }
            /* Else, if our HashSet does NOT contain the node in 
            our set, then execute following code */
            else{
                /* Add Visited Elements to our HashSet */
                hs.add(set);
                set = set.next;
            }
        }
        return false;
    }
}