#include <bits/stdc++.h>

#define fastIO ios_base::sync_with_stdio(0);

using namespace std;

int main(){
    fastIO;

    double salario;
    double reajuste;

    cin >> salario;
    cout << fixed;
    cout << setprecision(2);

    if(salario >= 0.00 && salario <= 400.00){
        reajuste = (15.0/100.0) * salario;
        cout << "Novo salario: " << salario + reajuste << endl;
        cout << "Reajuste ganho: " << reajuste << endl;
        cout << "Em percentual: 15 %"<< endl;

    }else if(salario >= 400.01 && salario <= 800.00){
        reajuste = (12.0/100.0) * salario;
        cout << "Novo salario: " << salario + reajuste << endl;
        cout << "Reajuste ganho: " << reajuste << endl;
        cout << "Em percentual: 12 %"<< endl;

    }else if(salario >= 800.01 && salario <= 1200.00){
        reajuste = (10.0/100.0) * salario;
        cout << "Novo salario: " << salario + reajuste << endl;
        cout << "Reajuste ganho: " << reajuste << endl;
        cout << "Em percentual: 10 %"<< endl;

    }else if(salario >= 1200.01 && salario <= 2000.00){
        reajuste = (7.0/100.0) * salario;
        cout << "Novo salario: " << salario + reajuste << endl;
        cout << "Reajuste ganho: " << reajuste << endl;
        cout << "Em percentual: 7 %"<< endl;

    }else if(salario > 2000.00){
        reajuste = (4.0/100.0) * salario;
        cout << "Novo salario: " << salario + reajuste << endl;
        cout << "Reajuste ganho: " << reajuste << endl;
        cout << "Em percentual: 4 %"<< endl;
    }

    return 0;

}
