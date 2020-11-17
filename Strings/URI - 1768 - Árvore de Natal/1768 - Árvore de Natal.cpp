#include <bits/stdc++.h>
using namespace std;
#define fastIO ios_base::sync_with_stdio(0);

int main()
{
    int N;
    int espacos;
    int asteristicos = 1;

    while(cin >> N)
    {
        espacos = N/2;
        asteristicos = 1;

        while(espacos >= 0)
        {
            for(int i = 0; i < espacos; i++)
            {
                cout << " ";
            }

            for(int j = 0; j < asteristicos; j++)
            {
                cout << "*";
            }
            cout << "\n";

            asteristicos += 2;
            espacos -=1 ;
        }

        espacos = N/2;
        for(int i = 0; i < espacos; i++)
        {
            cout << " ";
        }
        cout << "*\n";

        espacos--;
        for(int i = 0; i < espacos; i++)
        {
            cout << " ";
        }
        cout << "***\n\n";

    }

    return 0;
}