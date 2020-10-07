package october.week1

import TreeNode

/**

You are given the root node of a binary search tree (BST)
and a value to insert into the tree. Return the root node of the BST after the insertion.
It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion,
as long as the tree remains a BST after insertion. You can return any of them.
 **/

fun insertIntoBST(root: TreeNode?, value: Int): TreeNode? {
    if (root == null)
    {
        return TreeNode(value)
    }

    if (root.left == null && root.data > value)
    {
        root.left=TreeNode(value)
        return root
    }

    if (root.right == null && root.data < value)
    {
        root.right=TreeNode(value)
        return root
    }


    if (root.data > value) {
        insertIntoBST(root.left, value)
    } else {
        insertIntoBST(root.right, value)
    }

    return root
}