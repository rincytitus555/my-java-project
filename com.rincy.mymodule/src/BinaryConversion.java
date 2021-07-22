public class BinaryConversion {
    public int getDecimalValue(ListNode head) {

        int length = 0;
        int result = 0;

        ListNode temp = head;
        while(temp != null)
        {
            length++;
            temp = temp.next;
        }
        length--;

        temp = head;
        while(temp != null)
        {
            result = result + (((int)Math.pow(2,length)) * temp.val);
            length--;
            temp = temp.next;
        }
            return result;
        }

}
