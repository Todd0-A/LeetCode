import java.util.*;

public class WordLadder {
    /*
    https://leetcode.com/problems/word-ladder/
     */
    public static void main(String[] args) {
        String beginWord="hot";
        String endWord="dog";
        List<String> lists=new ArrayList<String>();//["hot","dog","dot"]
        lists.add("hot");
        lists.add("dog");
        lists.add("dot");
        System.out.println(ladderLength(beginWord,endWord,lists));
    }
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>(); // For performing BFS
        HashSet<String> set = new HashSet<>(wordList); // Maintaining visited word set
        set.remove(beginWord);
        queue.add(beginWord); // adding the beginWord to the queue to start the iterations
        int level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            level++; // complete queue is traversed at that level, level is incremented
            for(int i=0; i<size; i++){
                String currentWord = queue.poll();
                if(currentWord.equals(endWord)){
                    return level;
                }
                List<String> neighbors = getNeighbor(currentWord); // Getting all the neighbors for that word
                for(String neigh : neighbors){
                    if(set.contains(neigh)){ // If set contains that neighbor, we have to remove that from visited and added to the queue as it will lead us to the required endWord
                        set.remove(neigh);
                        queue.add(neigh);
                    }
                }
            }
        }

        return 0;
    }

    public static List<String> getNeighbor(String string){
        char[] chars = string.toCharArray();
        List<String> result = new ArrayList<>();
        for(int i=0; i<chars.length; i++){
            char temp = chars[i];
            for(char c='a'; c<='z'; c++){ // replacing every character with 26 characters and adding them to the result list
                chars[i] = c;
                String neighbor = new String(chars);
                result.add(neighbor);
            }
            chars[i]=temp;
        }
        return result;
    }
}
