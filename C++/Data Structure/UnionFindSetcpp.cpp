#include<iostream>
using namespace std;

int father[10];

int findFather(int x) {
	if (x == father[x]) {
		return x;
	}
	else {
		return findFather(father[x]);
	}
}

int main() {
	
	return 0;
}