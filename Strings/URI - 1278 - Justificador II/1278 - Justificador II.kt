import java.util.*

fun main(args: Array<String>) {

    var N: Int
    var linhas: ArrayList<String>
    var maiorTamanho: Int
	var tamanhoLinha: Int
	var linha: String
    
    N = Integer.parseInt(readLine()!!)
    
    while(N > 0)
    {
        linhas = ArrayList<String>()
        maiorTamanho = 0
        
        
        while(N>0)
        {
            linha = readLine()!!.trim().replace("\\s+".toRegex(), " ")
            
			tamanhoLinha = linha.length
            
            if(tamanhoLinha > maiorTamanho)
			    maiorTamanho = tamanhoLinha
            
            linhas.add(linha)
            
            N--
        }
        
        var q: Int
    
        for(linhaIt in linhas)
        {
            q = maiorTamanho - linhaIt.length
            
            while(q > 0)
            {
                print(" ")
                q--
            }
        
            print(linhaIt+"\n")
        }
    
        N = Integer.parseInt(readLine()!!)
        
        if(N > 0)
            print("\n")
        
    }
    
}