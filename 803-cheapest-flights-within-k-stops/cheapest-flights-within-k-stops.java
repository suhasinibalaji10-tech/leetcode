class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
       List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] flight : flights) {
            int u = flight[0], v = flight[1], w = flight[2];
            adj.get(u).add(new int[]{v, w});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, src, 0}); 
        int[][] dist = new int[n][k + 2]; 
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[src][0] = 0;

        while (!pq.isEmpty()) {
            int[] state = pq.poll();
            int cost = state[0], u = state[1], stops = state[2];

            if (u == dst) return cost; 

            if (stops > k) continue; 

            for (int[] edge : adj.get(u)) {
                int v = edge[0], w = edge[1];
                int newCost = cost + w;
                if (newCost < dist[v][stops + 1]) {
                    dist[v][stops + 1] = newCost;
                    pq.add(new int[]{newCost, v, stops + 1});
                }
            }
        }
        return -1; 
    }
}