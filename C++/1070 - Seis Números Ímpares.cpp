#include <iostream>

using namespace std;

int main() {
   
   int x;
   int quant = 6;
   
   cin>>x;
   
   if(x%2 == 1){
       cout << x << endl;
       quant--;
   }else{
       x--;
   }
   
   for(int i = 0; i < quant; i++){
       x += 2;
       cout << x << endl;
   }
   
   return 0;
   
}
