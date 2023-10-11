import java.util.LinkedList;

public class t129_SumRootToLeafNumbers {
    LinkedList<Integer> num = new LinkedList<>();
    int sum = 0;
    int i = 1;
    int buf = 0;

    public int sumNumbers(TreeNode root) {
        if(root == null)
            return sum;
        num.addLast(root.val);
        if (root.left == null && root.right == null) {
            i = num.size() - 1;
            buf = 0;
            for(int digit : num){
                buf += digit * Math.pow(10, i--);
            }
            sum += buf;
            num.removeLast();
            return sum;
        }
        sum = sumNumbers(root.left);
        sum = sumNumbers(root.right);
        num.removeLast();
        return sum;
    }
}
