package swap;

public class FlowersSwapping {


    char[] flowers = {'G', 'C', 'V'};

    public String swap(int days) {

        if (days < 0) {
            throw new IllegalArgumentException("Input should be 0 or higher");
        }
        while (days > 0) {

            for (int i = 0; i < days; i++) {
                char temp = flowers[1]; //зберігаємо квітку праворуч
                flowers[1] = flowers[2];
                flowers[2] = temp;
                temp = flowers[0];
                flowers[0] = flowers[1];
                flowers[1] = temp;
            }
            days--;
        }
        return flowers[0] + "" + flowers[1] + "" + flowers[2];
    }
}

//    char[] flowers = {'G', 'C', 'V'};
//    int k = 1; // кількість днів для першого запуску
//
//// виконуємо операції Маші та Тані k раз для першого дня
//for (int i = 0; i < k; i++) {
//        char temp = flowers[1]; // зберігаємо праворуч квіточку
//        flowers[1] = flowers[2]; // переміщуємо центральну квіточку праворуч
//        flowers[2] = temp; // повертаємо збережену праворуч квіточку на місце центральної
//        temp = flowers[0]; // зберігаємо ліву квіточку
//        flowers[0] = flowers[1]; // переміщуємо центральну квіточку ліворуч
//        flowers[1] = temp; // повертаємо збережену ліву квіточку на місце центральної
//        }
//
//        k = 2; // кількість днів для другого запуску
//
//// виконуємо операції Маші та Тані k раз для другого дня
//        for (int i = 0; i < k; i++) {
//        char temp = flowers[1]; // зберігаємо праворуч квіточку
//        flowers[1] = flowers[2]; // переміщуємо центральну квіточку праворуч
//        flowers[2] = temp; // повертаємо збережену праворуч квіточку на місце центральної
//        temp = flowers[0]; // зберігаємо ліву квіточку
//        flowers[0] = flowers[1]; // переміщуємо центр