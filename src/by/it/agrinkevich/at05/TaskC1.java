package by.it.agrinkevich.at05;

public class TaskC1 {
    public static void main(String[] args) {
        String poem = new String(Poem.text);
        ///poem = poem.replaceAll("\\\\S*\\\\s\\\\S*", " ");
        String[] sentences = poem.split("\n");
        int maxLength = sentences[0].length();
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].length() > maxLength){
                maxLength = sentences[i].length();
            }
        }
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].length() < maxLength){
                StringBuilder str = new StringBuilder(sentences[i]);
                while (str.length() != maxLength) {
                    for (int j = 0; j < str.length(); j++) {
                        if (str.charAt(j) != ' ') continue;
                        if (str.charAt(j) == ' ') {
                            str.insert(j, ' ');
                            j++;
                        }
                        if (str.length() == maxLength) break;
                    }
                }
                sentences[i] = str.toString();
            }
        }
        String result = String.join("\n", sentences);
        System.out.println(result);
    }
}

