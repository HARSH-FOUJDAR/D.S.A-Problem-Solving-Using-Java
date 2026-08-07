import java.util.LinkedList;

public class Mappinghash {
    void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 20);
        map.put("China", 30);
        map.put("Pakisthan", 50);
        map.put("UK", 60);

        System.out.println(map);
    }

    static class HashMap<K, V> {

        private final int N; //-- n bucket
        private LinkedList<Node>[] bucket;//N = bucket.length
        private int n;  // n- nodes


        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        public V get(K key) {
            int bucketindex = hasFunction(key);
            int dataindex = searcgInALL(key, bucketindex);

            if (dataindex == -1) {
                return null;
            } else {
                Node node = bucket[bucketindex].get(dataindex);
                return node.value;

            }
        }

        private int hasFunction(K key) {
            int bucketindex = key.hashCode();
            return Math.abs(bucketindex) % N;
        }

        private int searcgInALL(K key, int bi) {
            LinkedList<Node> li = bucket[bi];

            for (int i = 0; i < li.size(); i++) {
                if (li.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private void Rehash() {
            LinkedList<Node>[] oldbucket = bucket;
            bucket = new LinkedList[N * 2];


            for (int i = 0; i < N * 2; i++) {
                bucket[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<Node> li = oldbucket[i];

                for (int j = 0; j < li.size(); j++) {
                    Node node = li.get(j);
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value) {
            int bi = hasFunction(key);
            int di = searcgInALL(key, bi);

            if (di == -1) {
                bucket[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = bucket[bi].get(di);
                node.value = value;
            }
            double lamda = (double) n / N;
            if (lamda > 2.0) {
                // ReHasing
                Rehash();

            }
        }

        public boolean containskey(K key) {
            int bucketindex = hasFunction(key);
            int dataindex = searcgInALL(key, bucketindex);

            return bucketindex != -1;
        }

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

    }

}
