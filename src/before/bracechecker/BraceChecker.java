package before.bracechecker;

public class BraceChecker {

    private Stack stack;
    private String resultMessage;

    public BraceChecker() {
        stack = new Stack();
        resultMessage = "No Error";
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void parse(String text) {

        char lastStackElement = 0;
        char ch = 0;
        int i = 0;
        lab:
        for (; i < text.length(); i++) {
            ch = text.charAt(i);
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case '}':
                    lastStackElement = (char)stack.pop();
                    if(lastStackElement != '{'){
                        break lab;
                    }
                    break;
                case ')':
                    lastStackElement = (char)stack.pop();
                    if (lastStackElement != '('){
                        break lab;
                    }
                    break;
                case ']':
                    lastStackElement = (char)stack.pop();
                    if (lastStackElement != '['){
                        break lab;
                    }
                    break;

                //TODO complete remaining cases
            }
        }

        if(i < text.length()) {
            if(lastStackElement == 0 ) {
                resultMessage = "Closed '" + ch + "' but not openned.";

                // closed but not openned
            } else {
                resultMessage = "Openned '" + lastStackElement + "' but closed '" + ch + "'.";
                // openned 'lastStackElement' but closed 'ch'
            }

        } else {
            if(!stack.isEmpty()) {
                resultMessage = "Openned '" + stack.pop() + "' but not closed.";
                //  openned but not closed
            }

        }


    }


}
