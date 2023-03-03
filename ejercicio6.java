

/*El algoritmo genera una tabla de 3 filas y 3 columnas, donde cada celda de la tabla
 contiene un valor entero, que comienza en 1 y se incrementa en 1 por cada celda. */
 // 1  2  3
 // 4  5  6
 // 7  8  9


 //Algoritmo 4x4
    /*Algo QueHace
    ??
    Constante TAMAÑO : entero <- 4
    Variable i, j, val: entero
    Variable tab2d: entero[TAMAÑO][TAMAÑO]
    Inicio
    val <- 1
    Para i <- 0 a TAMAÑO - 1
    Para j <- 0 a TAMAÑO - 1
    tab2d[j][i] <- val
    val <- val + 1
    FPara
    FPara
    Fin
    */
// 1  2  3  4
// 5  6  7  8
// 9  10 11 12
// 13 14 15 16

//Ejercio 2
public class ejercico6 {
    public static void main(String[] args) {
      final int TAMAÑO = 4;
      int[][] tab2d = new int[TAMAÑO][TAMAÑO];
      int val;
  
      for (int i = 0; i < TAMAÑO; i++) {
        val = i;
        for (int j = 0; j < TAMAÑO; j++) {
          tab2d[i][j] = val;
          val = val + 1;
        }
      }
  
      // Imprimir la matriz
      for (int i = 0; i < TAMAÑO; i++) {
        for (int j = 0; j < TAMAÑO; j++) {
          System.out.print(tab2d[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
  