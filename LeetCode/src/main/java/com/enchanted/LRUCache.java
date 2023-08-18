package com.enchanted;


/**
 * @ClassName: LRUCache
 * @Description: LeetCode146.LRU缓存
 * @PackageName:com.enchanted
 * @Author Enchanted
 * @Date 2023/8/18 20:38
 * @Version 1.0
 */


public class LRUCache {

    public static class Node<K, V> {
        public K key;
        public V value;
        public Node<K, V> last;
        public Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static class NodeDoubleLinkedList<K, V> {
        private Node<K, V> head;
        private Node<K, V> tail;

        public NodeDoubleLinkedList() {
            this.head = null;
            this.tail = null;
        }

    
    

    }
}


