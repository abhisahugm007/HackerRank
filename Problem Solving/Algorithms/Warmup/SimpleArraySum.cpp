#include <iostream>

using namespace std;

int main()
{
 int i,n,sum=0;
    cin>>n;
    int ar[n];
    for(i=0;i<n;i++)
    cin>>ar[i];
    for(i=0;i<n;i++)
    sum=sum+ar[i];   
    cout<<sum;
}

//https://www.hackerrank.com/challenges/simple-array-sum/problem
