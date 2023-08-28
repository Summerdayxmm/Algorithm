//package com.enchanted;
//
//
///**
// * @ClassName: LRUCache
// * @Description: LeetCode146.LRU缓存
// * @PackageName:com.enchanted
// * @Author Enchanted
// * @Date 2023/8/18 20:38
// * @Version 1.0
// */
//
//
//public class LRUCache {
//
//    public static class Node<K, V> {
//        public K key;
//        public V value;
//        public Node<K, V> last;
//        public Node<K, V> next;
//
//        public Node(K key, V value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//
//    public static class NodeDoubleLinkedList<K, V> {
//        private Node<K, V> head;
//        private Node<K, V> tail;
//
//        public NodeDoubleLinkedList() {
//            this.head = null;
//            this.tail = null;
//        }
//
//        public void addNode(Node<K, V> newNode) {
//            if (newNode == null) {
//                return;
//            }
//
//            if (this.head == null) {
//                this.head = newNode;
//                this.tail = newNode;
//            } else {
//                this.tail.next = newNode;
//                newNode.last = this.tail;
//                this.tail = newNode;
//            }
//        }
//
//        public void moveNodeToTail(Node<K, V> node) {
//            if (this.tail == node) {
//                return;
//            }
//
//            if (this.head == node) {
//                this.head = node.next;
//                this.head.next.last = null;
//            } else {
//                node.last.next = node.next;
//                node.next.last = node.last;
//            }
//
//            node.last = this.tail;
//            node.next = null;
//            this.tail.next = node;
//            this.tail = node;
//        }
//
//        public Node<K, V> removeHead() {
//            if (this.head == null) {
//                return;
//            }
//
//            this.head.next.last = null;
//            this.head.next
//        }
//
//
//
//
//    }
//}
//
//
