import java.util.*;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop prices from stack less than or equal to current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, price is greater than all previous prices
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push this price's index to stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = calculateSpan(prices);

        System.out.println("Stock spans:");
        for (int span : result) {
            System.out.print(span + " ");
        }
    }
}
