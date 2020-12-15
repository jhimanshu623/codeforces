#include<iostream>
#include<unordered_set>
using namespace std;

int solve(int* arr,int n,int k)
{
    unordered_set<int> colors;
    for(int i=0;i<n;i++)
        colors.insert(arr[i]);
    int ans=n;
    for(int c:colors)
    {
        int i=0;
        int count=0;
        while(i<n)
        {
            if(arr[i]==c)
                i++;
            else
            {
                i=i+k;
                count++;
            }
        }
        ans=min(ans,count);
    }
    return ans;
}

int main(int args,char** argv)
{
    int t;
    cin>>t;
    while(t-- > 0)
    {
        int n,k;
        cin>>n>>k;
        int* arr=new int[n];
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        cout<<solve(arr,n,k)<<"\n";
    }
    return 0;
}

// test case
// 1,2,2,2,1,2,2,2,1
// 1,2,3,4,1,2,2,2,1