#include <bits/stdc++.h>
#define fastIO ios_base::sync_with_stdio(0);
using namespace std;


int main()
{
    fastIO;

    //Criar lista
    vector<int> fileiraDeBolas;
    int quantidadeDeBolas;
    int bola;

    cin >> quantidadeDeBolas;

    while(quantidadeDeBolas--)
    {
        cin >> bola;
        fileiraDeBolas.push_back(bola);
    }

    while(fileiraDeBolas.size() != 1)
    {
        quantidadeDeBolas = fileiraDeBolas.size();

        for(int i = 0; i < quantidadeDeBolas - 1; i++)
        {
            if(fileiraDeBolas[i] == fileiraDeBolas[i+1])
            {
                fileiraDeBolas[i] = 1;
            }
            else{
                fileiraDeBolas[i] = -1;
            }
        }

        fileiraDeBolas.pop_back();
    }

    if(fileiraDeBolas[0] == 1)
    {
        cout << "preta\n";
    }
    else
    {
        cout << "branca\n";
    }

    return 0;
}
