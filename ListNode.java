/**
 * A node for a linked list.
 */
public class ListNode<T> {
    
    private T item;  // the item which this node will hold
    
    public ListNode<T> next;  // reference to the next node in the list
    
    public ListNode() {
        // default constructor
    }
    
    public ListNode(T item) {
        this.item = item;
    }
    
    /**
     * Set the item which this node holds.
     */
    public void setItem(T item) {
        this.item = item;
    }
    
    /**
     * Get the item which this node holds.
     */
    public T getItem() {
        return this.item;
    }
}