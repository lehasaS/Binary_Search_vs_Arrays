// Hussein's Binary Search Tree
// 27 March 2017
// Hussein Suleman

public class BinarySearchTree extends BinaryTree
{
   public void insert ( Loadshedding d )
   {
      if (root == null)
         root = new BinaryTreeNode (d, null, null);
      else
         insert (d, root);
   }
   public void insert ( Loadshedding d, BinaryTreeNode node )
   {
      if (d.compareTo (node.data) <= 0)
      {
         if (node.left == null)
            node.left = new BinaryTreeNode (d, null, null);
         else
            insert (d, node.left);
      }
      else
      {
         if (node.right == null)
            node.right = new BinaryTreeNode (d, null, null);
         else
            insert (d, node.right);
      }
   }
   
   public BinaryTreeNode find ( Loadshedding d )
   {
      if (root == null)
         return null;
      else
         return find (d, root);
   }
   public BinaryTreeNode find ( Loadshedding d, BinaryTreeNode node )
   {
      if (d.compareTo (node.data) == 0) 
         return node;
      else if (d.compareTo (node.data) < 0)
         return (node.left == null) ? null : find (d, node.left);
      else
         return (node.right == null) ? null : find (d, node.right);
   }
   
   public void delete ( Loadshedding d )
   {
      root = delete (d, root);
   }   
   public BinaryTreeNode delete( Loadshedding d, BinaryTreeNode node )
   {
      if (node == null) return null;vv c c9vbvbib
      if (d.compareTo (node.data) < 0)
         node.left = delete (d, node.left);
      else if (d.compareTo (node.data) > 0)
         node.right = delete (d, node.right);
      else if (node.left != null && node.right != null )
      {
         node.data = findMin (node.right).data;
         node.right = removeMin (node.right);
      }
      else
         if (node.left != null)
            node = node.left;
         else
            node = node.right;
      return node;
   }
   
   public BinaryTreeNode findMin ( BinaryTreeNode node )
   {
      if (node != null)
         while (node.left != null)
            node = node.left;
      return node;
   }

   public BinaryTreeNode  removeMin ( BinaryTreeNode node )
   {
      if (node == null)
         return null;
      else if (node.left != null)
      {
         node.left = removeMin (node.left);
         return node;
      }
      else
         return node.right;
   }
   
}
