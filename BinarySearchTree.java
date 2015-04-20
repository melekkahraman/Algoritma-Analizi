import java.util.*;
package bst;
import java.util.*;

public class BST <T extends Comparable<T>> implements Iterable<T>
{
   public static int cost = 0;
   public static void main(String[] args)
   {
       
      Integer[] a = new Integer[100000];
      Random r = new Random();
      for (int i = 0; i < 100000; i++)    
                a[i]=r.nextInt(100000);
      
      BST<Integer> bst = new BST<Integer>();
      for(Integer n : a) bst.insert(n);

      bst.preOrderTraversal();
      System.out.println();

       
      bst.search(r.nextInt(1000));
      
       System.out.println("Maaliyet = " + cost);
      
   }


   private Node<T> root;
   private Comparator<T> comparator;

   public BST()
   {
      root = null;
      comparator = null;
   }

   public BST(Comparator<T> comp)
   {
      root = null;
      comparator = comp;
   }

   private int compare(T x, T y)
   {
      if(comparator == null) return x.compareTo(y);
      else
      return comparator.compare(x,y);
   }

public class BST <T extends Comparable<T>> implements Iterable<T>
{
   public static void main(String[] args)
   {
      Integer[] a = {1,5,2,7,4};
      BST<Integer> bst = new BST<Integer>();
      for(Integer n : a) bst.insert(n);

      bst.preOrderTraversal();
      System.out.println();

      //testing comparator
      //build a mirror BST with a rule:  Left > Parent > Right
      //code for the comparator at the bottom of the file
      bst = new BST<Integer>(new MyComp1());
      for(Integer n : a) bst.insert(n);

      bst.preOrderTraversal();
      System.out.println();
      bst.inOrderTraversal();
      System.out.println();


      for(Integer n : bst) System.out.print(n);
      System.out.println();

      System.out.println(bst);

      //testing restoring a tree from two given traversals
      bst.restore(new Integer[] {11,8,6,4,7,10,19,43,31,29,37,49},
                      new Integer[] {4,6,7,8,10,11,19,29,31,37,43,49});
      bst.preOrderTraversal();
      System.out.println();
      bst.inOrderTraversal();
      System.out.println();

      //testing diameter
      System.out.println("diameter = " + bst.diameter());
      //testing width
      System.out.println("width = " + bst.width());
   }


   private Node<T> root;
   private Comparator<T> comparator;

   public BST()
   {
      root = null;
      comparator = null;
   }

   public BST(Comparator<T> comp)
   {
      root = null;
      comparator = comp;
   }

   private int compare(T x, T y)
   {
      if(comparator == null) return x.compareTo(y);
      else
      return comparator.compare(x,y);
   }
public boolean search(T toSearch)
   {
      return search(root, toSearch);
   }
   private boolean search(Node<T> p, T toSearch)
   {
      if (p == null)
         return false;
      else
      if (compare(toSearch, p.data) == 0)
      	return true;
      else
      if (compare(toSearch, p.data) < 0)
         return search(p.left, toSearch);
      else
         return search(p.right, toSearch);
   }
