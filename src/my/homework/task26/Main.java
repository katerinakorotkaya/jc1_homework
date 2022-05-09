package my.homework.task26;

public class Main {
    public static void main(String[] args) {
        FindPunctMarkInString findPunctMarkInString = new FindPunctMarkInString();
        findPunctMarkInString.findPunctMarkInString();
    }
}

class FindPunctMarkInString {

    public void findPunctMarkInString() {
        String str = "Checking for punctuation marks in text: The list of the most populous places in the world includes: " +
            "Shanghai, China; Mexico City Mexico; Moscow, Russia; New York, US; Tokyo, Japan.";
        int start = str.length();
        int finish = (str.replaceAll("[.,:;]", "").length());
        System.out.println("Quantity of the punctuation marks in text:" + (start - finish));
    }
}

