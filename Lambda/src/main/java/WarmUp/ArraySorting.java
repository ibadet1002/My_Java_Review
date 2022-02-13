package WarmUp;

public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
       // as.sort();


        QuickSort qs = new QuickSort();
        as.sort(qs);

        BubbleSort bs = new BubbleSort();
        as.sort(bs);

      Sorting noLambda = new QuickSort();
      noLambda.sort();

      Sorting quickSort = () -> System.out.println( "QUICK SORTING");
      as.sort(quickSort);

        Sorting bubbleSort = () -> System.out.println( "BUBBLE SORTING");
        as.sort(bubbleSort);

        as.sort(() -> System.out.println( "BUBBLE SORTING")); //lambda

    }


    private void sort(Sorting sorting){

        sorting.sort();
    }


}
