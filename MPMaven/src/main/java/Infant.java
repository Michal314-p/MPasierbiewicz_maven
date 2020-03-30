public class Infant
{
    public String put_changes(String input){
        String output = input;

        output = output.replaceAll("rz", "ż");
        output = output.replaceAll("ch", "h");
        output = output.replaceAll("ó", "u");
        output = output.replaceAll("a", "ą");
        output = output.replaceAll("e", "ę");

        return output;
    }

}
