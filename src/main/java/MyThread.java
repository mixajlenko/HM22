
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try {
            String input = "01000001011011000110010101111" +
                    "000011000010110111001100100011001010" +
                    "111001000100000010011000110100101110" +
                    "100011101100110100101101110011011110" +
                    "111011000101101010101000110100001100" +
                    "001011011100110101100100000010110010" +
                    "110111101110101001011010100011001101" +
                    "111011100100010000001111001011011110" +
                    "111010101110010001011010100100101101" +
                    "110011000110111001001100101011001000" +
                    "110100101100010011011000110010100100" +
                    "000010000110110111101101110011101000" +
                    "111001001101001011000100111010101110" +
                    "100011010010110111101101110001011010" +
                    "101010001101111001000000110111101110" +
                    "101011100100010000001100110011101010" +
                    "111010001110101011100100110010100100" +
                    "001001000000011110000110011";
            String output = "";
            String[] subStr;
            String delimeter = "-";

            for (int i = 0; i <= input.length() - 8; i += 8) {
                int k = Integer.parseInt(input.substring(i, i + 8), 2);
                output += (char) k;
            }

            subStr = output.split(delimeter);
            for (int i = 0; i < subStr.length; i++) {
                Thread.sleep(2500);
                System.out.println("\n" + subStr[i] + "\n");
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}



