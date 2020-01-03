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

        myTree.traverseInOrder();

        System.out.println(myTree.get(25));

        System.out.println(myTree.min());

        System.out.println(myTree.max());

    }
}

public class TreeNode{

    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int data) {
      this.data = data;
    }

    public TreeNode get(int value){

        if(data == value)
            return this;

        if(value<data){
            if(leftNode!=null){
               return leftNode.get(value); 
            }   
        }
        else{
            if(rightNode != null){
            return rightNode.get(value); 
            }
        } 

        return null;
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

    public void traverseInOrder(){
        if(leftNode != null){
            leftNode.traverseInOrder();
        }
        System.out.print(data+" ");
        if(rightNode != null){
            rightNode.traverseInOrder();
        }
    }

    public int min(){
        if(leftNode == null)
            return data;
        else
            return leftNode.min();    
    }

    public int max(){
        if(rightNode ==null)
            return data;
        else    
            return rightNode.max();    
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

    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }

    public TreeNode get(int value){
        if(root!=null)
           return root.get(value);

        return null;   
    }

    public int min(){
        if(root!=null)
            return root.min();
        return 0;    
    }

    public int max(){
        if(root!=null)
            return root.max();
        return 0;    
    }

}

