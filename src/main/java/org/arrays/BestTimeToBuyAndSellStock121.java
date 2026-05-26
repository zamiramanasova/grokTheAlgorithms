package org.arrays;

/**
 * Вам даётся массив , где — цена заданной акции в день дня.pricesprices[i]ith
 * Вы хотите максимизировать прибыль, выбрав один день
 * для покупки одной акции и другой день в будущем для продажи её.
 * Верните максимальную прибыль, которую можете получить от
 * этой сделки. Если вы не можете получить прибыль — возвращайтесь.0
 * Пример 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 */
public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int lowest_price_so_far = prices[0];// устанавливается самая низкая цена
        int highest_profit = 0;// самая высокая
        for (int todays_price : prices) {// итерация цикла
            highest_profit = Math.max(highest_profit, todays_price - lowest_price_so_far);//в самую высокую цену записывается
            lowest_price_so_far = Math.min(lowest_price_so_far, todays_price);//в самую низкую цену записывается
        }
        return highest_profit;
    }
}
