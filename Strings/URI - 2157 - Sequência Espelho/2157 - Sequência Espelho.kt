import java.util.*

fun main(args: Array<String>) {

	var N = Integer.parseInt(readLine()!!)
    var numeros: String
    
    while(N > 0){
        numeros = ""
        var vetor = readLine()!!.split(" ")
        
        for(i in Integer.parseInt(vetor[0]).. Integer.parseInt(vetor[1])){
            numeros += i.toString()
        }
        
        print(numeros)
        println(numeros.reversed())
        
        N--
    }
	
}