class QuickSort {
    public void quicksort(char[] c, int begin, int end) {
        if(begin < end) {
            int pivotIndex = partition(c, begin, end);

            quicksort(c, begin, pivotIndex - 1);
            quicksort(c, pivotIndex + 1, end);
        }
    }

    private int partition(char[] c, int begin, int end) {
        int pivot = map.get(c[end]);
        int i = begin - 1;

        for(int j = begin; j < end; j++) {
            if(map.get(c[j]) >= pivot) {
                i++;

                //swap them
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
        }

        //swap them
        char temp = c[i + 1];
        c[i + 1] = c[end];
        c[end] = temp;

        return i + 1;
    }
}
