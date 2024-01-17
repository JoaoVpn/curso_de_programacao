package curso_de_programacao;

import javax.swing.JOptionPane;

public class exercicio_aula36_parte_6 {

    void selecaoSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        exercicio_aula36_parte_6 ob = new exercicio_aula36_parte_6();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        ob.selecaoSort(arr);
        System.out.println("Array Ordenado:");

        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

}
