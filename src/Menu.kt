/**
 * Created by lm_ce_000 on 10/10/2019.
 */
fun main (args: Array<String>){
    val ingredientes: List<String> =
            listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")

    val menu: String = """
    :: Bienvenido a Recipe Maker ::

    Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir
"""
    var entrada: String? = null
    var continuar: Boolean = true
    while(continuar){
        println(menu)

        entrada = readLine()

        when(entrada){
            "1" -> makeRecipe(ingredientes)
            "2" -> viewRecipe()
            "3" -> {    continuar = false
                        println("Hasta luego")  }
            else -> println("Opcion invalida")
        }
    }
}

fun makeRecipe(ingredientes: List<String>){
    println("Hacer una receta")
    println("Selecciona por categoria el ingrediente que buscas")
    for((indice,ingrediente) in ingredientes.withIndex()){
        println("${indice+1}. $ingrediente")
    }
    //println("${ingredientes.size}. Finalizar receta")
}

fun viewRecipe(){
    println("Ver mis recetas")
}