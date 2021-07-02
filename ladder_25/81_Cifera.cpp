#include<iostream>
#include <math.h>
using namespace std;

int main(int args,char** argv){
    int k,l;
    cin>>k>>l;
    double d=log10(l)/log10(k);
    // cout<<d<<" "<<ceil(d)<<" "<<floor(d)<<"\n";
    if(ceil(d) == floor(d)){
        cout<<"YES\n";
        cout<<((int)d-1)<<"\n";
    }else{
        cout<<"NO\n";
    }
    return 0;
}