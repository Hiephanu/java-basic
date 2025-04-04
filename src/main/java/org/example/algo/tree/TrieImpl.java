package org.example.algo.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrieImpl {
    static class TrieNode {
        private Map<Character, TrieNode> children = new HashMap<>();
        private Boolean isEnd = false;
    }
    static class  Trie {
        private TrieNode root;
        Trie() {
            root = new TrieNode();
        }

        private void addToTrie(String word) {
            TrieNode curr = root;
            for(int i = 0 ; i< word.length(); i++) {
                curr.children.putIfAbsent(word.charAt(i), new TrieNode());
                curr = curr.children.get(word.charAt(i));
            }
            curr.isEnd = true;
        }

        private boolean findWord(String word) {
            TrieNode curr = root;
            for (int i = 0; i < word.length(); i++) {
                if(curr.children.get(word.charAt(i)) == null) {
                    return false;
                }
                curr = curr.children.get(word.charAt(i));
            }
            return curr.isEnd;
        }

        private List<String> suggestionWord(String prefix) {
            TrieNode curr = root;
            List<String> strs = new ArrayList<>();
            for(int i=0; i <  prefix.length(); i++) {
                if(curr.children.get(prefix.charAt(i)) == null) {
                    return  strs;
                }
                curr = curr.children.get(prefix.charAt(i));
            }
            collectWords(curr, new StringBuilder(prefix), strs);

            return  strs;
        }
        private void collectWords(TrieNode node, StringBuilder currentWord, List<String> suggestions) {
            if (node.isEnd) {
                suggestions.add(currentWord.toString());
            }

            for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
                currentWord.append(entry.getKey());
                collectWords(entry.getValue(), currentWord, suggestions);
                currentWord.deleteCharAt(currentWord.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.addToTrie("oke");
        trie.addToTrie("kakka");
        trie.addToTrie("nao");
        trie.addToTrie("ko");
        trie.addToTrie("koem");
        trie.addToTrie("koaica");
        List<String> arr = trie.suggestionWord("ko");
        for (String  str : arr) {
            System.out.println(str);
        }

    }
}
