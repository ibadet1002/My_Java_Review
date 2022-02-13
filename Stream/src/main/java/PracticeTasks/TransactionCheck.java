package PracticeTasks;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionCheck {
    public static void main(String[] args) {

    System.out.println("1: find all transaction in 2011 sort by value");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);


        System.out.println("2: what are all unique cities where traders work");
          TransactionData.getAll().stream()
                  .map(transaction -> transaction.getTrader().getCity())
                  .distinct()
                  .forEach(System.out::println);

        System.out.println("3: Find all traders from cambridge and sort them by name");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("4: Return a string of all traders name sorted alphabetically");
       String result= TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1, name2)-> name1+name2);
        System.out.println(result);


        System.out.println("5: any trader based in Milan");
       Boolean milanBased= TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);


        System.out.println("6: print values of all transactions from the traders living in Cambridge");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);


        System.out.println("7: what is the highest value of all the transactions");
       Optional<Integer> max= TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(max.get());


        System.out.println("8. find transaction with the smallest value");
       Optional<Transaction> smallVal= TransactionData.getAll().stream()
                .reduce((t1,t2)-> t1.getValue()< t2.getValue() ? t1 : t2);
        System.out.println(smallVal.get());

        //different approach
        Optional<Transaction> smallVal1= TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smallVal1);

    }
}
