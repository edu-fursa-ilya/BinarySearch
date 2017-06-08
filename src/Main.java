public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int answ = binarySearch(arr, 2);
        System.out.println("Current item was found at index = " + answ);
    }

    static int binarySearch(int arr[], int item) {
        int start = 0; //начало массива
        int finish = arr.length - 1; //конец массива

        while (start <= finish) { //пока не дойдем до начала массива
            int middle = (start + finish) / 2; // находим середину по формуле поиска
            int current = arr[middle]; //текущий элемент в середине записывается в current
            if(current == item) { //если текущий элемент равен искомому то выводим индекс
                return middle;
            } else if(current > item) { //если текущий элемент больше тогда концовка равна середина - 1
                finish = middle - 1;
            } else start = middle + 1; //иначе начало равно середина + 1
        }

        return 0;
    }
}

