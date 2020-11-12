#include <bits/stdc++.h>
#define fastIO ios_base::sync_with_stdio(0);
using namespace std;

int main()
{
    fastIO;

    string coluna;
    int tamanhoColuna;
    int valorColuna;

    while(cin >> coluna)
    {
        tamanhoColuna = coluna.size();
        valorColuna = 0;

        if(tamanhoColuna == 3)
        {
            valorColuna += (coluna[2]) - 64;
            valorColuna += (coluna[1] - 64) * 26;
            valorColuna += (coluna[0] - 64) * 676;

            if(valorColuna <= 16384){
                cout << valorColuna << "\n";
            }else{
                cout << "Essa coluna nao existe Tobias!\n";
            }
        }
        else if(tamanhoColuna == 2)
        {
            valorColuna += coluna[1] - 64;
            valorColuna += (coluna[0] - 64) * 26;

            cout << valorColuna << "\n";
        }
        else if(tamanhoColuna == 1)
        {
            valorColuna += coluna[0] - 64;
            cout << valorColuna << "\n";
        }
        else
        {
            cout << "Essa coluna nao existe Tobias!\n";
        }

        //cin >> coluna;

    }

    return 0;

}
