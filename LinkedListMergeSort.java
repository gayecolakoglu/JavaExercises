import java.io.*;
import java.util.stream.*;

class LinkedListMergeSort {

    static class ListCell<T> {

        public T datum; // Data for this cell
        public ListCell<T> next; // Next cell

        public ListCell(T datum, ListCell<T> next) {
            this.datum = datum;
            this.next = next;
        }
    }

    static class LinkedList<T> {

        private static final String STRING = " ";

        LinkedListMergeSort.ListCell<T> head; // head (first cell) of the List

        public LinkedList() {
            head = null;
        }

        public void insert(T element) {
            head = new ListCell<T>(element, head);
        }

        public void delete(T element) {
            delete(element, head);
        }

        private ListCell<T> delete(T element, ListCell<T> cell) {
            if (cell == null)
                return null;
            if (cell.datum.equals(element))
                return cell.next;
            cell.next = delete(element, cell.next);
            return cell;
        }

        public int size() {
            return size(head);
        }

        private int size(ListCell<T> cell) {
            if (cell == null)
                return 0;
            return size(cell.next) + 1;
        }

        public String toString() {
            return toString(head);
        }

        private String toString(ListCell<T> cell) {
            if (cell == null)
                return "";
            return cell.datum.toString() + STRING + toString(cell.next);
        }
    }

    // Complete the mergeSort function below.
    // !!! Leave the code as is except for the below function, !!!
    // !!! though writing helper function(s) are allowed. !!!
    private static void sort(LinkedListMergeSort.LinkedList<Integer> llist) {

        LinkedListMergeSort.ListCell<Integer> answ = mergeSort(llist.head);
        llist.head=answ;

    }

    public static LinkedListMergeSort.ListCell<Integer> mergeAll(ListCell<Integer> left, ListCell<Integer> right){
        LinkedListMergeSort.ListCell<Integer> newHead = null;
        if(left.datum <= right.datum)
        {
            newHead = new LinkedListMergeSort.ListCell<Integer>(left.datum, null);
            left = left.next;
        }
        else
        {
            newHead = new LinkedListMergeSort.ListCell<Integer>(right.datum, null);
            right = right.next;
        }

        LinkedListMergeSort.ListCell<Integer> current;
        for(current  = newHead; left != null && right != null; current = current.next){
            if(left.datum <= right.datum) {
                current.next = left;
                left = left.next;
            }
            else{
                current.next = right;
                right = right.next;
            }
        }
        current.next = (left == null) ? right : left;
        return newHead;
    }
    public static LinkedListMergeSort.ListCell<Integer> mergeSort(ListCell<Integer> head) {
        if(head == null || head.next == null)
            return head;

        LinkedListMergeSort.ListCell<Integer> middle = getMiddle(head);      //get the middle of the list
        LinkedListMergeSort.ListCell<Integer> left_head = head;
        LinkedListMergeSort.ListCell<Integer> right_head = middle.next;
        middle.next = null;             //split the list into two halfs

        //recurse on that

        LinkedListMergeSort.ListCell<Integer> left= mergeSort(left_head);
        LinkedListMergeSort.ListCell<Integer> right= mergeSort(right_head) ;
        LinkedListMergeSort.ListCell<Integer> answer= mergeAll(left,right) ;
        return answer;
    }



    public static LinkedListMergeSort.ListCell<Integer> getMiddle(LinkedListMergeSort.ListCell<Integer> head){
        if(head == null)
            return null;

        LinkedListMergeSort.ListCell<Integer> slow = head;
        LinkedListMergeSort.ListCell<Integer>fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int llistCount = Integer.parseInt(br.readLine().trim());

        LinkedList<Integer> llist = new LinkedList<>();

        IntStream.range(0, llistCount).forEach(i -> {
            try {
                Integer llistItem = Integer.parseInt(br.readLine().trim());

                llist.insert(llistItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        sort(llist);

        bufferedWriter.write(llist.toString().trim());

        bufferedWriter.close();

        br.close();
    }

}

