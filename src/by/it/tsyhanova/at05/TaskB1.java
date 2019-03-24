package by.it.tsyhanova.at05;


public class TaskB1 {
    public static void main(String[] args) {
        char[] vowels=new char[]{'а','е','ё','и','о','у','ы','э','ю','я','А','Е','Ё','И','О','У','Ы','Э','Ю','Я'};
        char[] consonants=new char[]{'б','в','г','д','ж','з','й','к','л','м','н','п','р','с','т','ф','х','ц','ч','ш','щ','З','Б','В','Г','Д','Ж','Й','К','Л','М','Н','П','Р','С','Т','Ф','Х','Ц','Ч','Ш','Щ'};
        char[] delimiters = new char[]{'.', ',', ' ', '?', '!', '-', '\t', '\n', '\r'};
        //создаем билдер для получения возможности изменять строку
        StringBuilder sb=new StringBuilder(Poem.text);
        //Вывести в консоль все слова текста, начинающихся согласной и
        // заканчивающихся гласной буквой
        // (нужно сделать для проверки этого условия приватный метод без regex)
        int lexemeCount = 0;
        int lastLexemeStart = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (charIsDelimiter(sb.charAt(i), delimiters)) {
                if (i - lastLexemeStart > 0) {
                    lexemeCount++;
                }
                lastLexemeStart = i + 1;
            } else if (i == sb.length() - 1) {
                lexemeCount++;
            }
        }

        String[] lexeme = new String[lexemeCount];
        lexemeCount = 0;
        lastLexemeStart = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (charIsDelimiter(sb.charAt(i), delimiters)) {
                if (i - lastLexemeStart > 0) {
                    lexeme[lexemeCount] = sb.substring(lastLexemeStart, i);
                    lexemeCount++;
                }
                lastLexemeStart = i + 1;
            } else if (i == sb.length() - 1) {
                lexeme[lexemeCount] = sb.substring(lastLexemeStart, i + 1);
            }
        }

        for (int i = 0; i < lexeme.length; i++) {
            boolean searchWord=false;
            for(int j=0;j<consonants.length;j++){
                if (lexeme[i].charAt(0) ==consonants[j]) {
                    searchWord=true;
                }
            }
            if(searchWord){
                for(int j=0;j<vowels.length;j++){
                    if (lexeme[i].charAt(lexeme[i].length()-1) ==vowels[j]){
                        System.out.println(lexeme[i]);
                    }
                }
            }
        }
    }
    private static boolean charIsDelimiter(char c, char[] delimiters) {
            for (int i = 0; i < delimiters.length; i++) {
                if (c == delimiters[i]) {
                    return true;
                }
            }
            return false;
    }
}
