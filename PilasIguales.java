public class PilasIguales{

    public static void main(String[] args) throws ExceptionIsEmpty{
        
        //prueba1
        int[] arr1 = {1, 1, 1, 2, 3};
        int[] arr2 = {2, 3, 4};
        int[] arr3 = {1, 4, 1, 1};

        System.out.println(equalStacks(arr1, arr2, arr3)); //devuelve 5
        
        /*
        //prueba2
        int[] arr1 = {1, 2, 1, 1};
        int[] arr2 = {1, 1, 2};
        int[] arr3 = {1, 1};

        System.out.println(equalStacks(arr1, arr2, arr3)); //devuelve 1 -> cumple la condicion del ejercicio
        */

    }

    public static int equalStacks(int[] arr1, int[] arr2, int[] arr3) throws ExceptionIsEmpty{
        //preparamos para llenar las pilas con alturas acumuladas
        Stack<Integer> pila1 = new Stack<Integer>();
        Stack<Integer> pila2 = new Stack<Integer>();
        Stack<Integer> pila3 = new Stack<Integer>();

        int alturaPila1 = 0;
        int alturaPila2 = 0;
        int alturaPila3 = 0;

        for (int i = 0; i < arr1.length; i++){
            alturaPila1 += arr1[i];
            pila1.push(alturaPila1);
        }

        for (int i = 0; i < arr2.length; i++){
            alturaPila2 += arr2[i];
            pila2.push(alturaPila2);
        }

        for (int i = 0; i < arr3.length; i++){
            alturaPila3 += arr3[i];
            pila3.push(alturaPila3);
        }

        //comienza el balanceo de las pilas
        while(true){
            if (pila1.isEmpty() || pila2.isEmpty() || pila3.isEmpty())
                return 0;

            int alturaActual_pila1 = 0;
            int alturaActual_pila2 = 0;
            int alturaActual_pila3 = 0;

            if (alturaActual_pila1 == alturaActual_pila2 && alturaActual_pila2 == alturaActual_pila3)
                return alturaActual_pila1;
            
            if (alturaActual_pila1 >= alturaActual_pila2 && alturaActual_pila1 >= alturaActual_pila3)
                pila1.pop();
            else if (alturaActual_pila2 >= alturaActual_pila1 && alturaActual_pila2 >= alturaActual_pila3)
                pila2.pop();
            else if (alturaActual_pila3 >= alturaActual_pila2 && alturaActual_pila3 >= alturaActual_pila1)
                pila3.pop();
        }
    }
}
