public class Main {
            public static void main(String[] args) {
                int counter = 0;
                String word = "AJavajhjhdabjshjava jsda javanjnjava";
                for (int i = 0; i < word.length() - 3; i++) {
                    if (word.substring(i, i + 4).equalsIgnoreCase("java")) {
                        counter++;
                    }
                }
                System.out.println(counter);


            }
        }