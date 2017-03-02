package algorithms.graphTheory;

import java.util.*;

/**
 * @author Pablo Johnson pablo.88j@gmail.com
 * exercise: https://www.hackerrank.com/challenges/even-tree
 * testCase: 20 19 2 1 3 1 4 3 5 2 6 5 7 1 8 1 9 2 10 7 11 10 12 3 13 7 14 8 15 12 16 6 17 6 18 10 19 1 20 8
 */
public class EvenTree {

    public static class Tree{
        public int value;
        public Tree parent;
        public List<Tree> childs = new ArrayList<>();
        public Tree(Tree parent, int value){
            this.parent = parent;
            this.value = value;
        }
        public void addChild(Tree child){
            childs.add(child);
        }
    }

    private static int getTreeSize(Tree tree){
        return getChildsNumber(tree)+1;
    }

    public static int getChildsNumber(Tree tree){
        if (tree.childs==null){
            return 0;
        }
        int sum = tree.childs.size();
        for(int i=0; i<tree.childs.size(); i++){
            sum+= getChildsNumber(tree.childs.get(i));
        }
        return sum;
    }

    public static int evenTree(Tree tree){
        if (tree.childs==null){
            return 0;
        }
        int sum=0;
        for(int i=0;i<tree.childs.size();i++){
            if (getTreeSize(tree.childs.get(i))%2==0){
                System.out.println(tree.childs.get(i).value);
                sum++;
            }
            sum+=evenTree(tree.childs.get(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer,Tree> map = new HashMap<>();
        Tree root = new Tree(null, 1);
        map.put(1,root);
        for (int i=0; i<m; i++){
            int value = scanner.nextInt();
            int parent = scanner.nextInt();
            if(map.containsKey(parent)){
                Tree parentTree = map.get(parent);
                Tree tree = new Tree(parentTree, value);
                parentTree.addChild(tree);
                map.put(value, tree);
            }
        }
        System.out.println(evenTree(root));
    }
}
