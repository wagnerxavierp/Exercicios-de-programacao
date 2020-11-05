#include<iostream>
#include<string.h>

using namespace std;

int main()
{
    int tamanho;

    char teclaFalha;
    string valorOriginal;
    string valorAletrado = "";
    string valorAletrado2 = "";

    do
    {
      valorAletrado = "";
      valorAletrado2 = "";

      cin>>teclaFalha;
      cin>>valorOriginal;

      if(teclaFalha != '0' && valorOriginal != "0")
      {
          tamanho = valorOriginal.size();

          valorAletrado+="0";

          for(int i = 0; i < tamanho; i++)
          {

              if(valorOriginal[i] != teclaFalha)
              {
                  valorAletrado+=valorOriginal[i];
              }

          }

          tamanho = valorAletrado.size();
          int inicio = 0;

          for(int i = 0; i < tamanho; i++)
          {
              if((valorAletrado[i] != '0') && (inicio == 0))
                inicio = 1;
              
              if(inicio == 1 || i == tamanho-1)
                  valorAletrado2+=valorAletrado[i];
          }

          cout<<valorAletrado2<<endl;

      }

    }while(teclaFalha != '0' && valorOriginal != "0");

    return 0;

}
