#include <stdio.h>
#include <iostream>
#include <string>

using namespace std;

int main() {
    
    int casos = 0;
    string valor = "";
    string thor = "Thor";
    
    cin>>casos;
    
    for(int i = 0; i < casos; i++){
        cin>>valor;
        
        if(valor.compare(thor) != 0){
            cout<<"N"<<endl;
        }else{
            cout<<"Y"<<endl;
        }
        
        cin>>valor;
    }
    
    return 0;
    
}
