import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");

        System.out.println("Original List: " + languages);

        String lang = languages.get(1);
        System.out.println("Element at index 1: " + lang);

        languages.remove("C++");

        System.out.println("Final List Size: " + languages.size());
        System.out.println("Updated List: " + languages);

        System.out.println("Looping: ");
        for(String s: languages){
            System.out.println(s + " ");
        }
    }
}