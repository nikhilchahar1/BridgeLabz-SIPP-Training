class MyHashMap {

    // Node class for Linked List
    class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;  // Number of buckets
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    // Hash function
    private int getBucketIndex(int key) {
        return key % SIZE;
    }

    // Helper to find previous node of the target key
    private Node find(Node head, int key) {
        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }

        return prev;
    }

    // Put key-value pair
    public void put(int key, int value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new Node(-1, -1);  // Dummy head
        }

        Node prev = find(buckets[index], key);
        if (prev.next == null) {
            prev.next = new Node(key, value); // Insert new node
        } else {
            prev.next.value = value;  // Update existing value
        }
    }

    // Get value by key
    public int get(int key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) return -1;

        Node prev = find(buckets[index], key);
        return (prev.next == null) ? -1 : prev.next.value;
    }

    // Remove key
    public void remove(int key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) return;

        Node prev = find(buckets[index], key);
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }
}
