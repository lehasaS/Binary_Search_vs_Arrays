// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTreeNode
{
   Loadshedding data;
   BinaryTreeNode left;
   BinaryTreeNode right;
   
   public BinaryTreeNode ( Loadshedding d, BinaryTreeNode l, BinaryTreeNode r )
   {
      data = d;
      left = l;
      right = r;
   }
   
   BinaryTreeNode getLeft () { return left; }
   BinaryTreeNode getRight () { return right; }
   public String toString() {return data.toString();}
}
