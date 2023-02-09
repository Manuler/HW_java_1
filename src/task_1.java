// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class task_1 {
    public static void main(String[] args) {
        double[] array = { 0.45, 0.93, 0.40, 1.80, 3.20, 5.2 };
        double indexOfMax = array[0];
        double indexOfMin = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > indexOfMax)
            {
                indexOfMax = array[i];
            }
            else if (array[i] < indexOfMin)
            {
                indexOfMin = array[i];
            }
        }
        System.out.println("maximum element = " + indexOfMax + " " + "minimum element = " + indexOfMin);
    }
}