#include <bits/stdc++.h>

using namespace std;
int main() {
    string s;
    cin>>s;

    int flag = 0;
    uint64_t mask = 0x0;
    for (int i = 0; i < s.length(); i++)
        mask = mask ^ (1 << (s[i]-'a'));
    if ((!mask) || (((mask & (mask - 1)) == 0)))
        flag = 1;
    if(flag==0)
        cout<<"NO";
    else
        cout<<"YES";
    return 0;
}

//https://www.hackerrank.com/challenges/game-of-thrones/problem
