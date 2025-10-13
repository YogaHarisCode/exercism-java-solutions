class SqueakyClean {
    static String clean(String identifier) {
        String input = identifier.replace(' ', '_');
        StringBuilder builder = new StringBuilder();
        boolean toUpperCase = false;

        for (var c : input.toCharArray()){
            if (c == '-'){
                toUpperCase = true;
            } else if (Character.isLetterOrDigit(c) || c == '_'){
                if (toUpperCase){
                    builder.append(Character.toUpperCase(c));
                    toUpperCase = false;
                }else {
                    switch (c) {
                        case '4' -> c = 'a';
                        case '3' -> c = 'e';
                        case '0' -> c = 'o';
                        case '1' -> c = 'l';
                        case '7' -> c = 't';
                    }
                    builder.append(c);
                }

            }
        }

        return builder.toString();
    }
}
