package actividad_uno;

public class AppOrdenar {
	
	public void minimo(int A[],int inicial) {
		int min=A[0];
		int tmp,pos=0;
		
		for(int a =0;a<A.length-1;a++) {
			if(A[a]==inicial) {
				min=A[a];
				pos=a;
			}
			
		}
		
		 tmp=A[0];
		 A[pos]=tmp;
		 A[0]=min;
		 
		 
		
	}

	/* 
	* @param arreglo nombre del arreglo
	* @return Ordena el array
	*
	*
	*/

		public  void seleccion(int A[]) {
		        int i, j, menor, pos, tmp;
		        for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
		            menor = A[i];                       // de los elementos que quedan por ordenar                    
		            pos = i;                            // y guardamos su posiciónn
		            for (j = i + 1; j < A.length; j++) { // buscamos en el resto
		                if (A[j] < menor) {           // del arrayalgún elemento
		                    menor = A[j];             // menor que el actual
		                    pos = j;
		                }
		            }
		            if (pos != i) {                      // si hay alguno menor se intercambia                         
		                tmp = A[i];
		                A[i] = A[pos];
		                A[pos] = tmp;
		            }
		        }

		    }
		/* 
		* @param arreglo nombre del arreglo
		* @return Ordena el array
		*
		*
		*/
		  public void burbujaSimple(int[] arreglo) {
		        int temp = 0;
		        boolean ban = true;
		        while (ban == true) {
		            ban = false;
		            for (int j = 0; j < arreglo.length - 1; j++) {
		                if (arreglo[j] > arreglo[j + 1]) {
		                    ban = true;
		                    temp = arreglo[j];
		                    arreglo[j] = arreglo[j + 1];
		                    arreglo[j + 1] = temp;
		                }
		            }

		        }
		       
		    }

}
