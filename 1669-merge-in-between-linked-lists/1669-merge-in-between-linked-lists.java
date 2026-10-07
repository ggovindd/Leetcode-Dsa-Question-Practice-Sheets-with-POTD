/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp= list1;
        int i=0;
        while(i<a-1) {
            temp=temp.next;
            i++;
        }
        ListNode StoreL1=temp;

         while(i<=b) {
            temp=temp.next;
            i++;
        }   
         ListNode StoreL2=temp;
             StoreL1.next = list2;
        while(list2.next!=null){
            list2=list2.next;
        } list2.next = StoreL2;
        return list1;
    }
}