#include<iostream>
#include<vector>
using namespace std;

void solve(vector<int> &arr,vector<int> &res)
{
    long long int sum=0;
    long long int so=0;
    for(int i=0;i<arr.size();i++)
    {
        sum+=arr[i];
        if(i%2!=0)
            so+=arr[i];
    }
    if(so<=sum/2)
    {
        for(int i=0;i<arr.size();i++)
        {
            res[i]=(i%2==0)?arr[i]:1;
        }
    }
    else
    {
        for(int i=0;i<arr.size();i++)
        {
            res[i]=(i%2==0)?1:arr[i];
        }
    }
}

int main(int args,char** argv)
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t-->0)
    {
        int n;
        cin>>n;
        vector<int> arr(n,0);
        for(int i=0;i<n;i++)
            cin>>arr[i];
        vector<int> res(n,0);
        solve(arr,res);
        for(int val: res)
            cout<<val<<" ";
        cout<<"\n";
    }
}
