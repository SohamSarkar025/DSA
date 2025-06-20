import java.util.*;

public class HashMapImplementation {
    public static void main(String[] args) {
        // Create a sample HashMap and test it
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("USA", 200);
        map.put("China", 300);
        map.put("USA", 400); // Update value

        System.out.println("India: " + map.get("India"));
        System.out.println("USA: " + map.get("USA"));
        System.out.println("China: " + map.get("China"));
        System.out.println("Indonesia: " + map.get("Indonesia"));

        map.remove("China");
        System.out.println("China after removal: " + map.get("China"));
    }

    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes (key-value pairs)
        private int N; // number of buckets
        private LinkedList<Node>[] buckets; // array of LinkedLists

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // Hash function to calculate index for a key
        private int hashFunction(K key) {
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % N;
        }

        // Search for a key in a specific bucket (returns index in LinkedList or -1)
        private int searchInBucket(K key, int bucketIndex) {
            LinkedList<Node> bucket = buckets[bucketIndex];
            for (int i = 0; i < bucket.size(); i++) {
                if (bucket.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        // PUT method to insert/update key-value pair
        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            int nodeIndex = searchInBucket(key, bucketIndex);

            if (nodeIndex == -1) {
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bucketIndex].get(nodeIndex);
                node.value = value; // update value
            }

            double loadFactor = (double) n / N;
            if (loadFactor > 2.0) {
                rehash(); // if load factor too high, rehash
            }
        }

        // GET method to retrieve value for a key
        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int nodeIndex = searchInBucket(key, bucketIndex);

            if (nodeIndex == -1) {
                return null;
            } else {
                return buckets[bucketIndex].get(nodeIndex).value;
            }
        }

        // CONTAINS KEY method
        public boolean containsKey(K key) {
            int bucketIndex = hashFunction(key);
            int nodeIndex = searchInBucket(key, bucketIndex);
            return nodeIndex != -1;
        }

        // REMOVE method
        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int nodeIndex = searchInBucket(key, bucketIndex);

            if (nodeIndex == -1) {
                return null;
            } else {
                Node node = buckets[bucketIndex].remove(nodeIndex);
                n--;
                return node.value;
            }
        }

        // KEYSET method
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                for (Node node : buckets[i]) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // REHASH method to double the bucket size and redistribute keys
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            n = 0;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value); // re-put nodes
                }
            }
        }

        // SIZE method
        public int size() {
            return n;
        }

        // EMPTY method
        public boolean isEmpty() {
            return n == 0;
        }
    }
}

