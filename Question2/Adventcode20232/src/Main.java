import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        String textnumber="";
        boolean possible = true;
        int green =0;
        int blue =0;
        int red = 0;
        String color ="";
        int game=0;
        int sum =0;
        int start;
        BufferedReader reader;
        String input;

        try {
            reader = new BufferedReader(new FileReader(".idea/Sample2.txt"));
            String line = reader.readLine();

            while (line != null) {
                possible = true;
                input = line;
                game++;

                if (game <10){
                    start =7;

                }else if (game < 100){
                    start =8;

                }else{
                    start =9;
                }

                for (int i = start; i < input.length(); i++){
                    if ((line.charAt(i) == '0') || (line.charAt(i) == '1')|| (line.charAt(i) == '2')|| (line.charAt(i) == '3')|| (line.charAt(i) == '4')|| (line.charAt(i) == '5')|| (line.charAt(i) == '6')|| (line.charAt(i) == '7')|| (line.charAt(i) == '8')|| (line.charAt(i) == '9')) {
                        textnumber = textnumber + line.charAt(i);

                    }else if (line.charAt(i) == ' '){


                    }else if ((line.charAt(i) == 'a') || (line.charAt(i) == 'b')|| (line.charAt(i) == 'c')|| (line.charAt(i) == 'd')|| (line.charAt(i) == 'e')|| (line.charAt(i) == 'f')|| (line.charAt(i) == 'g')|| (line.charAt(i) == 'h')|| (line.charAt(i) == 'i')|| (line.charAt(i) == 'j')|| (line.charAt(i) == 'k')|| (line.charAt(i) == 'l')|| (line.charAt(i) == 'm')|| (line.charAt(i) == 'n')|| (line.charAt(i) == 'o')|| (line.charAt(i) == 'p')|| (line.charAt(i) == 'q')|| (line.charAt(i) == 'r')|| (line.charAt(i) == 's')|| (line.charAt(i) == 't')|| (line.charAt(i) == 'u')|| (line.charAt(i) == 'v')|| (line.charAt(i) == 'w')|| (line.charAt(i) == 'x')|| (line.charAt(i) == 'y')|| (line.charAt(i) == 'z')) {

                        color = color + line.charAt(i);

                    }else if(line.charAt(i) == ';'){
                        if (color.equals( "red")){
                            red= Integer.parseInt(textnumber);


                        }
                        else if (color.equals("blue")){
                            blue= Integer.parseInt(textnumber);

                        }
                        else if (color.equals("green")){
                            green= Integer.parseInt(textnumber);

                        }


                        textnumber = "";
                        color = "";

                        if ((red > 12) || (green > 13) || (blue > 14)) {
                            possible = false;
                            red = 0;
                            green = 0;
                            blue = 0;
                            textnumber = "";
                            color = "";


                            break;

                        }else {
                            red = 0;
                            green = 0;
                            blue = 0;


                        }





                    }else if(line.charAt(i) == ','){
                        if (color.equals( "red")){
                            red= Integer.parseInt(textnumber);


                        }
                        else if (color.equals("blue")){
                            blue= Integer.parseInt(textnumber);

                        }
                        else if (color.equals("green")){
                            green= Integer.parseInt(textnumber);

                        }
                        textnumber = "";
                        color = "";

                    }

                    if (possible == false){

                        break;

                    }


                }


                if (possible == true){
                    sum = sum + game;
                    red = 0;
                    green = 0;
                    blue = 0;
                    textnumber = "";
                    color = "";
                }
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sum);





    }
}