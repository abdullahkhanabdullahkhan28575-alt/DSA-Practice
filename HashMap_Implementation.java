import java.util.ArrayList;
import java.util.LinkedList;

class HashMap_Implementation {

    static class HashMap<K, V> {

        // Node = ek key-value pair
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        // n = total elements
        private int n;

        // N = total buckets
        private int N;

        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {

            N = 4;
            n = 0;

            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // Hash Function
        private int hashFunction(K key) {

            int bi = key.hashCode();

            return Math.abs(bi) % N;
        }

        // Search key inside LinkedList
        private int searchInLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {

                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }

            return -1;
        }

        // Rehash
        @SuppressWarnings("unchecked")
        private void rehash() {

            // Old buckets ko save karo
            LinkedList<Node>[] oldBuckets = buckets;

            // Bucket size double
            N = N * 2;

            // New buckets banao
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Old elements ko new buckets mein daalo
            for (int i = 0; i < oldBuckets.length; i++) {

                LinkedList<Node> ll = oldBuckets[i];

                for (int j = 0; j < ll.size(); j++) {

                    Node node = ll.get(j);

                    // New bucket index
                    int bi = hashFunction(node.key);

                    // Directly add karo
                    buckets[bi].add(node);
                }
            }
        }

        // PUT
        public void put(K key, V value) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            // Key nahi mili
            if (di == -1) {

                buckets[bi].add(new Node(key, value));

                n++;

            } 
            // Key already exists
            else {

                Node node = buckets[bi].get(di);

                node.value = value;
            }

            // Load Factor
            double lambda = (double) n / N;

            // Rehash
            if (lambda > 2.0) {
                rehash();
            }
        }

        // GET
        public V get(K key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            }

            Node node = buckets[bi].get(di);

            return node.value;
        }

        // CONTAINS KEY
        public boolean containsKey(K key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            return di != -1;
        }

        // REMOVE
        public V remove(K key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            }

            Node node = buckets[bi].remove(di);

            n--;

            return node.value;
        }

        // KEY SET
        public ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {

                LinkedList<Node> ll = buckets[i];

                for (int j = 0; j < ll.size(); j++) {

                    Node node = ll.get(j);

                    keys.add(node.key);
                }
            }

            return keys;
        }
    }

    // MAIN
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 900);
        map.put("China", 90);
        map.put("US", 9000);
        map.put("PK", 900);

        System.out.println("India = " + map.get("India"));
        System.out.println("China = " + map.get("China"));
        System.out.println("US = " + map.get("US"));
        System.out.println("PK = " + map.get("PK"));

        System.out.println();

        System.out.println("Contains India: "
                + map.containsKey("India"));

        System.out.println("Contains Nepal: "
                + map.containsKey("Nepal"));

        System.out.println();

        System.out.println("Removed US = "
                + map.remove("US"));

        System.out.println("US after remove = "
                + map.get("US"));

        System.out.println();

        System.out.println("Keys:");

        ArrayList<String> keys = map.keySet();

        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i));
        }
    }
}