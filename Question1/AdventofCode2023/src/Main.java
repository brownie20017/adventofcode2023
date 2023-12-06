
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String input = "";
        String number="";
        int numcount=0;
        int sum= 0;


        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(".idea/sample.txt"));
            String line = reader.readLine();

            while (line != null) {
                input = line;

                for (int i = 0; i < input.length(); i++) {

                    if (input.charAt(i) == '0') {
                        numcount++;
                    } else if (input.charAt(i) == '1') {
                        numcount++;

                    }
                    else if (input.charAt(i) == '2') {
                        numcount++;

                    }
                    else if (input.charAt(i) == '3'){
                        numcount++;

                    }
                    else if (input.charAt(i) == '4') {
                        numcount++;

                    }
                    else if (input.charAt(i) == '5'){
                        numcount++;

                    }
                    else if (input.charAt(i) == '6'){
                        numcount++;

                    }
                    else if (input.charAt(i) == '7') {
                        numcount++;

                    }
                    else if (input.charAt(i) == '8') {
                        numcount++;

                    }else if (input.charAt(i) == '9') {
                        numcount++;
                    }
                    else if (input.contains("zero")) {
                        numcount++;
                    }
                    else if (input.contains("one")) {
                        numcount++;
                    }
                    else if (input.contains("two")) {
                        numcount++;
                    }else if (input.contains("three")) {
                        numcount++;
                    }
                    else if (input.contains("four")) {
                        numcount++;
                    }
                    else if (input.contains("five")) {
                        numcount++;
                    }
                    else if (input.contains("six")) {
                        numcount++;
                    }
                    else if (input.contains("seven")) {
                        numcount++;
                    }
                    else if (input.contains("eight")) {
                        numcount++;
                    }
                    else if (input.contains("nine")) {
                        numcount++;
                    }

                }


        if (numcount != 0) {


            for (int i = 0; i < input.length(); i++) {
                if (input.indexOf("zero") == i){
                    number = number + "0";
                    break;

                }
                else if (input.indexOf("one") == i){
                    number = number + "1";
                    break;

                }
                else if (input.indexOf("two") == i){
                    number = number + "2";
                    break;

                }
                else if (input.indexOf("three") == i){
                    number = number + "3";
                    break;

                }
                else if (input.indexOf("four") == i){
                    number = number + "4";
                    break;

                }
               else if (input.indexOf("five") == i){
                    number = number + "5";
                    break;

                }
                else if (input.indexOf("six") == i){
                    number = number + "6";
                    break;

                }
                else if (input.indexOf("seven") == i){
                    number = number + "7";
                    break;

                }
                else if (input.indexOf("eight") == i){
                    number = number + "8";
                    break;

                }
                else if (input.indexOf("nine") == i){
                    number = number + "9";
                    break;

                }

                else if (input.charAt(i) == '0') {
                    number = number + "0";
                    break;
                } else if (input.charAt(i) == '1') {
                    number = number + "1";
                    break;

                } else if (input.charAt(i) == '2') {
                    number = number + "2";
                    break;

                } else if (input.charAt(i) == '3') {
                    number = number + "3";
                    break;

                } else if (input.charAt(i) == '4') {
                    number = number + "4";
                    break;

                } else if (input.charAt(i) == '5') {
                    number = number + "5";
                    break;

                } else if (input.charAt(i) == '6') {
                    number = number + "6";
                    break;

                } else if (input.charAt(i) == '7') {
                    number = number + "7";
                    break;

                } else if (input.charAt(i) == '8') {
                    number = number + "8";
                    break;

                } else if (input.charAt(i) == '9') {
                    number = number + "9";
                    break;

                }

            }

            if(numcount >= 2) {
                for (int i = (input.length() - 1); i >= 0; i--) {

                    if (input.lastIndexOf("zero") == i){
                        number = number + "0";
                        break;

                    }
                    else if (input.lastIndexOf("one") == i){
                        number = number + "1";
                        break;

                    }
                    else if (input.lastIndexOf("two") == i){
                        number = number + "2";
                        break;

                    }
                    else if (input.lastIndexOf("three") == i){
                        number = number + "3";
                        break;

                    }
                    else if (input.lastIndexOf("four") == i){
                        number = number + "4";
                        break;

                    }
                    else if (input.lastIndexOf("five") == i){
                        number = number + "5";
                        break;

                    }
                    else if (input.lastIndexOf("six") == i){
                        number = number + "6";
                        break;

                    }
                    else if (input.lastIndexOf("seven") == i){
                        number = number + "7";
                        break;

                    }
                    else if (input.lastIndexOf("eight") == i){
                        number = number + "8";
                        break;

                    }
                    else if (input.lastIndexOf("nine") == i){
                        number = number + "9";
                        break;

                    }

                    else if (input.charAt(i) == '0') {
                        number = number + "0";
                        break;
                    } else if (input.charAt(i) == '1') {
                        number = number + "1";
                        break;

                    } else if (input.charAt(i) == '2') {
                        number = number + "2";
                        break;

                    } else if (input.charAt(i) == '3') {
                        number = number + "3";
                        break;

                    } else if (input.charAt(i) == '4') {
                        number = number + "4";
                        break;

                    } else if (input.charAt(i) == '5') {
                        number = number + "5";
                        break;

                    } else if (input.charAt(i) == '6') {
                        number = number + "6";
                        break;

                    } else if (input.charAt(i) == '7') {
                        number = number + "7";
                        break;

                    } else if (input.charAt(i) == '8') {
                        number = number + "8";
                        break;

                    } else if (input.charAt(i) == '9') {
                        number = number + "9";
                        break;

                    }

                }
            }
        }


                // read next line
                sum = sum + Integer.parseInt(number);
                number="";
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);

    }
}