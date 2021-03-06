import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructBinaryTreeFromTraversals {
    static class TreeCell<T> {

        public T datum;
        public TreeCell<T> left, right;

        public TreeCell(T datum) {
            this.datum = datum;
            this.left = null;
            this.right = null;
        }

    }

    static ArrayList<Integer> answer = new ArrayList<>();

    private static ArrayList<Integer> getPostOrder(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder) {

        findSubList(inOrder, preOrder);

        return answer;
    }

    static void findSubList(List<Integer> inOrder, List<Integer> preOrder) {
        int root = inOrder.indexOf(preOrder.get(0));
        List<Integer> left;
        List<Integer> right;


        if(root != 0) {
            left=inOrder.subList(0, root);
            findSubList(left, preOrder.subList(1, root+1));
        }

        if(root != inOrder.size()-1) {
            right=inOrder.subList(root+1, inOrder.size());
            findSubList(right, preOrder.subList(root+1, preOrder.size()));
        }

        answer.add(preOrder.get(0));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> preOrder, inOrder, postOrder;

        preOrder = new ArrayList<>();
        for (String s : br.readLine().trim().split(" ")) {
            preOrder.add(Integer.parseInt(s));
        }

        inOrder = new ArrayList<>();
        for (String s : br.readLine().trim().split(" ")) {
            inOrder.add(Integer.parseInt(s));
        }

        postOrder = getPostOrder(preOrder, inOrder);

        System.out.println(postOrder.stream().map(v -> Integer.toString(v)).collect(Collectors.joining(" ")));

        br.close();

    }
}