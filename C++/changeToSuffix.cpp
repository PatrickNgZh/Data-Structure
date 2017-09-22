#include<iostream>
#include<string>
#include<queue>
#include<stack>
#include<map>
using namespace std;

string res;
queue<char> q;
stack<char> s;
map<char,int> op; //这里要有，分开

void changeToSuffix(){
	for(int i=0;i<res.length();++i){
		if(res[i]>='0'&&res[i]<='9'){
			q.push(res[i]);
		}
		else{
			while(!s.empty()&&op[res[i]]<=op[s.top()]){
				q.push(s.top());
				s.pop();
			}
			s.push(res[i]);
		}
	}
	while(!s.empty()){
		q.push(s.top());
		s.pop();
	}
}

int main(){
	op['+']=op['-']=1;
	op['*']=op['/']=2;
	cin>>res;
	changeToSuffix();
	while(!q.empty()){
		cout<<q.front()<<" ";
		q.pop();
	}
}