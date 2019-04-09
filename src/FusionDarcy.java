import java.util.*;

public class FusionDarcy {
    public static void main(String[] args){
        new FusionDarcy().run();
    }

    void shortestPaths(List<Edge>[] edges, int s, int[] prio, int[] pred) {
        Arrays.fill(pred, -1);
        Arrays.fill(prio, Integer.MAX_VALUE);
        prio[s] = 0;
        PriorityQueue<Long> q = new PriorityQueue<>();
        q.add((long) s);
        while (!q.isEmpty()) {
            long cur = q.remove();
            int curu = (int) cur;
            if (cur >>> 32 != prio[curu])
                continue;
            for (Edge e : edges[curu]) {
                int v = e.t;
                int nprio = prio[curu] + e.cost;
                if (prio[v] > nprio) {
                    prio[v] = nprio;
                    pred[v] = curu;
                    q.add(((long) nprio << 32) + v);
                }
            }
        }
    }

    static class Edge {
        int t, cost;

        public Edge(int t, int cost) {
            this.t = t;
            this.cost = cost;
        }
    }

    char C[][];
    int num_in[];
    int m,n;

    int di[] = new int[] { -1,1,0,0 };
    int dj[] = new int[] { 0,0,-1,1 };

    int[] createSets(int size) {
        int[] p = new int[size];
        for (int i = 0; i < size; i++)
            p[i] = i;
        return p;
    }

    int root(int[] p, int x) {
        return x == p[x] ? x : (p[x] = root(p, p[x]));
    }

    void unite(int[] p, int a, int b) {
        a = root(p, a);
        b = root(p, b);
        if (a != b)
            p[a] = b;
    }

    void run(){
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();

        C = new char[m][n];

        int[] p = createSets(m*n);

        for(int i=0;i<m;i++)
            C[i] = in.next().toCharArray();

        int num = 0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                for(int k=0;k<4;k++){
                    int nI = i+di[k], nJ = j+dj[k];
                    if(!(0 <= nI && nI < m && 0 <= nJ && nJ < n))
                        continue;
                    if(C[i][j] == 'A' || C[i][j] == '#')
                        continue;
                    if(C[nI][nJ] == 'A' || C[nI][nJ] == '#')
                        continue;
                    unite(p,i*n+j,nI*n+nJ);
                }

        num_in = new int[m*n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(C[i][j] == 'O')
                    num_in[root(p,i*n+j)]++;

        List<Edge>[] edges = new List[m*n];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                edges[i*n+j] = new ArrayList<>();
                for(int k=0;k<4;k++){
                    int nI = i+di[k], nJ = j+dj[k];
                    if(!(0 <= nI && nI < m && 0 <= nJ && nJ < n))
                        continue;
                    if(C[i][j] == '#') continue;
                    if(C[nI][nJ] == '#' || C[nI][nJ] == 'A') continue;
                    int cost = 1;
                    if(C[nI][nJ] == '.')
                        cost = 0;
                    edges[i*n+j].add(new Edge(nI*n+nJ, cost));
                }
            }

        int[] dist = new int[m*n];
        int[] pred = new int[m*n];

        int ctr = 0;
        int mini = m*n+1;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(C[i][j] != 'A') continue;
                if(ctr == 0)
                    shortestPaths(edges,i*n+j,dist,pred);
                else {
                    for(int k=0;k<4;k++){
                        int nI = i+di[k], nJ = j+dj[k];
                        if(!(0 <= nI && nI < m && 0 <= nJ && nJ < n))
                            continue;
                        if(C[nI][nJ] == '#') continue;
                        if(dist[nI*n+nJ] == Integer.MAX_VALUE) continue;
                        if(dist[nI*n+nJ] % 2 == 0 ||
                                dist[nI*n+nJ] != num_in[root(p,nI*n+nJ)])
                            mini = Math.min(mini,(dist[nI*n+nJ]+1)/2+1);
                    }
                }
                ctr++;
            }
        if(mini > m*n) mini = -1;
        System.out.println(mini);
    }
}