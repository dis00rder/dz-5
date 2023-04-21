import static java.lang.Character.toUpperCase;

public class strBuild {


        public static void main(String args[]){
            StringBuilder sb=new StringBuilder("I ");
            sb.append("would ");
            sb.append("like ");
            sb.append("to have ");
            sb.append("a dog");

            String finalStr =sb.toString();
            System.out.println(finalStr.toUpperCase());
        }


}

