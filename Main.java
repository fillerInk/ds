public class Main{
    
    public static void main(String[] args){
        Tree myTree = new Tree();

        myTree.insert(25);
        myTree.insert(20);
        myTree.insert(15);
        myTree.insert(27);
        myTree.insert(30);
        myTree.insert(29);
        myTree.insert(26);
        myTree.insert(22);
        myTree.insert(32);

    }
}

public class TreeNode{

    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int data) {
      this.data = data;
    }

    public void insert(int value){
        if(data == value)
            return;
        if(value < data){
            if(leftNode == null)
                leftNode = new TreeNode(value); 
            else
                leftNode.insert(value);
        }
        else{
            if(rightNode == null)
                rightNode = new TreeNode(value);
            else
                rightNode.insert(value);
        }

    }

    public TreeNode(int data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return this.leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return this.rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

   

}

public class Tree {

    private TreeNode root;

    public void insert(int value){

        if(root == null){
            root = new TreeNode(value);
        }    
        else
            root.insert(value);
    }
}

