package systemclass.class08;

/**
 * @author yaxiaer
 */
public class PrefixTree {

    class Node1{
        private int pass;
        private int end;
        private Node1[] next;
        public Node1(){
            pass = 0;
            end = 0;
            next = new Node1[26];
        }
    }
    private Node1 root = new Node1();
    public void insert(String str){
        if (str==null){
            return;
        }
        Node1 node = root;
        node.pass++;
        int path = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            path = chars[i]-'a';
            if (node.next[path]==null){
                node.next[path] = new Node1();
            }
            node = node.next[path];
            node.pass++;
        }
        node.end++;
    }
    public int search(String str){
        if (str==null){
            return 0;
        }
        Node1 node = root;
        int path = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            path = chars[i]-'a';
            if (node.next[path]==null){
                return 0;
            }
            node = node.next[path];
        }
        return node.end;
    }
    public int prefixNumber(String str){
        return 0;
    }

}
