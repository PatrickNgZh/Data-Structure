#include<cstdio>
#include<algorithm>
using namespace std;
const int MAXV= 110;
const int MAXE = 10010;

struct edge
{
	int u, v, cost;
}E[MAXE];

bool cmp(edge a, edge b) {
	return a.cost < b.cost;
}

int father[MAXV];

int findFather(int x) {
	int a = x;
	while (x!=father[a])
	{
		x = father[x];
	}
	while (a!=father[a])
	{
		int z = a;
		a = father[a];
		father[z] = x;
	}
	return x;
}

int kruskal(int n, int m) {
	int ans = 0, Num_Edge = 0;
	for (int i = 0; i < n; i++)
	{
		father[i] = i;
	}
	sort(E, E + m, cmp);
}
